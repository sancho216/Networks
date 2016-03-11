package Paquete_Principal;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Google implements I_Conectar {

    @Override
    public void Conectar() {

        try {
            JOptionPane.showMessageDialog(null, "Usted ha ingresado a Google+ \n             "
                    + "Bienvenido!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            Desktop.getDesktop().browse(new URI("http://www.plus.google.com"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

}
