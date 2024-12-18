package Example14.Exercises.Exercise1;

public class VehiculoCombustionComun implements VehiculoCombustion{
    public VehiculoCombustionComun() {
        System.out.println("Se ha creado un vehiculo de combustion comun");
    }

    @Override
    public void acelerar() {
        System.out.println("Se esta acelerando el vehiculo de combustion comun");
    }
    @Override
    public void apagar() {
        System.out.println("Se apago el vehiculo de combustion comun");
    }
    @Override
    public void encender() {
        System.out.println("Se encendio el vehiculo de combustion comun");
    }
}