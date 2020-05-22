package com.action;
import com.opensymphony.xwork2.ActionSupport;
public class Hello extends ActionSupport {
    private String message;
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
        @Override
    public String execute() throws  Exception{

        setMessage("hello struts user ");
        if (userName!=null){
            setMessage(getMessage()+"\t"+userName);
        }
        return SUCCESS;
        }
    private String userName;
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
}
