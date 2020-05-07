package ups.edu.ec.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ups.edu.ec.dao.TelefonoDAO;
import ups.edu.ec.modelo.Telefono;



public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO {

    @Override
    public void createTable() {
        conexionDos.update("CREATE TABLE IF NOT EXISTS telefono ("
                + "	tel_id INT NOT NULL AUTO_INCREMENT,"
                + "	tel_numero VARCHAR(20),"
                + "	tel_tipo  VARCHAR(50),"
                + "	tel_operadora VARCHAR(50),"
                + "	usu_cedula VARCHAR(10) NOT NULL,"
                + "	PRIMARY KEY (tel_id),"
                + "	FOREIGN KEY (usu_cedula) REFERENCES usuario(usu_cedula)"
                + ");");
    }

    @Override
    public boolean create(Telefono telefono) {

           return conexionDos.update("INSERT INTO telefono (tel_numero, tel_tipo, tel_operadora, usu_cedula) "
                + "VALUES ('" + telefono.getNumero() + "', '" + telefono.getTipo() + "', '" + telefono.getOperadora() + "', '" + telefono.getPersona().getCedula() + "');");  
    }

    @Override
    public Telefono findById(Integer codigo) {
        Telefono telefono = null;
        ResultSet rs = conexionUno.query("Select * FROM telefono WHERE tel_id = " + codigo + ";");
        try {
            if (rs != null && rs.next()) {
            	telefono = new Telefono( rs.getString("tel_numero"), rs.getString("tel_tipo"), rs.getString("tel_operadora"));
            	telefono.setCodigo(rs.getInt("tel_id"));
            	//telefono.setPersona(DAOFactory.getDAOFactory().getPersonaDAO().findById(rs.getString("usu_cedula")));
            }
        } catch (SQLException e) {
            System.out.println(">>>WARNING (JDBCPhoneDAO:read): " + e.getMessage());
        }
        return telefono;
    }

    @Override
    public boolean update(Telefono telefono) {
       return conexionDos.update("UPDATE telefono SET "
                + "	tel_numero = '" + telefono.getNumero() + "',"
                + "	tel_tipo = '" + telefono.getTipo() + "',"
                + "	tel_operadora = '" + telefono.getOperadora() + "'"
                + "WHERE tel_id = '" + telefono.getCodigo() + "' AND usu_cedula = '" + telefono.getPersona().getCedula() + "';");
    }

    @Override
    public boolean delete(Telefono phone) {
        return conexionDos.update("DELETE FROM telefono WHERE tel_id = '" + phone.getCodigo() + "' AND usu_cedula = '" + phone.getPersona().getCedula() + "';");
    }

    @Override
    public List<Telefono> find() {
        throw new UnsupportedOperationException("Not supported yet."); 
        }

    @Override
    public List<Telefono> findByUserId(String cedula) {
        List<Telefono> phones = new ArrayList<>();
        ResultSet rs = conexionDos.query("SELECT * FROM telefono WHERE usu_cedula = '" + cedula + "';");
        try {
            while (rs.next()) {
            	Telefono phone = new Telefono( rs.getString("tel_numero"), rs.getString("tel_tipo"), rs.getString("tel_operadora"));
              phone.setCodigo(rs.getInt("tel_id"));
                phones.add(phone);
            }
        } catch (SQLException e) {
            System.out.println(">>>WARNING (JDBCPhoneDAO:findByShoppingBasketId): " + e.getMessage());
        }
        return phones;
    }

}