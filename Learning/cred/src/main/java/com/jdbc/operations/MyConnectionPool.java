package com.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class ConnectionPool{
    Connection con;
    boolean free;    
}


public class MyConnectionPool {
    static {        
        System.out.println("In static");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
       
    final static int POOL_SIZE=2;
    static List<ConnectionPool>  pool=new ArrayList<ConnectionPool>();
   
    static void init() {
        System.out.println("Connection pool initilize...");
        try {
            for(int i=0;i<POOL_SIZE;i++) {
                ConnectionPool p=new ConnectionPool();
               
                Connection newCon=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/apr23?characterEncoding=utf8","root","root");
               
                p.con=newCon; // assign new DB connection.
                p.free=true;
               
                pool.add(p);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }            
    }
   
    static ConnectionPool getConnection() throws Exception{
        try {
            for(int i=0;i<POOL_SIZE;i++) {
                if(pool.get(i).free==true) {
                    pool.get(i).free=false;
                    return pool.get(i);
                }
            }
            throw new Exception("No free connection available");
        }catch(Exception e) {
            throw e;
        }
    }
    static void releaseConnection(ConnectionPool p) {
        p.free=true;
    }

    static public void freeAll() throws SQLException {
        for(int i=0;i<POOL_SIZE;i++) {
            pool.get(i).con.close();
        }
       
    }

}