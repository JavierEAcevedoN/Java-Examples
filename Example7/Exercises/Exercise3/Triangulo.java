package Example7.Exercises.Exercise3;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private double angulo1;
    private double angulo2;
    private double angulo3;

    public Triangulo(double lado1, double lado2, double lado3) {
        if ((lado1 + lado2)>lado3&&(lado1 + lado3)>lado2&&(lado2 + lado3)>lado1) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            System.out.println("Esos lados no son validos");
            this.lado1 = 2.0;
            this.lado2 = 3.0;
            this.lado3 = 4.0;
        }
    }

    public void calcularAngulo() {
        angulo1 = Math.toDegrees(Math.acos((Math.pow(lado2, 2)+Math.pow(lado3, 2)-Math.pow(lado1, 2))/(2*lado2*lado3)));
        angulo2 = Math.toDegrees(Math.acos((Math.pow(lado1, 2)+Math.pow(lado3, 2)-Math.pow(lado2, 2))/(2*lado1*lado3)));
        angulo3 = Math.toDegrees(Math.acos((Math.pow(lado1, 2)+Math.pow(lado2, 2)-Math.pow(lado3, 2))/(2*lado1*lado2))); 
    }

    public double getGrado1() {
        return angulo1;
    }

    public double getGrado2() {
        return angulo2;
    }

    public double getGrado3() {
        return angulo3;
    }

    public void calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo es de: "+perimetro);
    }

    public void calcularAnguloInterno() {
        double aInterno = angulo1 + angulo2 + angulo3;
        System.out.println("La medida del angulo interno es de: "+aInterno);
    }

    public void tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es un triangulo equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es un triangulo isósceles");
        } else {
            System.out.println("El triangulo es un triangulo escaleno");
        }
    }

    public void areaHeron() {
        double semiperimetro = (lado1+lado2+lado3)/2;

        double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));

        System.out.println("El area del triangulo utilizando la formula de Heron es: "+area);
    }

    public void areaFormula() {
        double area = 0.5 * lado1 * lado2 * Math.sin(Math.toRadians(angulo3));

        System.out.println("El area del triangulo utilizando la formula de clasica es: "+area);
    }
}
class InnerTriangulo {
    public static void main(String[] args) {
        Triangulo tr = new Triangulo(5, 6, 7);
        tr.calcularAngulo();
        tr.calcularAnguloInterno();
        tr.tipoTriangulo();
        tr.calcularPerimetro();
        tr.areaHeron();
        tr.areaFormula();
    }
}