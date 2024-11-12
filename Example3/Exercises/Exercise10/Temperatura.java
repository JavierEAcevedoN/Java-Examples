package Exercise10;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double min = 0;
        double max = 0;
        double inmin;
        double inmax;
        int num9 = 0;
        int dias = 0;
        
        
        System.out.println("Ingresa menos de 0 para terminar");
        while (true) {
            System.out.print("Ingresa la temperatura minima: ");
            inmin = input.nextDouble();
            System.out.print("Ingresa la temperatura maxima: ");
            inmax = input.nextDouble();
            if (inmin<0.0||inmax<0.0) {
                System.out.println("Terminando");
                input.close();
                break;
            } else if (inmin>inmax) {
                System.out.println("Esos valores de temperatura no son validos");
                continue;
            } else if (inmin==0.0&&inmax==0.0) {
                continue;
            } else if (inmin==9.0||inmax==9.0) {
                num9++;
            } else {
                min += inmin;
                max += inmax;
            }
            dias++;
            System.out.println("Registrado la temperatura del dia "+dias);
        }
        System.out.println("El promedio de la temperatura minima en "+dias+" dias fue de "+(min/dias));
        System.out.println("El promedio de la temperatura maxima en "+dias+" dias fue de "+(max/dias));
        System.out.println("Y el numero de errores fue de "+num9);
        System.out.println("Con un porcentaje de error del "+((num9*100)/dias)+"%");
        input.close();
    }
}