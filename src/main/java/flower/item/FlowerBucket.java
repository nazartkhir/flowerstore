package flower.item;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

public class FlowerBucket {
    @Getter @Setter
    private ArrayList<FlowerPack> bucket = new ArrayList<>();
    public void add(FlowerPack pack) {
        bucket.add(pack);
    }
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < bucket.size(); i++) {
            price += this.bucket.get(i).getPrice();
        }
        return price;
    }
}
