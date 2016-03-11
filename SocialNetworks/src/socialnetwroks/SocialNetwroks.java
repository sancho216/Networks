package socialnetwroks;

import Paquete_Principal.Factory_Red;
import Paquete_Principal.I_Conectar;
import javax.swing.JOptionPane;

public class SocialNetwroks {

    public static void main(String[] args) {

       try{
        
        String saveItem = JOptionPane.showInputDialog("A cual red quiere ingresar: ");
        Factory_Red red = new Factory_Red();
        I_Conectar Con = Factory_Red.Conex(saveItem);
        Con.Conectar();

//        
       }catch (Exception e){
           
           JOptionPane.showMessageDialog(null, "No se ha encontrado", "Alerta", JOptionPane.ERROR_MESSAGE);
                   
       }
    }

}
