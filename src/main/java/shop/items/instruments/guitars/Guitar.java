package shop.items.instruments.guitars;

import shop.enums.Colour;
import shop.enums.InstrumentType;
import shop.enums.Manufacturer;
import shop.items.instruments.Instrument;

public abstract class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String model, Manufacturer manufacturer, Colour colour, int numberOfStrings,
                  double buyPrice, double sellPrice) {
        super(model, manufacturer, colour, InstrumentType.GUITAR, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
