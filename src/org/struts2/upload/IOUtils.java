package org.struts2.upload;

import java.io.*;

/**
 * @author lijichen
 * @date 2020/11/4 - 19:01
 */
public class IOUtils {
    public static void fileUpload(String inFile, String toFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File(inFile));
            fos = new FileOutputStream(new File(toFile));

            byte[] buffer = new byte[1024];
            int len = 0;
            while (((len = fis.read()) != -1)) {
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
