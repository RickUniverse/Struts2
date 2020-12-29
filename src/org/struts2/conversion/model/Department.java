package org.struts2.conversion.model;

import java.util.Collection;

/**
 * @author lijichen
 * @date 2020/11/1 - 19:55
 */
public class Department {
    private int departmentId;
    private Manager manager;
    private Collection<Customer> customers;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", manager=" + manager +
                ", customers=" + customers +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }

    public Department() {
    }

    public Department(int departmentId, Manager manager, Collection<Customer> customers) {
        this.departmentId = departmentId;
        this.manager = manager;
        this.customers = customers;
    }
}
