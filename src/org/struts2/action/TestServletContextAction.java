package org.struts2.action;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lijichen
 * @date 2020/10/22 - 17:33
 */
public class TestServletContextAction {
    public String execute() {
        //获取请求对象
        HttpServletRequest request = ServletActionContext.getRequest();
        //获取session
        HttpSession session = request.getSession();
        //获取response
        HttpServletResponse response = ServletActionContext.getResponse();
        System.out.println(request);
        System.out.println(session);
        System.out.println(response);
        return "success";
    }
}
