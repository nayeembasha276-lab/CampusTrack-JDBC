package com.example.capstonejdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/student_project";
    private static final String userName ="root";
    private static final String password = System.getenv("MYSQL_PASSWORD");
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,userName,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
