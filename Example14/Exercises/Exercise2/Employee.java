package Example14.Exercises.Exercise2;

public abstract class Employee implements IAPartment {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void obtenerInformacion();
}