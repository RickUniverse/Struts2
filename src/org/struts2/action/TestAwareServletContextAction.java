package org.struts2.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author lijichen
 * @date 2020/10/22 - 17:38
 */
public class TestAwareServletContextAction implements ServletRequestAware, ServletContextAware, ServletResponseAware {

    private HttpServletRequest request = null;
    private HttpServletResponse response = null;
    private ServletContext servletContext = null;

    public String execute(){
        System.out.println(request.getSession());
        return "success";
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        System.out.println(request);
        this.request = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        System.out.println(response);
        this.response = response;
    }

    @Override
    public void setServletContext(ServletContext context) {
        System.out.println(context);
        servletContext = context;
    }
}
