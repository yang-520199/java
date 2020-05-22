package com.hibernate;

public class Student {
    private Integer id;
    private String sno;
    private String sname;
    private int sage;
    private String major;
    public Student() {

    }
    public Student(String sno,String sname,int sage,String major){
        this.sno=sno;
        this.sname=sname;
        this.sage=sage;
        this.major=major;
    }
    public void setId(Integer id){this.id=id;}
    public void setSno(String sno){
        this.sno=sno;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public void setSage(int sage){
        this.sage=sage;
    }
    public void setMajor(String major){
        this.major=major;
    }

    public String getSno() {
        return this.sno;
    }
    public String getSname(){
        return this.sname;
    }
    public int getSage(){
        return this.sage;
    }
    public String getMajor(){
        return this.major;
    }

    public Integer getId() {
        return this.id;
    }
}
