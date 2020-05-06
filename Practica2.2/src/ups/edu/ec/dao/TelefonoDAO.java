package ups.edu.ec.dao;

import java.util.List;

import ups.edu.ec.modelo.Telefono;


public interface TelefonoDAO extends GenericDAO<Telefono, Integer>{
    public abstract List<Telefono> findByUserId(String cedula);
}
