package Paquete_Principal;

public class Factory_Red {

    public static I_Conectar Conex(String saveItem) {

        switch (saveItem) {
            case "Facebook":

                return new Facebook();

            case "Google+":

                return new Google();

            case "Twitter":

                return new Twitter();
        }
        return null;
    }

}
