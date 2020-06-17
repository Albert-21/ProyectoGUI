package proyectogui.db;
import java.sql.Connection;

/**
 *
 * @author flor
 */
public abstract class TransaccionDB<T>{

    protected T pojo;
    
    public TransaccionDB(T pojo) {
        this.pojo = pojo;
    }
    
    public abstract boolean execute(Connection conn);
}
