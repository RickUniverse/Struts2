package org.struts2.filter;

import org.struts2.pojo.Product;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author lijichen
 * @date 2020/10/21 - 16:27
 */
@Deprecated
public class FilterDispatcher implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //类型转换
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String servletPath = request.getServletPath();
        System.out.println(servletPath);

        String path = null;

        if ("/product-input.action".equals(servletPath)) {
            path = "/pages/filters/input.jsp";
        }

        if ("/product-save.action".equals(servletPath)) {
            path = "/pages/filters/detail.jsp";

            request.setAttribute("product",new Product(Integer.parseInt(request.getParameter("id")),
                    request.getParameter("name")));
        }

        if (path != null) {
            request.getRequestDispatcher(path).forward(servletRequest,servletResponse);
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
