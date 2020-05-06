package ups.edu.ec.dao;




import ups.edu.ec.mysql.jdbc.JDBCPersonaDAO;
import ups.edu.ec.mysql.jdbc.JDBCTelefonoDAO;

public  class JDBCDAOFactory extends DAOFactory{

	@Override
	public void createTables() {
		// TODO Auto-generated method stub
		this.getPersonaDAO().createTable();
		this.getTelefonoDAO().createTable();
		
	}

	@Override
	public PersonaDAO getPersonaDAO() {
		// TODO Auto-generated method stub
		return new JDBCPersonaDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JDBCTelefonoDAO();
	}

	


	

	

	

    
    
}
