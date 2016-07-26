/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;
import domogui.frmPrincipal;
import fnArchivo.archivo;

/**
 *
 * @author julian
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        archivo.crearS();
        archivo.crearA();
        // TODO code application logic here
        
        frmPrincipal form = new frmPrincipal();
        form.setVisible(true);
    }
    
}
