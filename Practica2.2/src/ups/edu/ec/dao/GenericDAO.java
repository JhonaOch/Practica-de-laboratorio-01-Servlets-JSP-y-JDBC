package ups.edu.ec.dao;

import java.util.List;

public interface GenericDAO<T, ID> {

    public void createTable();

    public boolean create(T entity);

    public T findById(ID id);

    public boolean update(T entity);

    public boolean delete(T entity);

    public List<T> find();
}
