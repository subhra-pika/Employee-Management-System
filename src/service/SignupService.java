/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */
import java.sql.*;

public class SignupService {
    public static boolean addEmp(String name,String email,String password,String address){
        try{
            Connection cn=repository.Connectiondb.getConnectiondb();
            Statement st=cn.createStatement();
            st.executeUpdate("insert into user_table values('"+name+"' , '"+email+"' , '"+password+"' , '"+address+"')");
            return true;
        }catch(Exception ee){
            ee.printStackTrace();
        }
        return false;
    }
}
