/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;




import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            c =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=hms;user=b;password=1234"); 
            
            s =c.createStatement();  
                    
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
