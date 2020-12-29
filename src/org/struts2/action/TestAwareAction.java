package org.struts2.action;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * @author lijichen
 * @date 2020/10/22 - 16:57
 */
public class TestAwareAction implements ApplicationAware, SessionAware, RequestAware, ParameterAware {

    private Map<String, Object> applicationMap = null;
    private Map<String, Object> sessionMap = null;
    private Map<String, Object> requestMap = null;
    private Map<String, String[]> parameterMap = null;

    public String save() {
        sessionMap.put("sessionKey","sessionValue");
        return "save";
    }

    public String invalidate() {

        if (sessionMap instanceof SessionMap) {
            SessionMap sessionM = (SessionMap) sessionMap;
            sessionM.invalidate();
            System.out.println("session失效了");
        }

        return "invalidate";
    }

    public String execute() {
        System.out.println(applicationMap.get("date"));
        return "success";
    }



    @Override
    public void setApplication(Map<String, Object> application) {
        this.applicationMap = application;
    }

    @Override
    public void setParameters(Map<String, String[]> parameters) {
        this.parameterMap = parameters;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.requestMap = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.sessionMap = session;
    }
}
