package Exercise5;

import javax.swing.JOptionPane;
/**
 *
 * @author JavierAcevedo
 */
public class Cuadrado {
    public static void main(String[] args) {
        String exterior = "\n"+"********";
        String interior = "\n"+"*         *";
        String resultado = "";
        
        resultado += exterior;
        for (int i = 0; i < 3; i++) {
            resultado += interior;
        }
        resultado += exterior;
        JOptionPane.showMessageDialog(null, resultado);
    }
}