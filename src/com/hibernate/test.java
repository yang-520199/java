package com.hibernate;
import java.sql.*;
public class test {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("驱动连接失败");
        }
        try {
            String url="jdbc:mysql://localhost:3306/report?&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
            String user="root";
            String password="yx522732";
            Connection connection=DriverManager.getConnection(url,user,password);

        } catch (SQLException throwables) {
            System.out.println("连接失败");
            throwables.printStackTrace();
        }
//        System.out.println("连接失败");
    }
}