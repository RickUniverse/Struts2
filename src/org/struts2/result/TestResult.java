package org.struts2.result;

/**
 * @author lijichen
 * @date 2020/10/26 - 15:40
 */
public class TestResult {

    private Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String execute() {
        if (number == 1)
            return "success";
        else if (number == 2)
            return "login";
        else if (number == 3)
            return "index";
        else
            return "index2";
    }
}
