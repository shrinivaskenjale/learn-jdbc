package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, "root", "Root");

            // Create the statement
            Statement statement = conn.createStatement();

            // Execute the statement
            int rowsAffected = statement
                    .executeUpdate("delete from employees_tbl where id = 800");

            // Process the result
            System.out.println(rowsAffected + " records were deleted.");

        } catch (SQLException e) {
            System.out.println("XXXXXXXXXXXXX");
            e.printStackTrace();
        }
    }
}

/*
 * java.sql package
 * 
 * executeUpdate() returns:
 * either (1) the row count for SQL Data Manipulation Language (DML) statements
 * or (2) 0 for SQL statements that return nothing
 */