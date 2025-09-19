import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier= ()->Math.random()*100;
        System.out.println(randomSupplier.get());
    }
}
