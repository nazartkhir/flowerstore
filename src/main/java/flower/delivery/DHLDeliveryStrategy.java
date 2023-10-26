package flower.delivery;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver() {
        System.out.println("The shipment is covered by DHL");
        return true;
    }
}