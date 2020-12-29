package org.struts2.app;

import java.util.List;

/**
 * @author lijichen
 * @date 2020/10/31 - 17:48
 */
public class Employee {
    private Integer id;
    private String name;
    private String password;
    private String gender;
    private String dept;
    private List<String> roles;
    private String desc;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", roles=" + roles +
                ", desc='" + desc + '\'' +
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Employee() {
    }

    public Employee(Integer id, String name, String password, String gender, String dept, List<String> roles, String desc) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.dept = dept;
        this.roles = roles;
        this.desc = desc;
    }
}
