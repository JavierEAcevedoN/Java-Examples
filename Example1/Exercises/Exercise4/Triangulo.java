package Exercise4;

// JOptionPane se utiliza para poder invocar una ventana emergente que tiene varios usos.
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
        // en este caso el metodo showMessageDialog se utiliza para mostrar un mensaje en la ventana emergente.
        JOptionPane.showMessageDialog(null, resultado);
    }
}