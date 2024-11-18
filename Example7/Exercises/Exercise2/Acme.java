package Example7.Exercises.Exercise2;

import java.util.Scanner;

public class Acme {
    private String nombre;
    private int cc;
    private int edad;
    private String tipoEmpleo;
    private double salarioHora;
    private int horasTrabajadas;

    public Acme(String nombre, int cc, int edad, int tipoEmpleo) {
        this.nombre = nombre;
        this.cc = cc;
        this.edad = edad;
        switch (tipoEmpleo) {
            case 1:
                this.tipoEmpleo = "auxiliar";
                this.salarioHora = 12187.50;
                break;
            case 2:
                this.tipoEmpleo = "profesional";
                this.salarioHora = 26595.74;
                break;
            case 3:
                this.tipoEmpleo = "subgerente";
                this.salarioHora = 58024.17;
                break;
            case 4:
                this.tipoEmpleo = "gerente";
                this.salarioHora = 93750;
                break;
            default:
                this.tipoEmpleo = "auxiliar";
                this.salarioHora = 12187.50;
                break;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getcc() {
        return cc;
    }

    public void setcc(int cc) {
        this.cc = cc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoEmpleo() {
        return tipoEmpleo;
    }

    public void setTipoEmpleo(String tipoEmpleo) {
        this.tipoEmpleo = tipoEmpleo;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (0<horasTrabajadas && horasTrabajadas < 161) {
            this.horasTrabajadas = horasTrabajadas;
        } else {
            System.out.println("Esa cantidad de horas no es valida");
            this.horasTrabajadas = 1;
        }
    }

    public void calcularNomina() {
        System.out.println("El salario por hora es de: " + this.salarioHora);
        long salarioBruto = (long) (this.horasTrabajadas * this.salarioHora);
        System.out.println("El salario bruto es de: " + salarioBruto);
        if (salarioBruto < 2600000) {
            salarioBruto += 300000;
            System.out.println(
                    "Al salario bruto se le agrego un auxilio de transporte de 300.000 el salario bruto es de: "
                            + salarioBruto);
        }
        if (this.edad > 50) {
            salarioBruto += 100000;
            System.out.println("Al salario bruto se le agrego un bono de experiencia 100.000 el salario bruto es de: "
                    + salarioBruto);
        }
        long salarioNeto = salarioBruto;
        salarioNeto -= salarioNeto * 0.4;
        System.out.println("El salario bruto con un descuento de 4% por la salud es de: " + salarioNeto);
        salarioNeto -= salarioNeto * 0.4;
        System.out.println("El salario bruto con un descuento de 4% por la pension es de: " + salarioNeto);
        System.out.println("El salario neto es de: " + salarioNeto);
    }
}

class InnerAcme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingresa el numero de la cedula: ");
        int cc = input.nextInt();
        System.out.print("Ingresa la edad: ");
        int edad = input.nextInt();
        System.out.print("Ingresa de cargo (1-4): ");
        int tipoEmpleo = input.nextInt();

        Acme trabajador = new Acme(nombre, cc, edad, tipoEmpleo);

        System.out.print("Ingresa las horas trabajadas: ");
        int horasTrabajadas = input.nextInt();
        trabajador.setHorasTrabajadas(horasTrabajadas);

        trabajador.calcularNomina();

        input.close();
    }
}