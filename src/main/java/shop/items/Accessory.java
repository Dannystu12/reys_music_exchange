package shop.items;

import shop.enums.AccessoryType;

public class Accessory extends Item{

    private String name;
    private AccessoryType type;

    public Accessory(String name, AccessoryType type, double buyPrice, double sellPrice){
        super(buyPrice, sellPrice);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }


    public AccessoryType getType() {
        return type;
    }
}
