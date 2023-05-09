package com.jdbc.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveProduct implements Runnable {
	
	public void run() {
	        System.out.println("Start Retrieving the products...");
	        Statement stmt=null;
	    
     try {
    	 
    	 for(int i=0;i<100;i++) {
    		 ConnectionPool newCon=MyConnectionPool.getConnection();
    		 stmt=newCon.con.createStatement();
    		 
	    		 ResultSet rs = stmt.executeQuery("select count(*) as count from product");
	        
	          	 while(rs.next()) {
	          	    System.out.println("The count is " + rs.getInt("count"));
	          	    Thread.sleep(1000);
	          	  }
    		 }  	 
     }catch(Exception e) {
         System.out.println(e.getMessage());
     }finally{
         if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
     }
     System.out.println("Retrieved completed...");
 }

	
}
