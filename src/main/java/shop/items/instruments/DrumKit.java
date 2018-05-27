package shop.items.instruments;

import shop.enums.Colour;
import shop.enums.InstrumentType;
import shop.enums.Manufacturer;

public class DrumKit extends Instrument {

    public DrumKit(String model, Manufacturer manufacturer, Colour colour, double buyPrice, double sellPrice) {
        super(model, manufacturer, colour, InstrumentType.PERCUSSION, buyPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Plink plonk the drum kit is playing";
    }
}
