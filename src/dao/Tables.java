/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class Tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st =null;
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
          //st.executeUpdate("create table appuser (appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobilenumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50))");            
          //st.executeUpdate("insert into appuser(userRole,name,mobilenumber,email,password,address,status) values('superAdmin','super Admin','12345','bharatgogurla@gmail.com','123456','india','Active')"); 
          //st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key,name varchar(200))");
          JOptionPane.showMessageDialog(null,"table created successfully");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){}
        }
    }
}