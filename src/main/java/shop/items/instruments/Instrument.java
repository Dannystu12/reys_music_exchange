package shop.items.instruments;

import shop.enums.Colour;
import shop.enums.InstrumentType;
import shop.enums.Manufacturer;
import shop.items.Item;

public abstract class Instrument extends Item {

    private InstrumentType type;
    private Colour colour;


    public Instrument(String model, Manufacturer manufacturer, Colour colour, InstrumentType type, double buyPrice, double sellPrice){
        super(model, manufacturer, buyPrice, sellPrice);
        this.colour = colour;
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }

    public Colour getColour() {
        return colour;
    }
}
