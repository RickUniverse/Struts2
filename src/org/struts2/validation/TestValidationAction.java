package org.struts2.validation;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author lijichen
 * @date 2020/11/2 - 17:51
 */
public class TestValidationAction extends ActionSupport {

    private int age;

    private String password;

    private Integer Count;

    private String iDCard;

    @Override
    public String toString() {
        return "TestValidationAction{" +
                "age=" + age +
                ", password='" + password + '\'' +
                ", Count=" + Count +
                ", iDCard='" + iDCard + '\'' +
                ", password2='" + password2 + '\'' +
                '}';
    }

    public String getiDCard() {
        return iDCard;
    }

    public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    @Override
    public String execute() throws Exception {

        System.out.println("This:"+this);

        return SUCCESS;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public TestValidationAction(int age, String password, String password2) {
        this.age = age;
        this.password = password;
        this.password2 = password2;
    }

    private String password2;



    public TestValidationAction(int age) {
        this.age = age;
    }

    public TestValidationAction() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
