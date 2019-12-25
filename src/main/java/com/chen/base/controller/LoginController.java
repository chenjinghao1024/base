package com.chen.base.controller;


import com.chen.base.entity.SysUser;
import com.chen.base.entity.vo.RegisterVO;
import com.chen.base.entity.vo.ResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * created by CaiBaoHong at 2018/4/17 16:41<br>
 *
 * @author Administrator
 */
@Controller
public class LoginController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);


    /**
     * 登录接口，由于UserService中是模拟返回用户信息的，
     * 所以用户名随意，密码123456
     *
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public ResultVO login(String userName, String password) {

        String oper = "user login";

        if (StringUtils.isEmpty(userName)) {
            return ResultVO.fail(oper, "用户名不能为空");
        }
        if (StringUtils.isEmpty(password)) {
            return ResultVO.fail(oper, "密码不能为空");
        }

        Subject currentUser = SecurityUtils.getSubject();

        try {
            //登录
            currentUser.login(new UsernamePasswordToken(userName, password));

            //从session取出用户信息
            SysUser user = (SysUser) currentUser.getPrincipal();
            if (user == null) {
                throw new AuthenticationException();
            }

            //返回登录用户的信息给前台，含用户的所有角色和权限
            return ResultVO.succ(oper)
                    .data("id", user.getId())
                    .data("nick", user.getNickName())
                    .data("roles", user.getRoles())
                    .data("perms", user.getPermissions());

        } catch (UnknownAccountException uae) {
            log.warn("用户帐号不正确");
            return ResultVO.fail(oper, "用户帐号或密码不正确");

        } catch (IncorrectCredentialsException ice) {
            log.warn("用户密码不正确");
            return ResultVO.fail(oper, "用户帐号或密码不正确");

        } catch (LockedAccountException lae) {
            log.warn("用户帐号被锁定");
            return ResultVO.fail(oper, "用户帐号被锁定不可用");

        } catch (AuthenticationException ae) {
            log.warn("登录出错");
            return ResultVO.fail(oper, "登录失败：" + ae.getMessage());
        }

    }

    @PostMapping("/logout")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "login";
    }


    @PostMapping("/registered")
    @ResponseBody
    public String registered(RegisterVO register) {
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
        register.setSalt(salt);
        return "login";
    }


}
