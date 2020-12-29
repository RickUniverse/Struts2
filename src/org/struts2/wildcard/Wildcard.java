package org.struts2.wildcard;

/**
 * @author lijichen
 * @date 2020/10/26 - 16:32
 */
public class Wildcard {
    public String update() {
        System.out.println("update");
        return "update-success";
    }
    public String add() {
        System.out.println("add");
        return "add-success";
    }
    public String query() {
        System.out.println("query");
        return "query-success";
    }
    public String delete() {
        System.out.println("delete");
        return "delete-success";
    }
}
