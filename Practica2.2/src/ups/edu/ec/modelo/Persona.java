package ups.edu.ec.modelo;

import java.util.List;

public class Persona {

	private String nombres;
	private String apellidos;
	private String cedula;
	private String correo;
	private String contrasena;
	private List<Telefono> Lista;
	
	
	public List<Telefono> getLista() {
		return Lista;
	}


	public void setLista(List<Telefono> lista) {
		Lista = lista;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public Persona() {
		// TODO Auto-generated constructor stub
		
		
		
		
	}

}
