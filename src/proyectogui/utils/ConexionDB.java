package proyectogui.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto
 */
public class ConexionDB {

    private static ConexionDB con = null;
    private static Connection conn;

    public static ConexionDB getInstace() {
        if (con == null) {
            con = new ConexionDB();
        }
        return con;
    }

    private ConexionDB() {
        try {
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejemplo", "postgres", "2198");
        } catch (SQLException e) {
            System.out.print("Ocurrio un problema " + e.getMessage());
        }
        System.out.print("La conexion ocurrio sin problemas");

    }

    public boolean execute(String sql) {
        boolean res = false;
        try {
            Statement st = conn.createStatement();
            st.execute(sql);
            res = true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return res;
    }

}
