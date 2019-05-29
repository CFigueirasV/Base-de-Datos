package sql;

import static sql.Metodos.createNewDatabase;
import static sql.Metodos.createNewTable;

/**
 *
 * @author carlos figueiras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewDatabase("ferreteria.db");
        AlumnoBD alumno = new AlumnoBD();
        alumno.setVisible(true);
        

        
        createNewTable();
        Metodos bd = new Metodos();
       
        
        }
    
}
