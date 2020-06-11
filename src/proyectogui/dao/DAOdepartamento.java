package proyectogui.dao;

import proyectogui.utils.ConexionDB;

/**
 *
 * @author victor
 */
public class DAOdepartamento implements IDAOGeneral<Departamento> {

    private ConexionDB con = ConexionDB.getInstace();
    private String sql;
    private boolean res;

    @Override
    public boolean guardar(Departamento pojo) {
        res = false;
        sql = "insert into departamento (clave, nombre) values "
                + "('" + pojo.getClave() + "','" + pojo.getNombre() + "')";
        res = con.execute(sql);
        return res;
    }

    @Override
    public boolean borrar(Departamento pojo) {
        res = false;
        sql = "delete from departamento where(clave = '" + pojo.getClave() + "');";
        res = con.execute(sql);
        return res;
    }
 

    @Override
    public boolean actualizar(Departamento pojo) {
        res = false;
        sql = "update departamento SET nombre = '" + pojo.getNombre() + "'WHERE (clave = '" + pojo.getClave() + "');";
        res = con.execute(sql);
        return res;
    }

}
