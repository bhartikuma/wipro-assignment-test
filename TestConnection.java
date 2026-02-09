package jdbc;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class TestConnection {
    public static void main(String[] args) {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

        
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company_db",
                "root",
                "Bharti@1234"
            );
            System.out.println("connection setup");

            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery(" select * from comp");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
       
            while (rs.next()) {
                // 2. Loop through each column in the current row
                // Note: JDBC column indexes start at 1, not 0
                for (int i = 1; i <= columnCount; i++) {
                    String value = rs.getString(i); // rs.getString() can fetch most data types as text
                    System.out.print(rsmd.getColumnName(i) + ": " + value + "  ");
                }
                System.out.println(); // Move to next line for the next row
            }
      con.close();
      }
      	catch (Exception e)
         {
      		System.out.println(e);
         }
      }
       
}
