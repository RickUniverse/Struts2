package org.struts2.pojo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * 产品类
 * @author lijichen
 * @date 2020/10/21 - 16:25
 */
public class Product implements RequestAware, SessionAware {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String save() {
        System.out.println("save:" + this);
        /*
        * 值栈
        * */
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.push(new Test("push in valueStack"));

        int i = 10 / 0;

        this.request.put("request",this);
        this.session.put("session",new Test("push in valueStack"));
        return "detail";
    }
    public String test() {
        /*System.out.println("success run");*/
        this.id = 1001;
        this.name = "张三";

        return "success";
    }
    public Product() {
        /*System.out.println("create one single");*/
    }

    private Map<String, Object> request = null;
    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    private Map<String, Object> session = null;
    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
