package chevrolet;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        String Usuario = "geosoft";
        String Contraseña ="$geosoft$";
        boolean opcion_user = false;
        int Tries=0;
        while (Tries!=3) { 
         String IngresoContraseña = JOptionPane.showInputDialog("Bienvenido a consesionaria Fro:" 
                                                            + "\nIngrese la contraseña");
         if(IngresoContraseña.equals(Contraseña)){
             opcion_user=true;
             break;
         }else{
             JOptionPane.showMessageDialog(null,"Contraseña incorecta");
         }
         Tries++; 
        }
        if(opcion_user == false){
            JOptionPane.showMessageDialog(null,"Inicio de sesion fallido.");
        }
    }
    
}
