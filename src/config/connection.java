/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author SCC-COMLAB
 */
public class connection {
 connection con;
 Statement st;
 PreparedStatement pst;
 ResultSet rs;
   
   
    public connection getConnection(){  
            try{
                    con = (connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/house_rent", "root", "");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    }
                        return con;
                }    
    
}
