package com.tutorialpoint.dbconnect;

import oracle.jdbc.OracleConnection;


import java.sql.*;
import java.util.Properties;

//@SpringBootApplication
public class Main {

   

    public static void main(String[] args) throws ClassNotFoundException {

          Class.forName("oracle.jdbc.driver.OracleDriver");

        Properties properties = new Properties();
        properties.setProperty("user", "system");
        properties.setProperty("password", "system");
        properties.setProperty(OracleConnection.CONNECTION_PROPERTY_THIN_NET_CONNECT_TIMEOUT, "10000");

        try {
        //    LOG.info("****** Starting JDBC Connection test *******");
            String sqlQuery = "select sysdate from dual";

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", properties);
            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            System.out.println("Running SQL query: [{}]"+ sqlQuery);
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
            	System.out.println("Result of SQL query: [{}]"+ resultSet.getString(1));
            }

            statement.close();
            conn.close();

            System.out.println("JDBC connection test successful!");
        } catch (SQLException ex) {
           System.out.println("Exception occurred connecting to database: {}"+ ex.getMessage());
        	System.out.println(ex);
        }
    }
}