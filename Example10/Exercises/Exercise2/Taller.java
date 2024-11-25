package Example10.Exercises.Exercise2;

import java.util.ArrayList;

public class Taller {
    private int max_vehiculos;
    private int  num_vehiculos;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Taller(int max_vehiculos, int num_vehiculos) {
        this.max_vehiculos = max_vehiculos;
        this.num_vehiculos = num_vehiculos;
    }

    public void meter(Vehiculo vehiculo) {
        if (num_vehiculos < max_vehiculos) {
            vehiculos.add(vehiculo);
            System.out.println("Vehiculo agregado");
            num_vehiculos++;
        } else {
            System.out.println("No se puedo agregar el vehiculo");
        }
    }

    public void arreglarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.arrancar();
            vehiculo.parar();
            vehiculo.repostar();
            vehiculo.arrancar();
        }
        System.out.println("Se arreglaron todos los vehiculos");
    }
}