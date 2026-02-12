package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/School";
        String user = "root";
        String password = "Bharti@1234";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            
            String sql = "UPDATE students SET name = 'Rahul Kumar', age = 25 WHERE id = 1";
            
            int rowsAffected = stmt.executeUpdate(sql);
            
            if (rowsAffected > 0) {
                System.out.println("Data updated successfully!");
            } else {
                System.out.println("No record found with the given ID.");
            }
           
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

