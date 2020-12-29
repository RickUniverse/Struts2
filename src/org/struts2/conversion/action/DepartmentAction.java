package org.struts2.conversion.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.sun.xml.internal.ws.api.model.Parameter;
import org.struts2.conversion.model.Department;

/**
 * 类型转换与集合之间的转换
 * @author lijichen
 * @date 2020/11/1 - 19:59
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department>, Preparable {

    private static final long serialVersionUID = -2365201949588700665L;

    private Department department;

    @Override
    public String execute() throws Exception {
        System.out.println("Department:" + department);
        return "success";
    }
    public void prepareExecute() {
        department = new Department();
    }

    @Override
    public Department getModel() {
        return department;
    }

    @Override
    public void prepare() throws Exception {
        System.out.println("prepare....");
    }
}
