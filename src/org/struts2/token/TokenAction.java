package org.struts2.token;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author lijichen
 * @date 2020/11/6 - 15:00
 */
public class TokenAction extends ActionSupport {

    private String username;

    @Override
    public String execute() throws Exception {

        System.out.println(username);

        return super.execute();
    }

    public TokenAction() {
    }

    public TokenAction(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "TokenAction{" +
                "username='" + username + '\'' +
                '}';
    }
}
