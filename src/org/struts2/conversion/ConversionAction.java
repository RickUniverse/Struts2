package org.struts2.conversion;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.struts2.conversion.model.Customer;

/**
 * @author lijichen
 * @date 2020/11/1 - 16:53
 */
public class ConversionAction extends ActionSupport
        implements ModelDriven<Customer>, Preparable {

    private static final long serialVersionUID = 4388767835551711553L;

    private Customer customer;

    public String execute() {
        System.out.println("Customer = " + customer);
        return "success";
    }
    public void prepareExecute() {
        customer = new Customer();
    }

    public ConversionAction() {
    }

    @Override
    public Customer getModel() {
        return customer;
    }

    @Override
    public void prepare() throws Exception {}
}
