/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DAO {
    private final static String DB_CLASS_NAME = "org.mariadb.jdbc.Driver";
    private final static String DB_URL = "jdbc:mariadb://localhost:3306/gara";
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "123123qwe";
    public Connection connectionToDB;


    public DAO() {
        if(connectionToDB == null){
//            String dbUrl = "jdbc:mariadb://localhost:3306/gara";
//            String dbClass = "org.mariadb.jdbc.Driver";
           
            try {
                Class.forName(DB_CLASS_NAME);
                connectionToDB = DriverManager.getConnection (DB_URL, DB_USER, DB_PASSWORD);
                System.out.println("Success");
            }catch(ClassNotFoundException | SQLException e) {
                System.out.println("Failed");
            }
        }
    }
    
}
