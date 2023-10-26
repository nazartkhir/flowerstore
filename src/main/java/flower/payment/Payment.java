package flower.payment;

public interface Payment {
    String pay(double price);

    String getName();
    String getDescription();
}
