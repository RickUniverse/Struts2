package org.struts2.validation;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * @author lijichen
 * @date 2020/11/4 - 17:27
 */
public class IDCardValidator extends FieldValidatorSupport {
    @Override
    public void validate(Object object) throws ValidationException {
        //获取字段的名字和值
        String fieldName = getFieldName();
        Object value = this.getFieldValue(fieldName, object);

        //验证
        if (!new IDCard().Verify((String) value)){
            //如果验证失败
            addFieldError(fieldName, object);
        }
    }
}
