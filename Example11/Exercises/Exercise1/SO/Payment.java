package Example11.Exercises.Exercise1.SO;

public interface Payment {
    void pay(Order order);
}

class PayWithCard implements Payment{
    Calculate calc = new Calculate();

    @Override
    public void pay(Order order) {
        System.out.println("Paying with Card " + calc.calculateTotal(order));
    }
}
class PayWithMoney implements Payment {
    Calculate calc = new Calculate();

    @Override
    public void pay(Order order) {
        System.out.println("Paying with Effective" + calc.calculateTotal(order));
    }
}