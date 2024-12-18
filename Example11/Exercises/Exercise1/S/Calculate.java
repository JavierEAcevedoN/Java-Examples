package Example11.Exercises.Exercise1.S;

public class Calculate {
    public double calculateTotal(Order order) {
        double total = 0;
        for (Product product : order.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }
}