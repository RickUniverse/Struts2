package org.struts2.i18n;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Date;

/**
 * @author lijichen
 * @date 2020/11/2 - 14:41
 */
public class TestI18nAction extends ActionSupport {

    private static final long serialVersionUID = 1333651997029142450L;
    private Date date;


    @Override
    public String execute() throws Exception {

        date = new Date();

        String i18nUsername = getText("username");
        System.out.println(i18nUsername);

        //带占位符的
        String time = getText("time", Arrays.asList(date));
        System.out.println(time);


        return SUCCESS;
    }




    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TestI18nAction() {
    }
}
