package shop.items;

import shop.enums.Manufacturer;
import shop.interfaces.ISell;

public abstract class Item implements ISell {

    private double buyPrice;
    private double sellPrice;
    private String model;
    private Manufacturer manufacturer;

    public Item(String model, Manufacturer manufacturer, double buyPrice, double sellPrice){
        this.model = model;
        this.manufacturer = manufacturer;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }
}
