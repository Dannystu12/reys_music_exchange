package shop;

import shop.items.Item;
import shop.items.instruments.Instrument;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private double money;
    private List<Item> stock;

    public Shop() {
        stock = new ArrayList<>();
        money = 0;
    }

    public double getMoney() {
        return money;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addItem(Item item) {
        stock.add(item);
    }

    public void removeItem(Item item) {
        stock.remove(item);
    }

    public double calculateMarkup() {
        return stock.stream().map(Item::calculateMarkup).reduce(0.0, (total, markup) -> total + markup);
    }

    public void sellItem(Item item){
        if(stock.contains(item)){
            removeItem(item);
            addMoney(item.getSellPrice());
        }
    }

    private void addMoney(double money){
        if(money <= 0) return;
        this.money += money;
    }
}
