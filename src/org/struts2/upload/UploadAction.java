package org.struts2.upload;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/4 - 18:41
 */
public class UploadAction extends ActionSupport {

    private static final long serialVersionUID = -6140241141968332835L;
    //上传的文件路径
    private List<File> ppt;
    //文件类型
    private List<String> pptContentType;
    //文件名
    private List<String> pptFileName;

    private List<String> desc;

    @Override
    public String execute() throws Exception {

        System.out.println(ppt);
        System.out.println(pptContentType);
        System.out.println(pptFileName);
        System.out.println(desc);

        saveUploadFile();

        return super.execute();
    }

    /**
     * 保存到服务器
     */
    public void saveUploadFile() {
        //获取项目上下文
        ServletContext servletContext = ServletActionContext.getServletContext();
        //选择保存后的地址
        String realPath = servletContext.getRealPath("/files/");
        if (pptFileName != null && pptFileName.size() > 0) {
            for (int i = 0; i < pptFileName.size(); i++) {
//            System.out.println(ppt.get(i).getPath());
//            System.out.println(realPath+pptFileName.get(i));
                IOUtils.fileUpload(ppt.get(i).getPath(),realPath + pptFileName.get(i));
            }
        }
    }

    public UploadAction() {
    }

    public UploadAction(List<File> ppt, List<String> pptContentType, List<String> pptFileName, List<String> desc) {
        this.ppt = ppt;
        this.pptContentType = pptContentType;
        this.pptFileName = pptFileName;
        this.desc = desc;
    }

    public List<File> getPpt() {
        return ppt;
    }

    public void setPpt(List<File> ppt) {
        this.ppt = ppt;
    }

    public List<String> getPptContentType() {
        return pptContentType;
    }

    public void setPptContentType(List<String> pptContentType) {
        this.pptContentType = pptContentType;
    }

    public List<String> getPptFileName() {
        return pptFileName;
    }

    public void setPptFileName(List<String> pptFileName) {
        this.pptFileName = pptFileName;
    }

    public List<String> getDesc() {
        return desc;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UploadAction{" +
                "ppt=" + ppt +
                ", pptContentType=" + pptContentType +
                ", pptFileName=" + pptFileName +
                ", desc='" + desc + '\'' +
                '}';
    }
}
