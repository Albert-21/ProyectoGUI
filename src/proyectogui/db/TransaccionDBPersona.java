/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author flor
 */
public class TransaccionDBPersona extends TransaccionDB<Persona>{

    public TransaccionDBPersona(Persona pojo) {
        super(pojo);
    }
    
    @Override
    public boolean execute(Connection conn) {
        boolean res = false;
        try {
            Persona p = new Persona();
            
            String sql = "insert into persona (clave, nombre, direccion, telefono) values (?,?,?,?)";
       
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pojo.getClave());
            ps.setString(2, pojo.getNombre());
            ps.setString(3, pojo.getDireccion());
            ps.setString(4, pojo.getTelefono());
            
            ps.execute();
            
            System.out.println("Se guardo");
            res = true;
        } catch (SQLException ex) {
            Logger.getLogger(TransaccionDBPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    
}
