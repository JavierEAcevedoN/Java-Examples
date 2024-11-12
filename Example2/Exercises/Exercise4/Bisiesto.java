package Example2.Exercises.Exercise4;

import javax.swing.JOptionPane;

public class Bisiesto {
    public static void main(String[] args) {
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año: ","Año Bisisesto",-1));
        
        if(anio<=0) {
            JOptionPane.showMessageDialog(null, "Debes poner un número positivo", "Error de dato", 0);
            return;
        }
        
        if(anio % 4 == 0 || anio % 400 == 0) {
            if (anio % 100 != 0) {
                JOptionPane.showMessageDialog(null, "Es un año Bisiesto");
            } else {
                JOptionPane.showMessageDialog(null, "No es un año Bisiesto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No es un año Bisiesto");
        }
    }
}