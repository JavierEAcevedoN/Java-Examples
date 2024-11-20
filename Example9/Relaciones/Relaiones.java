package Example9.Relaciones;

public class Relaiones {
    public static void main(String[] args) {
        // Aqui se crea el elemento de la clase bateria directamente dentro del elemento de la clase, lo que significa que si borro el elemento padre se borra el elemento hijo.
        SmartPhone cel = new SmartPhone("A10PRO", 3400, "Samsung");

        // Aqui se crea los elemntos de la clase chip que son independiente, lo que significa que aunque se borre el elemento clase.
        Chip intel = new Chip("Intel", "25458575454");
        Chip tigo = new Chip("Tigo", "5251421151");

        cel.agrgarChip(intel);
        cel.agrgarChip(tigo);

        cel.mostrar();
    }
}

class SmartPhone {
    private String modelo;
    private  Bateria bateria;
    private int nroChips;
    private Chip[] chips;


    public SmartPhone(String modelo, int cantMAh, String marcaBateria) {
        this.modelo = modelo;
        // Relacion por compocision, se refiere a que el elemento creado depende del elemento padre.
        // En este caso la clase bateria depende de la clase smartphone ya que si se elimina el elemento padre
        // Se elimina el elemento hijo.
        this.bateria = new Bateria(cantMAh, marcaBateria);
        this.nroChips = 0;
        // Relacion por agregacion, se se refiere a que el elemento creado es independiente del elemento padre.
        // En este caso la clase chip no depende de la clase smartphone ya que si se elimina el elemento padre
        // No se elimina el elemento hijo.
        this.chips = new Chip[2];
    }

    public void mostrar() {
        System.out.println("Modelo: "+this.modelo);
        bateria.mostrar();
        System.out.println("Nro de chips: "+this.nroChips);
        for (Chip chip : chips) {
            System.out.println(chip);
        }
    }

    public void agrgarChip(Chip chip) {
        if (this.nroChips < chips.length) {
            chips[this.nroChips] = chip;
            this.nroChips++;
        }
    }
}