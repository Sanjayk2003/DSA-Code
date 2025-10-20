package JDBC;

import java.net.ConnectException;
import java.sql.*;
public class FirstJDBC {
    static Connection gConnection() throws Exception{
        String path="jdbc:mysql://localhost:3306/student";            
        String name="root";
        String pass="Sanjay@1";
        return DriverManager.getConnection(path, name, pass);
    }
    
    static void retriveDataBase() throws Exception
    {
        
        Connection c=gConnection();
        String query="select * from studentt";
        Statement s=c.createStatement();
        ResultSet v=s.executeQuery(query); 
        while(v.next()){
            System.out.println("id : "+v.getInt(1)+" name : "+v.getString(2)+" sec : "+v.getString(3)+" mark : "+v.getInt(4));
        }
         System.out.println("jhj");
    }
    static void insert() throws Exception
    {
        
        Connection c=gConnection();
        String query="insert into studentt values(10,'hari','D',88);";
        Statement s=c.createStatement();
        int v=s.executeUpdate(query); 
        
         System.out.println(v);
    }
    static void insertPrepared() throws Exception
    {
        int id=6;
        String name="Narayanan";
        String sec="A";
        int mark=90;
        Connection c=gConnection();
        String query="insert into studentt values(?,?,?,?);";
        PreparedStatement s=c.prepareStatement(query);
        s.setInt(1, id);
        s.setString(2, name);
        s.setString(3, sec);
        s.setInt(4, mark);
        int v=s.executeUpdate(); 
        
         System.out.println(v);
    }
    static void delete() throws Exception
    {
        int id=11;
        Connection c=gConnection();
        String query="delete from studentt where id=?";
        PreparedStatement s=c.prepareStatement(query);
        s.setInt(1, id);
        
        int v=s.executeUpdate(); 
        
         System.out.println(v);
    }
    static void update() throws Exception
    {
        int id=1;
        String name="King";
        Connection c=gConnection();
        String query="update studentt set name=? where id=?";
        PreparedStatement s=c.prepareStatement(query);
        s.setInt(2, id);
        s.setString(1, name);
        
        int v=s.executeUpdate(); //when ever we make changes in query or parameter we use it
        
         System.out.println(v);
    }
    static void callablestate1() throws Exception   
    {
        int id=1;
        Connection c=gConnection();
        CallableStatement s=c.prepareCall("{call geteum(?)}");
        s.setInt(1, id);
        ResultSet v=s.executeQuery();    // use it for the Select query
        while(v.next()){
            System.out.println("id : "+v.getInt(1)+" name : "+v.getString(2)+" sec : "+v.getString(3)+" mark : "+v.getInt(4));
        }
    }
    static void callablestate() throws Exception
    {
        Connection c=gConnection();
        CallableStatement s=c.prepareCall("{call getum()}");
        ResultSet v=s.executeQuery(); //returns the result set using this we can access the values
        while(v.next()){
            System.out.println("id : "+v.getInt(1)+" name : "+v.getString(2)+" sec : "+v.getString(3)+" mark : "+v.getInt(4));
        }
    }
    static void getValue() throws Exception //get the value from the SQL by OUT parameter
    {
        int id=1;
        Connection c=gConnection();
        CallableStatement s=c.prepareCall("{call outable(?,?)}");
        s.setInt(1, id);
        s.registerOutParameter(2, Types.VARCHAR);    //DONT forget it
        int v=s.executeUpdate();
        System.out.println(s.getString(2));   //we sent a arguement to get the value so we are accessing the parameter like setting the value for the parameter
        
        
    }
    static void callableUpdate() throws Exception  //updateing by the procedure in SQL
    {
        int id=1;
        String name="Hrithik Roshan";
        Connection c=gConnection();
        CallableStatement s=c.prepareCall("{call updateTAble(?,?)}");
        s.setInt(1, id);
        s.setString(2, name);
        int v=s.executeUpdate();
        System.out.println(v);
        
    }
    static void autoCommitEXample() throws Exception
    {
        Connection c=gConnection();
        c.setAutoCommit(false);
        String query1="update studentt set mark=10 where id=1";
        String query2="update studentt set mark=10 where id=2";
        Statement s=c.createStatement();
        int n=s.executeUpdate(query1);
        System.out.println(n);
        int n1=s.executeUpdate(query2);
        System.out.println(n1);

        if(n>0&&n1>0){
        c.commit();
        }

        c.close();
    }
    
    

    public static void main(String[] args) throws Exception {
        //insert();
        // delete();
        //update();
        // retriveDataBase();
        // // callablestate();
        // // callablestate1();
        // callableUpdate();
        //insertPrepared();
        // getValue();
        autoCommitEXample();
    }

}
