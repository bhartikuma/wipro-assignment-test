package jdbc;



import java.sql.*;

public class getTABle {
    public static void main(String[] args) {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver"); 
          
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Wiprodb", 
                "root", 
                "Bharti@1234" 
            );
            
     
            CallableStatement cs = con.prepareCall("{call getAllEmployees()}");
            
   
            ResultSet rs = cs.executeQuery();
            
           
            while (rs.next()) {
               
                System.out.println("Employee ID: " + rs.getInt(1) + " First Name: " + rs.getString("name"));
            }

            rs.close();
            cs.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

