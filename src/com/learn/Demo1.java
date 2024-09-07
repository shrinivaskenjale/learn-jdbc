package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, "root", "Root");

            // Create the statement
            Statement statement = conn.createStatement();

            // Execute the statement
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            int totalSalary = 0;
            // Process the result
            while (resultSet.next()) {
                // Get string in column "name"
                System.out.println(resultSet.getString("name"));

                // Can also access using column index - starts from 1
                // System.out.println(resultSet.getString(2));

                totalSalary += resultSet.getInt("salary");
            }
            System.out.println("Total salary: " + totalSalary);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
 * java.sql package
 */