package shop.items.instruments.guitars;

import shop.enums.Colour;
import shop.enums.Manufacturer;

public class AcousticGuitar extends Guitar{

    private boolean hasPickups;

    public AcousticGuitar(boolean hasPickups, String model, Manufacturer manufacturer, Colour colour,
                          int numberOfStrings, double buyPrice, double sellPrice) {
        super(model, manufacturer, colour, numberOfStrings, buyPrice, sellPrice);
        this.hasPickups = hasPickups;
    }


    public boolean hasPickups() {
        return hasPickups;
    }

    @Override
    public String play() {
        return "Plink plonk the acoustic guitar is playing";
    }
}
