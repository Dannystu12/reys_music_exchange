import org.junit.Before;
import org.junit.Test;
import shop.enums.Colour;
import shop.enums.GuitarStyle;
import shop.enums.Manufacturer;
import shop.items.instruments.guitars.ElectricGuitar;
import shop.items.instruments.guitars.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup() {
        guitar = new ElectricGuitar(GuitarStyle.FLYING_V, "Dean Guitars VMNT AOD L Dave Mustaine Angel of Death", Manufacturer.DEAN,
                Colour.BLACK, 6, 598.89, 939.99);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

}
