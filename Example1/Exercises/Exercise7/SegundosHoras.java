package Exercise7;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierEAcevedoN
 */
public class SegundosHoras {
    public static void main(String[] args) {
        int segundos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una cantidad de segundos"));
        int minutos = 0;
        int horas = 0;
        String resultado;
        
        
        while (segundos>=60) {            
            segundos -= 60;
            minutos ++;
        }
        
        while (minutos>=60) {            
            minutos -= 60;
            horas ++;
        }
        
        resultado = "La cantidad de horas es de: "+horas;
        resultado += "\nLa cantidad de minutos es de: "+minutos;
        resultado += "\nLa cantidad de segundos es de: "+segundos;
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}