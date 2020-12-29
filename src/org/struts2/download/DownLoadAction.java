package org.struts2.download;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author lijichen
 * @date 2020/11/4 - 21:02
 */
public class DownLoadAction extends ActionSupport {
    private String contentType;
    private long contentLength;
    private String contentDisposition;

    private InputStream inputStream;


    @Override
    public String execute() throws Exception {

        contentType = "text/html";
        contentDisposition = "attachment;filename=hidden.html";

        ServletContext servletContext = ServletActionContext.getServletContext();
        String fileName = servletContext.getRealPath("/files/hidden.html");
        inputStream = new FileInputStream(fileName);
        contentLength = inputStream.available();

        return SUCCESS;
    }

    public DownLoadAction() {
    }

    public DownLoadAction(String contentType, long contentLength, String contentDisposition, InputStream inputStream) {
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.contentDisposition = contentDisposition;
        this.inputStream = inputStream;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public String toString() {
        return "DownLoadAction{" +
                "contentType='" + contentType + '\'' +
                ", contentLength=" + contentLength +
                ", contentDisposition='" + contentDisposition + '\'' +
                ", inputStream=" + inputStream +
                '}';
    }
}
