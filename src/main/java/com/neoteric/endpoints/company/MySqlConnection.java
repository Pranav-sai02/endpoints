package com.neoteric.endpoints.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlConnection {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/employeedb";
    private static final String userName = "root";
    private static final String password = "Count02";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

}
