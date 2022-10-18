package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "app_customer";

    public void createTable(){
        try{
           // 1.load JDBC Driver
           Class.forName( "org.postgresql.Driver");
           //2.Establish connection with your local database
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres","5803");
            //3.Create statement object
            Statement stmt = con.createStatement();

            //4.Execute query
            // TODO - create table
            String sql = "Select * from " + TABLE_NAME;
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "( id bigint NOT NULL, "
                    +" name text,"
                    +" address text,"
                    +" phone_number bigint,"
                    +" city text,"
                    +" email_id text,"
                    +" CONSTRAINT app_customer_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);


            ResultSet rs = stmt.executeQuery(sql);

            //5.Traverse Resultset
            while(rs.next()){
                System.out.println(" Name = " + rs.getString("name"));
                System.out.println(" Address = " + rs.getString("address"));
                System.out.println("  Phone = " + rs.getString("phone_number"));
                System.out.println(" City = " + rs.getString("city"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
