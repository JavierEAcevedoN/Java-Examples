package Exercise4;

import javax.swing.JOptionPane;
/**
 *
 * @author JavierEAcevedoN
 */
public class Triangulo {
    public static void main(String[] args) {
        String punto = "*";
        String resultado = "";
        
        for (int i = 0; i < 5; i++) {
            resultado += "\n"+punto;
            punto += "*";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}