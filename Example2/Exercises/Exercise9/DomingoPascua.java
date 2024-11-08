package Example2.Exercises.Exercise9;

import java.util.Scanner;
/**
 *
 * @author JavierEAcevedoN
 */
public class DomingoPascua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int año;
        int A;
        int B;
        int C;
        int D;
        int E;
        int N;

        while (true) {            
            System.out.print("Ingresa un año: ");
            año = input.nextInt();
            
            if (año>0) {
                break;
            }
            
            System.out.println("Ingresa un año positivo");
        } 
        
        A = año % 19;
        B = año % 4;
        C = año % 7;
        D = (19 * A + 24) % 30;
        E = (2 * B + 4 * C + 6 * D + 5) % 7;
        N = (22 + D + E);
        
        if (N > 31) {
            System.out.println("El domingo de pascua es el "+(N-31)+" de Abril");
        } else {
            System.out.println("El domingo de pascua es el "+N+" de Marzo");
        }

        input.close();
    }
}