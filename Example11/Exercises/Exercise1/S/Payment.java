package Example11.Exercises.Exercise1.S;

public class Payment {
    public void pay(Order order) {
        Calculate calc = new Calculate();
        System.out.println("Paying " + calc.calculateTotal(order));
    }
}