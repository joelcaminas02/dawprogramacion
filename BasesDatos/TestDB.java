import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB{
    public static void main(String[] args) {
        String consutla = "Select count(*) as total FROM CLiente";
        String connectionURL = "jdbc:mysql//ip:3306/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            //TODO: handle exception
            e1.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection(connectionURL, "phpmyadmin", "phpmyadmin");
            PreparedStatement ps = conn.prepareStatement(consutla);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int total = rs.getInt("total");
                System.out.println("Total: "+total);
            }
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}