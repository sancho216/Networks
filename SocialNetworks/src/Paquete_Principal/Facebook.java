
package Paquete_Principal;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Facebook implements I_Conectar{

    @Override
    public void Conectar() {
        
        try {

            JOptionPane.showMessageDialog(null, "Usted ha ingresado a Facebook \n             Bienvenido!");
            Desktop.getDesktop().browse(new URI("http://www.facebook.com"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }
    
}
