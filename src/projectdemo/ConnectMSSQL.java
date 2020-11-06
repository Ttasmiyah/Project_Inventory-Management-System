/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMSSQL {
    
    
            
    public Connection connectDB() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=inventory_management_system;selectMethod=cursor", "sa", "123456");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
//    public static void main(String[] args) {
//        ConnectMSSQL cnObj = new ConnectMSSQL();
//        cnObj.connectDB();
//    }
    
}