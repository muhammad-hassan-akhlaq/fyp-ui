/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author muham
 */
public class DBHandler {
    private static Connection conn=null;

    public DBHandler() {
        getConnection();
    }
    
    static Connection getConnection(){
        try{
            if(conn==null || conn.isClosed())
                establishConnection();
        }catch(SQLException e){
            System.out.println("Exception occured:\n"+e);
        }
        return conn;
    }
    
    static void closeConnection(){
        try{
            if(conn!=null || conn.isValid(0)){
                conn.close();
                System.out.println("Connection closed.");
            }
        }catch(SQLException e){
            System.out.println("Exception occured:\n"+e);
        }
    }
    
    static void establishConnection(){
        try{
            if(conn==null || conn.isClosed()){
                //For SQL Server Connection:
                String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=TornImageReconstruction;integratedSecurity=true;";
                // Establish the connection.
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                conn = DriverManager.getConnection(connectionUrl,"","");
                System.out.println("Connection established.");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Exception occured:\n"+e);
        }
    }
                
    static ResultSet runQuery(String q,ArrayList<String> parameters){
        ResultSet rs=null;
        try{
            if(conn==null || conn.isClosed())
                establishConnection();
            PreparedStatement ps=conn.prepareStatement(q);
            int l=parameters.size();
            for(int i=0;i<l;i++){
                ps.setString(i+1,parameters.get(i));
            }
            rs=ps.executeQuery();
            return rs;
        }catch(SQLException e){
            System.out.println("Exception occured:\n"+e);
        }
        return rs;
    }
    
    static ResultSet runQuery(String q){
        ResultSet rs=null;
        try{
            if(conn==null || conn.isClosed())
                establishConnection();
            PreparedStatement ps=conn.prepareStatement(q);
            rs=ps.executeQuery();
            return rs;
        }catch(SQLException e){
            System.out.println("Exception occured:\n"+e);
        }
        return rs;
    }
    static boolean runUpdate(String q){
        try{
            if(conn==null || conn.isClosed())
                establishConnection();
            PreparedStatement ps=conn.prepareStatement(q);
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println("Exception occured:\n"+e);
        }
        return false;
    }

    static boolean runUpdate(String q,ArrayList<String> parameters){
        try{
            if(conn==null || conn.isClosed())
                establishConnection();
            PreparedStatement ps=conn.prepareStatement(q);
            int l=parameters.size();
            for(int i=0;i<l;i++){
                ps.setString(i+1,parameters.get(i));
            }
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println("Exception occured:\n"+e);
        }
        return false;
    }
}
