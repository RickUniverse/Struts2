package org.struts2.valuestack;

import com.opensymphony.xwork2.ActionContext;

import java.util.List;

/**
 * @author lijichen
 * @date 2020/10/27 - 18:05
 */
public class UserAction {
    private int id;
    private String username;
    private String password;
    private String desc;
    private boolean married = true;

    private String gender;
    /*
    * 多选框使用集合
    * */
    private List<String> cities;
    private String age;

    //action
    public String save() {
        System.out.println(this);
        UserAction userAction = new UserAction(123,"王五","123","描述！");
        //保存到栈顶
//        ActionContext.getContext().getValueStack().push(userAction);
        return "success";
    }

    @Override
    public String toString() {
        return "UserAction{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", desc='" + desc + '\'' +
                ", married=" + married +
                ", gender='" + gender + '\'' +
                ", cities=" + cities +
                ", age='" + age + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserAction(int id, String username, String password, String desc, boolean married, String gender, List<String> cities, String age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.desc = desc;
        this.married = married;
        this.gender = gender;
        this.cities = cities;
        this.age = age;
    }



    public UserAction(int id, String username, String password, String desc, boolean married) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.desc = desc;
        this.married = married;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UserAction(int id, String username, String password, String desc) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.desc = desc;
    }

    public UserAction() {
    }
}
