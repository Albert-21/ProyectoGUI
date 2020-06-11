package proyectogui.dao;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class FactoryDAO {
    public enum TypeDAO{PERSONA,DEPARTAMENTO};
    public static IDAOGeneral create(TypeDAO t){
        IDAOGeneral dao=null;
        switch(t){
            case PERSONA:
                dao=new DAOPersona();
                break;
            case DEPARTAMENTO:
                dao=new DAOdepartamento();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error Factory");
        }
        return dao;
    }
}
