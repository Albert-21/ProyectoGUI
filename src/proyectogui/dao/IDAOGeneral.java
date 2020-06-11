package proyectogui.dao;

/**
 *
 * @author victor
 */
public interface IDAOGeneral<T> {

    public boolean guardar(T pojo);

    public boolean borrar(T pojo);

    public boolean actualizar(T pojo);

}
