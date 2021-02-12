/**
 * 
 */
package Principal;

import java.sql.Connection;
import java.sql.SQLException;

import com.sergio.restaurantebackend.connection.ConnectionFactory;

/**
 * @author Sergio Carrasco García
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		try {
			Connection connectionDb = ConnectionFactory.conectar();
			
			if (connectionDb != null) {
				System.out.println("Conexión a la base de datos establecida.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
