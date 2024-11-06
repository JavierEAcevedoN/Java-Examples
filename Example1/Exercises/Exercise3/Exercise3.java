/** Calcular la cantidad de años para que nesecesitan para que 10000$ duplique su precion por un 7% anual */
package Exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;

        do {
            tuition = tuition + (tuition*0.07);
            year++;
        } while (tuition < 20000);

        System.out.println("La cantidad de años para que se duplique la matricula es de " + year);
    }
}