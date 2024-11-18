package Example7.Exercises.Exercise1;

import java.util.Random;
import javax.swing.JOptionPane;


public class AdivinarNumero {
    Random random = new Random();

    private int numero;
    private int intentos;
    private int max;

    AdivinarNumero () {
        intentos = 1;
        max = 1000;
    }

    public void setNumero() {
        numero = random.nextInt(max)+1;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = (int) max;
    }

    public void Jugar() {
        String[] opciones = {"Si","No"};
        int decicion;
        this.setNumero();
        while (true) {
            if (max<5) {
                JOptionPane.showMessageDialog(null, "llegaste a la maxima cantidad de intentos", "No puedes jugar mas", -1);
                decicion = JOptionPane.showOptionDialog(null, "Quiere jugar otra vez?", "Jugar de nuevo?", JOptionPane.DEFAULT_OPTION, -1, null, opciones, opciones[0]);
                if (decicion == 0) {
                    this.setIntentos(1);
                    this.setMax(1000);
                    this.Jugar();
                } else {
                    break;
                }
            }
            int numeroJugador = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige un numero", "Adivina el numero", -1));
            if (numeroJugador == numero) {
                JOptionPane.showMessageDialog(null, "¡Adivino el numero!", "Adivinaste", -1);
                if (intentos == 10) {
                    JOptionPane.showMessageDialog(null, "¡Aja! ¡Sabía usted el secreto!", "Adivinaste", -1);
                } else if (intentos<10) {
                    JOptionPane.showMessageDialog(null, "¡O ya sabía usted el secreto, o tuvo suerte!", "Adivinaste", -1);
                } else { 
                    JOptionPane.showMessageDialog(null, "¡Debería haberlo hecho mejor! ¿Por qué no se deben requerir más de 10 intentos?", "Adivinaste", -1);
                }
                decicion = JOptionPane.showOptionDialog(null, "Quiere jugar otra vez?", "Jugar de nuevo?", JOptionPane.DEFAULT_OPTION, -1, null, opciones, opciones[0]);
                if (decicion == 0) {
                    this.setIntentos(1);
                    this.setMax(1000);
                    this.Jugar();
                } else {
                    break;
                }
            } else if (numeroJugador<numero) {
                JOptionPane.showMessageDialog(null, "Demasiado bajo", "No adivinaste", -1);
                setIntentos(this.intentos+1);
            } else {
                JOptionPane.showMessageDialog(null, "Demasiado alto", "No adivinaste", -1);
                setIntentos(this.intentos+1);
            }
            setMax(max/2);
            this.setNumero();
        }
    }
}

class InnerAdivinarNumero {
    public static void main(String[] args) {
        AdivinarNumero juego = new AdivinarNumero();
        juego.Jugar();
    }
}