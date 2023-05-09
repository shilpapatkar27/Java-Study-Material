package com.jdbc.operations;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveProductData_AutoCommit {
    private static final String INSERT_PRODUCT_SQL = "INSERT INTO product" +
            "  (id, name, description, prize) VALUES " +
            " (?, ?, ?, ?);";
    static {        
        System.out.println("In static");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
   
    public static void main(String args[]) throws SQLException, InterruptedException {
        // Singleton design pattern : Allow us to create only single instance.
       
        /*    When a connection is created, it is in auto-commit mode.
         *  This means that each individual SQL statement is treated as a transaction and is automatically
         *  committed right after it is executed.
         */
        Connection newCon=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/apr23?characterEncoding=utf8","root","password");
        RetrieveProductData_AutoCommit prd=new RetrieveProductData_AutoCommit();
       
        //prd.insertData(newCon);
       
        // By default auto-commit is true
        prd.insertDataUsingPreparedStatement(newCon);
       
        prd.insertDataUsingPreparedStatementWithAutoCommitFalse(newCon);
       
        prd.retrieveData(newCon);
       
        // Make sure to close the connection
        newCon.close();
    }
   
    private void insertDataUsingPreparedStatementWithAutoCommitFalse(Connection newCon) throws SQLException {
        //auto-commit is set to false. You should commit your changes.
        newCon.setAutoCommit(false);
        PreparedStatement preparedStatement = newCon.prepareStatement(INSERT_PRODUCT_SQL);
        preparedStatement.setInt(1, 7);
        preparedStatement.setString(2, "Washing Machine_2");
        preparedStatement.setString(3, "Top loaded Machine wash_2");
        preparedStatement.setInt(4, 15000);
       
       // Step 3: Execute the query or update query
        int updateRes=preparedStatement.executeUpdate();
        System.out.println("Execute update result :"+updateRes);
       
        // commit the changes(insert)
        newCon.commit();
       
    }

    private void insertDataUsingPreparedStatement(Connection newCon) throws SQLException {
        PreparedStatement preparedStatement = newCon.prepareStatement(INSERT_PRODUCT_SQL);
            preparedStatement.setInt(1, 6);
            preparedStatement.setString(2, "Washing Machine_1");
            preparedStatement.setString(3, "Top loaded Machine wash_1 ");
            preparedStatement.setInt(4, 15000);
           
           // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
       
    }

    private void insertData(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate(
                "insert into product values('4','Watch','Analog watch',2000)");
       
    }

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
   

}