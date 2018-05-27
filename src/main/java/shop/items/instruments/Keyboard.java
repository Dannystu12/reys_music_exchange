package shop.items.instruments;

import shop.enums.Colour;
import shop.enums.InstrumentType;
import shop.enums.Manufacturer;

public class Keyboard extends Instrument{
    public Keyboard(String model, Manufacturer manufacturer, Colour colour, double buyPrice, double sellPrice) {
        super(model, manufacturer, colour, InstrumentType.KEYBOARD, buyPrice, sellPrice);
    }

    @Override
    public String play(){
        return "Plink plonk the keyboard is playing";
    }
}
