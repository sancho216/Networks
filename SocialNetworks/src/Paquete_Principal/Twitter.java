package Paquete_Principal;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Twitter implements I_Conectar {

    @Override
    public void Conectar() {

        try {
            JOptionPane.showMessageDialog(null, "Usted ha ingresado a Twitter \n             Bienvenido!");
            Desktop.getDesktop().browse(new URI("http://www.twitter.com"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

}
