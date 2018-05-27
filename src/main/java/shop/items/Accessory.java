package shop.items;

import shop.enums.AccessoryType;
import shop.enums.Manufacturer;

public class Accessory extends Item{

    private AccessoryType type;

    public Accessory(String model, Manufacturer manufacturer, AccessoryType type, double buyPrice, double sellPrice){
        super(model, manufacturer, buyPrice, sellPrice);
        this.type = type;
    }


    public AccessoryType getType() {
        return type;
    }
}
