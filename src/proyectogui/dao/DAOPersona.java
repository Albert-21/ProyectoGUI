package proyectogui.dao;

import proyectogui.utils.ConexionDB;



/**
 *
 * @author victor
 */
public class DAOPersona implements IDAOGeneral<Persona> {

    @Override
    public boolean guardar(Persona pojo) {
        boolean res  = false;
        ConexionDB con = ConexionDB.getInstace();
        String sql ="insert into personas (Clave, Nombre, Direccion, Telefono) values "
                +"('"+pojo.getClave()+"','"+pojo.getNombre()+"','"+pojo.getDireccion()+"','"+
                pojo.getTelefono()+"','"+pojo.getDepartamento()+"')";  
        res = con.execute(sql);
        return res;
    }

    @Override
    public boolean borrar(Persona pojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Persona pojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
