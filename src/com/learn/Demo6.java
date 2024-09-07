package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo6 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, "root", "Root");

            // Create the prepared statement
            PreparedStatement statement = conn.prepareStatement("insert into employees_tbl values(?, ?, ?, ?)");

            // Set parameters in prepared statement
            statement.setInt(1, 900);
            statement.setString(2, "Peter");
            statement.setString(3, "HR");
            statement.setInt(4, 4000);

            // Execute the statement
            int rowsAffected = statement.executeUpdate();

            // Process the result
            System.out.println(rowsAffected + " records were inserted.");

        } catch (SQLException e) {
            System.out.println("XXXXXXXXXXXXX");
            e.printStackTrace();
        }
    }
}

/*
 * java.sql package
 * 
 * setXXX() methods
 * First parameter is index of ?, which is 1 based.
 * Second parameter is value that we want to set.
 * 
 * executeUpdate() returns:
 * either (1) the row count for SQL Data Manipulation Language (DML) statements
 * or (2) 0 for SQL statements that return nothing.
 * 
 * ==================
 * preparedStatement.executeUpdate():
 * Executes the SQL statement in this PreparedStatement object, which must be an
 * SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or
 * DELETE; or an SQL statement that returns nothing, such as a DDL statement.
 * 
 * statement.executeUpdate(sql):
 * Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE
 * statement or an SQL statement that returns nothing, such as an SQL DDL
 * statement.
 * Note: This method cannot be called on a PreparedStatement or
 * CallableStatement.
 * 
 * =================
 */