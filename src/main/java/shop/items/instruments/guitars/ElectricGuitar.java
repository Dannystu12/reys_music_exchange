package shop.items.instruments.guitars;

import shop.enums.Colour;
import shop.enums.GuitarStyle;
import shop.enums.Manufacturer;

public class ElectricGuitar extends Guitar{

    private GuitarStyle style;

    public ElectricGuitar(GuitarStyle style, String model, Manufacturer manufacturer, Colour colour, int numberOfStrings, double buyPrice, double sellPrice) {
        super(model, manufacturer, colour, numberOfStrings, buyPrice, sellPrice);
        this.style = style;
    }

    public GuitarStyle getStyle() {
        return style;
    }

    @Override
    public String play() {
        return "Plink plonk the electric guitar is playing";
    }
}
