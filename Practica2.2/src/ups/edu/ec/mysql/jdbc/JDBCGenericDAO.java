package ups.edu.ec.mysql.jdbc;

import ups.edu.ec.dao.GenericDAO;

public abstract class JDBCGenericDAO<T, ID> implements GenericDAO<T, ID>{
    protected ContextJDBC conexionUno = ContextJDBC.getJDBC1();
    protected ContextJDBC conexionDos = ContextJDBC.getJDBC2();
}
