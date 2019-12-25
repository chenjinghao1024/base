package com.chen.base.util;

import com.chen.base.entity.SysUser;
import org.apache.catalina.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.thymeleaf.util.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Administrator
 */
public class CommonUtil {



    public static String formatter(Date date){
        SimpleDateFormat yyyymmFormatter = new SimpleDateFormat("yyyyMM");
        return yyyymmFormatter.format(date);
    }
}
