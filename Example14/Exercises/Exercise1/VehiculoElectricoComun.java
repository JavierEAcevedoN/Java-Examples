package Example14.Exercises.Exercise1;

public class VehiculoElectricoComun implements VehiculoElectrico{
    public VehiculoElectricoComun() {
        System.out.println("Se ha creado un vehiculo electrico comun");
    }

    @Override
    public void activar() {
        System.out.println("Se activo el vehiculo electrico comun");
    }
    @Override
    public void conectar() {
        System.out.println("Se conecto el vehiculo electrico comun");
    }
    @Override
    public void desconectar() {
        System.out.println("Se desconeto el vehiculo electrico comun");
    }
    @Override
    public void moverMasRapido() {
        System.out.println("El vehiculo electrico comun es mas rapido");
    }
    @Override
    public void detener() {
        System.out.println("Se detenio el vehiculo electrico comun");
    }
}