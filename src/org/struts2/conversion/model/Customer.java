package org.struts2.conversion.model;

import java.util.Date;

/**
 * @author lijichen
 * @date 2020/11/1 - 18:41
 */
public class Customer {
    private int age;
    private Date birth;

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", birth=" + birth +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Customer() {
    }

    public Customer(int age, Date birth) {
        this.age = age;
        this.birth = birth;
    }

}
