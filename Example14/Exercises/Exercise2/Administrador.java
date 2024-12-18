package Example14.Exercises.Exercise2;

public class Administrador extends Employee{
    public Administrador(String name, int age) {
        super(name,age);
    }

    @Override
    public void obtenerInformacion()  {
        System.out.println("El nombre del diseñador es: "+name);
        System.out.println("La edad del diseñador es: "+age);
    }
}