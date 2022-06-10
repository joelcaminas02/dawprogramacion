import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlAll{
    public static void main(String[] args) {
       
       String consulta = "SELECT * FROM Cliente";
       String connectioURL = "jdbc:mysql://10.0.20.4:3306/clientes";

       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           //TODO: handle exception
           e.printStackTrace();
       }

       try (Connection conn =DriverManager.getConnection(connectioURL,"phpmyadmin3","phpmyadmin3");
            PreparedStatement ps = conn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery()){

                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
                }
    
       } catch (SQLException e) {
           //TODO: handle exception
           e.printStackTrace();
       }
    }
}