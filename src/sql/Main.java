/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import static sql.Metodos.createNewDatabase;
import static sql.Metodos.createNewTable;

/**
 *
 * @author sergio lorenzo rodguz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewDatabase("");
        AlumnoBD alumno = new AlumnoBD();
        alumno.setVisible(true);
        

        
        createNewTable();
        Metodos bd = new Metodos();
        bd.insert("xxxx", "xxxxx","xxxxx","xxxx");
        //bd.insert("xxxxk", "xxxxd");
        //bd.selectAll();
        //bd.getId();
       
        
        
    }
    
}
