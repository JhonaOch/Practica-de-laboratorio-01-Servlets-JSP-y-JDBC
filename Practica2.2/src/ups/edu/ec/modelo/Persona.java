package ups.edu.ec.modelo;

import java.io.Serializable;
import java.util.List;

public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private String nombres;
	private String apellidos;
	private String cedula;
	private String correo;
	private String contrasena;
	private int activo;
	private List<Telefono> lista;
	
	
	public Persona() {	
	}
	
	public Persona(String cedula, String nombres, String apellidos, String correo, String contrasena, int activo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.activo = activo;
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

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public List<Telefono> getLista() {
		return lista;
	}

	public void setLista(List<Telefono> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + ", correo=" + correo
				+ ", contrasena=" + contrasena + ", activo=" + activo + ", lista=" + lista + "]";
	}

	
	
	
	



	

}
