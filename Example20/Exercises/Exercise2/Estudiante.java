package Example20.Exercises.Exercise2;

public class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double definitiva;

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularDefinitiva() {
        definitiva = (nota1+nota2+nota3)/3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    public double getDefinitiva() {
        return definitiva;
    }
}