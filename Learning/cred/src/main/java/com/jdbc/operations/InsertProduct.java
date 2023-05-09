package com.jdbc.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertProduct implements Runnable{

    private static final String INSERT_PRODUCT_SQL = 
    		"INSERT INTO product" +"  (id, name, description, price) VALUES " +" (?, ?, ?, ?);";
   
    public void run() {
        System.out.println("Start Inserting the products...");
        
        try {
            ConnectionPool newCon=MyConnectionPool.getConnection();
           
            for(int i=10;i<30;i++) {
            	PreparedStatement preparedStatement = newCon.con.prepareStatement(INSERT_PRODUCT_SQL);
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "Bed_"+i);
                preparedStatement.setString(3, "Top Furniture_"+i);
                preparedStatement.setInt(4, 15000);
               
              
                preparedStatement.executeUpdate();
                Thread.sleep(10);
               
            }
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Insert completed...");
       
    }
}

