package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Bharti@1234";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS School");
            stmt.execute("USE School");
            
            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(50), " +
                         "age INT)";
            
            stmt.executeUpdate(sql);
            
            System.out.println("Success");
           
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
