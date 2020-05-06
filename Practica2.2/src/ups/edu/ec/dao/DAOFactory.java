package ups.edu.ec.dao;



public abstract class DAOFactory {
    protected static DAOFactory factory=new JDBCDAOFactory();
    
    public static DAOFactory getDAOFactory(){return factory;}
    
    public abstract void createTables();
    
    public abstract PersonaDAO getPersonaDAO();
    
    public abstract TelefonoDAO getTelefonoDAO();
}
