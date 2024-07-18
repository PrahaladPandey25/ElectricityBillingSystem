package electricity.billing.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn() {
        try {
            // Optional: Load MySQL JDBC Driver for older JDBC versions
            // Class.forName("com.mysql.cj.jdbc.Driver");
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "Prahalad#123");
            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
