import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * MysqlUpdate
 */
public class MysqlUpdate {
   
    public static void main(String[] args) throws ClassNotFoundException {
        
        String sqlUpdate = "update Cliente set nombre = ?, apellidos = ?, email = ?, nif = ? where nif like ?";

        String connectioURL = "jdbc:mysql://10.0.20.4:3306/clientes";
 
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
       
        Connection conn =DriverManager.getConnection(connectioURL,"phpmyadmin2","phpmyadmin2");
            PreparedStatement ps = conn.prepareStatement(sqlUpdate);
            Scanner lector = new Scanner(System.in);

            System.out.println("Introduce el nombre: ");
            String nombre = lector.nextLine();
            ps.setString(1, nombre);

            System.out.println("Introduce el apellido: ");
            String apellidos = lector.nextLine();
            ps.setString(2, apellidos);

            System.out.println("Introduce el email: ");
            String email = lector.nextLine();
            ps.setString(3, email);

            System.out.println("Introduce el nif: ");
            String nif = lector.nextLine();
            ps.setString(4, nif);

            System.out.println("Introduce el nif del cliente al que desea cambiar los datos: ");
            String nifCliente = lector.nextLine();
            ps.setString(5, nifCliente);

            ps.executeUpdate();
            conn.close();
            lector.close();

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}