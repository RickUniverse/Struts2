package org.struts2.action;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

/**
 * @author lijichen
 * @date 2020/10/22 - 16:07
 */
public class TestActionContextAction {
    public String execute() {

        //0,获取ActionContext对象
        //ActionContext 是Action上下文对象，可以从中获取到Action需要的一切信息
        ActionContext actionContext = ActionContext.getContext();

        //1,获取application 对应的map，并向其中添加一个属性
        Map<String, Object> applicationMap = actionContext.getApplication();
        applicationMap.put("applicationKey","ApplicationValue");
        
        //获取属性
        Object date = applicationMap.get("date");
        System.out.println(date);

        //2.获取session 对应的map
        Map<String, Object> sessionMap = actionContext.getSession();
        //添加
        sessionMap.put("sessionKey","sessionValue");

        //3,获取request 对应的map
        Map<String,Object> requestMap = (Map<String, Object>) actionContext.get("request");
        requestMap.put("requestKey","requestValue");

        //4,获取请求参数对应的map
        //键：请求参数的名字，值：请求参数的值对应的字符串数组
        Map<String, Object> parametersMap = actionContext.getParameters();
        //写入数据无效
        parametersMap.put("parameterKey","parameterValue");
        System.out.println(((String[]) parametersMap.get("name"))[0]);
        System.out.println(((String[]) parametersMap.get("name"))[1]);

        return "success";
    }
}
