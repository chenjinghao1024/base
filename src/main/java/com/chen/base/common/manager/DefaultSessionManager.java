package com.chen.base.common.manager;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.AbstractNativeSessionManager;
import org.apache.shiro.session.mgt.SessionContext;
import org.apache.shiro.session.mgt.SessionKey;

public class DefaultSessionManager extends AbstractNativeSessionManager {

    @Override
    public Session start(SessionContext context) {
        // 创建session，类型是SimpleSession
        Session session = createSession(context);
        // 设置session的timeout，也就是有效时间，默认30分钟
        applyGlobalSessionTimeout(session);
        onStart(session, context);
        // 通知session监听器
        notifyStart(session);
        //Don't expose the EIS-tier Session object to the client-tier:
        // 创建对外暴露的session，SimpleSession的代理；类型是DelegatingSession，持有sessionManager的引用
        return createExposedSession(session, context);
    }

    @Override
    protected Session createSession(SessionContext sessionContext) throws AuthorizationException {
        return null;
    }

    @Override
    protected Session doGetSession(SessionKey sessionKey) throws InvalidSessionException {
        return null;
    }
}
