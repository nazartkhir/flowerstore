package flower.payment;

public interface Payment {
    public String pay(double price);

    public String getName();
    public String getDescription();
}
