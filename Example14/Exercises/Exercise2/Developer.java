package Example14.Exercises.Exercise2;

public class Developer extends Employee{
    public Developer(String name, int age) {
        super(name,age);
    }

    @Override
    public void obtenerInformacion()  {
        System.out.println("El nombre del desarrollador es: "+name);
        System.out.println("La edad del desarrollador es: "+age);
    }
}