package org.struts2.conversion.converters;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsTypeConverter;

import javax.servlet.ServletContext;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author lijichen
 * @date 2020/11/1 - 19:00
 */
public class DateConverter extends StrutsTypeConverter {

    private DateFormat dateFormat;

    public DateConverter() {
        System.out.println("DateConverter's constructor...");
    }

    /*
    * 如果是以xwork-conversion.properties配置
    * 则是先创建了两次实例，所以需要使用该方法判断是否已经实例了
    * */
    public DateFormat getDateFormat() {
        if (dateFormat == null) {
            ServletContext servletContext = ServletActionContext.getServletContext();
            String pattern = servletContext.getInitParameter("pattern");
            dateFormat = new SimpleDateFormat(pattern);
        }
        return dateFormat;
    }

    /*
    * 将字符串转换为Date类型
    * */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        System.out.println("convertFromString...");
        if (toClass == Date.class) {
            if (values != null && values.length > 0) {
                String value = values[0];
                try {
                    return getDateFormat().parseObject(value);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        //如果没有转换成功，就返回values
        return values;
    }

    /*
    * 将Date类型转换为字符串
    * */
    @Override
    public String convertToString(Map context, Object o) {
        System.out.println("convertToString...");
        //如果是Date类型才能转换
        if (o instanceof Date) {
            Date date = (Date) o;
            return getDateFormat().format(date);
        }
        //转换失败返回null
        return null;
    }
}
