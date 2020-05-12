package ups.edu.ec.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ups.edu.ec.dao.DAOFactory;
import ups.edu.ec.dao.PersonaDAO;
import ups.edu.ec.modelo.Persona;
import ups.edu.ec.modelo.Telefono;

public class JDBCPersonaDAO extends JDBCGenericDAO<Persona, String> implements PersonaDAO {

	@Override
	public void createTable() {

		System.out.print("Hola creacion tabla");

		conexionUno.update("CREATE TABLE IF NOT EXISTS usuario (" + "	usu_cedula VARCHAR(10) NOT NULL,"
				+ "	usu_nombres VARCHAR(50)," + "	usu_apellidos VARCHAR(50)," + "	usu_correo VARCHAR(100),"
				+ "	usu_contrasena VARCHAR(255)," + "	usu_activo INT," + "	PRIMARY KEY (usu_cedula)" + ");");
	}

	@Override
	public boolean create(Persona persona) {
		return conexionUno.update("INSERT INTO usuario VALUES ('" + persona.getCedula() + "', '" + persona.getNombres()
				+ "', '" + persona.getApellidos() + "', '" + persona.getCorreo() + "', '" + persona.getContrasena()
				+ "'," + persona.getActivo() + ");");
	}

	@Override
	public Persona findById(String cedula) {
		Persona persona = null;
		ResultSet rs = conexionUno.query("SELECT * FROM usuario WHERE usu_cedula = '" + cedula + "';");
		try {
			if (rs != null && rs.next()) {
				persona = new Persona(rs.getString("usu_cedula"), rs.getString("usu_nombres"),
						rs.getString("usu_apellidos"), rs.getNString("usu_correo"), rs.getNString("usu_contrasena"),
						rs.getInt("usu_activo"));
				List<Telefono> telefonos = DAOFactory.getDAOFactory().getTelefonoDAO()
						.findByUserId(persona.getCedula());
				persona.setLista(telefonos);

			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCPersonaDAO:findById): " + e.getMessage());
		}
		return persona;
	}

	@Override
	public boolean update(Persona persona) {
		return conexionUno.update("UPDATE usuario SET " + "	usu_nombres = '" + persona.getNombres() + "',"
				+ "	usu_apellidos = '" + persona.getApellidos() + "'," + "	usu_contrasena  = '"
				+ persona.getContrasena() + "'" + "	WHERE usu_cedula = '" + persona.getCedula() + "';");
	}

	@Override
	public boolean delete(Persona persona) {
		return conexionUno.update("UPDATE usuario SET " + "	usu_activo = " + persona.getActivo()
				+ "	WHERE usu_cedula = '" + persona.getCedula() + "';");
	}

	@Override
	public List<Persona> find() {
		List<Persona> personas = new ArrayList<>();

		ResultSet rs = conexionUno.query("SELECT * FROM usuario;");
		try {
			while (rs.next()) {
				Persona persona = new Persona(rs.getString("usu_cedula"), rs.getString("usu_nombres"),
						rs.getNString("usu_apellidos"), rs.getNString("usu_correo"), rs.getNString("usu_contrasena"),
						rs.getInt("usu_activo"));
				List<Telefono> telefonos = DAOFactory.getDAOFactory().getTelefonoDAO()
						.findByUserId(persona.getCedula());
				List<Telefono> telefonos2 = DAOFactory.getDAOFactory().getTelefonoDAO()
						.findByUserId(persona.getCedula());
				persona.setLista(telefonos);
				;
				personas.add(persona);
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCPersonaDAO:find): " + e.getMessage());
		}
		return personas;
	}

	@Override
	public Persona findUser(String correo, String contrasena) {

		Persona persona = null;
		ResultSet rs = conexionUno.query(
				"SELECT * FROM usuario WHERE usu_correo = '" + correo + "' AND usu_contrasena = '" + contrasena + "';");
		try {
			if (rs != null && rs.next()) {
				persona = new Persona(rs.getString("usu_cedula"), rs.getString("usu_nombres"),
						rs.getNString("usu_apellidos"), rs.getNString("usu_correo"), rs.getNString("usu_contrasena"),
						rs.getInt("usu_activo"));
				List<Telefono> telefonos = DAOFactory.getDAOFactory().getTelefonoDAO()
						.findByUserId(persona.getCedula());
				persona.setLista(telefonos);
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCPersonaDAO:findUser): " + e.getMessage());
		}
		return persona;
	}

	public List<Persona> findByIdOrMail(String context) {
		List<Persona> users = new ArrayList<>();
		if (context.equals("all")) {
			ResultSet rs = conexionUno.query("SELECT * FROM usuario;");
			try {
				if (rs != null && rs.next()) {
					Persona persona = new Persona(rs.getString("usu_cedula"), rs.getString("usu_nombres"),
							rs.getNString("usu_apellidos"), rs.getNString("usu_correo"),
							rs.getNString("usu_contrasena"), rs.getInt("usu_activo"));
					List<Telefono> telefonos = DAOFactory.getDAOFactory().getTelefonoDAO()
							.findByUserId(persona.getCedula());
					// List<Telefono> telefonos2 =
					// DAOFactory.getDAOFactory().getTelefonoDAO().findByUserId(persona.getNombres());
					persona.setLista(telefonos);
					// users.add(persona);
					// persona.setLista(telefonos2);
					users.add(persona);
				}
			} catch (SQLException e) {
				System.out.println(">>>WARNING (JDBCUserDAO:findByIdOrMail): " + e.getMessage());
			}
			System.out.println("Todos los usuarios....." + users.toString());
		} else {
			ResultSet rs = conexionUno.query("SELECT * FROM usuario " + "WHERE usu_cedula = '" + context
					+ "' OR usu_correo = '" + context + "';");
			try {
				if (rs != null && rs.next()) {
					Persona persona = new Persona(rs.getString("usu_cedula"), rs.getString("usu_nombres"),
							rs.getNString("usu_apellidos"), rs.getNString("usu_correo"),
							rs.getNString("usu_contrasena"), rs.getInt("usu_activo"));
					List<Telefono> telefonos = DAOFactory.getDAOFactory().getTelefonoDAO()
							.findByUserId(persona.getCedula());

					persona.setLista(telefonos);
					users.add(persona);
				}
			} catch (SQLException e) {
				System.out.println(">>>WARNING (JDBCUserDAO:findByIdOrMail): " + e.getMessage());
			}
		}

		return users;
	}

}
