package org.struts2.app;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

/**
 * @author lijichen
 * @date 2020/10/27 - 19:37
 */
public class EmployeeAction implements RequestAware, ModelDriven<Employee>, Preparable {
    public EmployeeAction() {
    }

    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    private Map<String, Object> request = null;
    private Dao dao = new Dao();

    private Employee employee;


    public String add() {

        dao.add(employee);

        return "success-add";
    }
    public void prepareAdd() {
        employee = new Employee();
    }

    //专注跳转
    public String edit() {
        this.request.put("departments",dao.getDepartments());
        this.request.put("roles",dao.getRoles());
        return "edit-success";
    }
    public void prepareEdit() {
        //栈顶数据为要修改的实例值
        employee = dao.get(id);
    }

    //修改后跳转到页面
    public String update() {

        dao.update(employee);

        return "success-update";
    }
    //指定Employee实例的方式,prepareUpdate第二个但是Update首字母必须大写
    public void prepareUpdate() {
        employee = new Employee();
    }

    //修改删除后跳转到该action对应jsp页面
    public String list() {

        this.request.put("departments",dao.getDepartments());
        this.request.put("roles",dao.getRoles());
        request.put("employeeList",dao.list());

        return "list-success";
    }

    //删除
    public String delete() {

        dao.delete(this.id);//

        return "success-delete";
    }

    public String input() {

        this.request.put("departments",dao.getDepartments());
        this.request.put("roles",dao.getRoles());

        return "input-success";
    }

    public String save() {
        return "save-success";
    }

    @Override
    public String toString() {
        return "EmployeeAction{" +
                "employee=" + employee +
                '}';
    }
    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public Employee getModel() {
        return employee;
    }

    @Override
    public void prepare() throws Exception {
        System.out.println("prepare....");
    }
}
