package org.struts2.conversion.model;

import java.util.Date;

/**
 * @author lijichen
 * @date 2020/11/1 - 19:55
 */
public class Manager {
    private int managerId;
    private Date date;

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", date=" + date +
                '}';
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Manager() {
    }

    public Manager(int managerId, Date date) {
        this.managerId = managerId;
        this.date = date;
    }
}
