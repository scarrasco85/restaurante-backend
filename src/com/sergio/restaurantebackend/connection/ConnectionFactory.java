/**
 * 
 */
package com.sergio.restaurantebackend.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Sergio Carrasco García
 * Clase que se encarga de realizar la configuración, la conexión y habilitar las
 * transacciones de una base de datos
 */
public class ConnectionFactory {

	/**
	 * Objeto encargado de mantener la conexión de la base de datos.
	 */
	private static Connection connection;
	
	/**
	 * Método que permite conectarse a la base de datos.
	 * @return objeto Connection con la información de la base de datos conectada o null
	 * en el caso que no se conecte a la base de datos.
	 * @throws ClassNotFoundException Exception generada al no cargar el driver de conexión.
	 * @throws SQLException Exception generada al no conectarse a la DB.
	 */
	public static Connection conectar() throws ClassNotFoundException, SQLException {
		
		// Cargar driver de conexión
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Datos de conexión DB
		String url = "jdbc:mysql://localhost:3306/restaurante";
		String user = "root";
		String password = "";
		
		// Conexión DB
		connection = DriverManager.getConnection(url, user, password);
		
		return connection;
	}
}
