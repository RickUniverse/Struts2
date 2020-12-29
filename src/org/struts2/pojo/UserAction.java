package org.struts2.pojo;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author lijichen
 * @date 2020/10/22 - 18:19
 */
public class UserAction implements SessionAware, ApplicationAware {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String logout() {
        //在线人数-1
        Integer count = (Integer) application.get("count");
        if (count != null && count > 0) {
            count--;
            application.put("count",count);
        }

        //使session失效
        ((SessionMap) session).invalidate();

        return "logout-success";
    }

    public String login() {

        if ((String) session.get("username") != null) {
            return "username-exist";
        }
        session.put("username",username);
        Integer count = (Integer) application.get("count");
        if (count == null) {
            count = 0;
        }
        count++;
        application.put("count",count);

        return "login-success";
    }

    private Map<String, Object> session = null;
    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    private Map<String, Object> application = null;
    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }
}
