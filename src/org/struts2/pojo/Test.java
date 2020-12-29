package org.struts2.pojo;

/**
 * @author lijichen
 * @date 2020/10/26 - 17:44
 */
public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
