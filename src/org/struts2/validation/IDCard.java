package org.struts2.validation;

/**
 * @author lijichen
 * @date 2020/11/4 - 17:24
 */
public class IDCard {
    public boolean Verify(String iDCard) {
        if ("123456789".equals(iDCard)) {
            return true;
        }
        return false;
    }
}
