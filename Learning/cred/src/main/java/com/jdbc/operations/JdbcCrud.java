package com.jdbc.operations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrud {
	
    private static final String INSERT_PRODUCT_SQL = "INSERT INTO product" +"(id, name, description, price) VALUES " +"(?, ?, ?, ?);";
    
    private static final String UPDATE_PRODUCT_SQL = "update product set name = ? where id = ?;";
    
    private static final String DELETE_PRODUCT_SQL = "delete from product where id = 48;";
    
   static {        
        System.out.println("In static");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
	    //Step1:Retrieve Data from Database
	    void retrieveData(Connection con) throws SQLException, InterruptedException{
	        Statement stmt=null;
	        try {
	            stmt=con.createStatement();
	            ResultSet rs=stmt.executeQuery("select * from Product");  
	            while(rs.next())  
	                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	                //Thread.sleep(1000);
	           
	            System.out.println("End");
	        }catch(Exception e) {
	            System.out.println(e.getMessage());
	        }finally{
	            if(stmt!=null)
	                stmt.close();
	        }
	    }
    
	  //Step2:Insert Data from Database
	    private void insertData(Connection conn) throws SQLException {
	       Statement stmt = conn.createStatement();
	     int result = stmt.executeUpdate("insert into product values('1','PencialBox','Apsara',300)");
	       
	    }
	    
	     
		 /* //Step2:Insert Data from Database using PreparedStatment(runtime)
		    private void insertDataUsingPreparedStatement(Connection newCon) throws SQLException {
	        PreparedStatement preparedStatement = newCon.prepareStatement(INSERT_PRODUCT_SQL);
	           preparedStatement.setInt(1, 4);
	           preparedStatement.setString(2, "Freeze");
	           preparedStatement.setString(3, "Phillips Freeze ");
	           preparedStatement.setInt(4, 15000);
	           //Step 3: Execute the query or update query
	           preparedStatement.executeUpdate();
	    }*/
	    
	    
	    //Step3:Update Data from Database
	    void updateData(Connection newCon) throws SQLException, InterruptedException{
	        Statement stmt=null;
	        PreparedStatement preparedStatement = newCon.prepareStatement(UPDATE_PRODUCT_SQL);
	        preparedStatement.setString(1, "Ankita");
	        preparedStatement.setInt(2, 10);
	        
	        int rowsUpdated = preparedStatement.executeUpdate();
	        if (rowsUpdated > 0) {
	            System.out.println("An existing user was updated successfully!");
	        }
	     }
	    
	    
	  //Step4:Delete Data from Database
	    void deleteData(Connection newCon) throws SQLException, InterruptedException{
	        Statement stmt=null;
	        Statement preparedStatement = newCon.createStatement();
            int result = preparedStatement.executeUpdate(DELETE_PRODUCT_SQL);
            
		    
	    }
	    
    public static void main(String args[]) throws SQLException, InterruptedException {
        // Singleton design pattern : Allow us to create only single instance.
        Connection newCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/apr23?characterEncoding=utf8","root","root");
        
        JdbcCrud prd=new JdbcCrud();
        prd.deleteData(newCon);
        prd.updateData(newCon);
        prd.retrieveData(newCon);
        prd.insertData(newCon);
        newCon.close();
    }
   


    

    

}