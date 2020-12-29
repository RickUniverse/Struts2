package org.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author lijichen
 * @date 2020/11/6 - 15:37
 */
public class MyInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        System.out.println("invoke intercept before");

        String result = invocation.invoke();

        System.out.println("invoke intercept after");

        return result;
    }
}
