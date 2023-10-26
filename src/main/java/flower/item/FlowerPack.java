package flower.item;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        double one = flower.getPrice();
        return one * quantity;

    }
}
