package ups.edu.ec.dao;

import ups.edu.ec.modelo.Persona;

public interface PersonaDAO extends GenericDAO<Persona, String> {
    public abstract Persona findUser(String correo, String contrasena);
}