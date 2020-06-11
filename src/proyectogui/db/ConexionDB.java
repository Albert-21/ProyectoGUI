/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.db;

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

    public static ConexionDB getInstace() {
        if (con == null) {
            con = new ConexionDB();
        }
        return con;
    }

    private Connection conn;

    private ConexionDB() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejemplo", "postgres", "2198");
        } catch (SQLException e) {
            System.out.println("Ocurrio un problema" + e.getMessage());
        }
        System.out.println("La conexion ocurrio sin problemas");

    }

    public boolean execute(String sql) {
        boolean res = false;
        try {
            Statement st = conn.createStatement();
            st.execute(sql);
            res = true;
        } catch (Exception e) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, e);
        }
        return res;
    }
    
    public boolean execute (TransaccionDB t){
        boolean res = false;
        res =t.execute(conn);
        return res;
    }

}
