package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertDAta {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/School";
        String user = "root";
        String password = "Bharti@1234";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO students (name, age) VALUES ('Bharti', 22), ('sonali', 21), ('neha', 23)";
            
            int rowsAffected = stmt.executeUpdate(sql);
            
            System.out.println(rowsAffected + " rows inserted successfully!");
           
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
