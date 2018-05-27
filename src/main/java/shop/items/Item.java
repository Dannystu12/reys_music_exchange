package shop.items;

public abstract class Item {

    private double buyPrice;
    private double sellPrice;

    public Item(double buyPrice, double sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
