package org.struts2.app;

import java.util.*;

/**
 * @author lijichen
 * @date 2020/10/27 - 19:32
 */
public class Dao {

    private static Map<Integer,Employee> employeeMap = new HashMap<>();
    private static final List<String> ROLE_LIST = Arrays.asList("1","2");

    static {
        employeeMap.put(1001,new Employee(1001,"张三","123","0","1",ROLE_LIST,"描述"));
        employeeMap.put(1002,new Employee(1002,"张三","123","1","2",ROLE_LIST,"描述2"));
        employeeMap.put(1003,new Employee(1003,"张三","123","0","3",ROLE_LIST,"描述3"));
        employeeMap.put(1004,new Employee(1004,"张三","123","1","1",ROLE_LIST,"描述4"));
        employeeMap.put(1005,new Employee(1005,"张三","123","0","1",ROLE_LIST,"描述5"));
        employeeMap.put(1006,new Employee(1006,"张三","123","1","2",ROLE_LIST,"描述6"));
    }


    //获取所有员工
    public List<Employee> list() {
        return new ArrayList(employeeMap.values());
    }

    //删除一个员工
    public Employee delete(Integer employeeId) {
        return employeeMap.remove(employeeId);
    }

    //添加一个员工
    public Employee add(Employee employee) {
        int id = (int) System.currentTimeMillis();
        employee.setId(id);
        return employeeMap.put(id,employee);
    }
    //修改员工
    public Employee update(Employee employee) {
        return employeeMap.put(employee.getId(),employee);
    }
    //获取一个员工
    public Employee get(Integer id) {
        return employeeMap.get(id);
    }

    public List<Department> getDepartments() {
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1,"社工部"));
        departmentList.add(new Department(2,"社工部2"));
        departmentList.add(new Department(3,"社工部3"));
        departmentList.add(new Department(4,"社工部4"));
        return departmentList;
    }
    public List<Role> getRoles() {
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1,"管理员"));
        roleList.add(new Role(2,"管理员2"));
        roleList.add(new Role(3,"管理员3"));
        return roleList;
    }
}
