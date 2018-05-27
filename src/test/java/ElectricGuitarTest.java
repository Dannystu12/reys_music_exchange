import org.junit.Before;
import org.junit.Test;
import shop.enums.Colour;
import shop.enums.GuitarStyle;
import shop.enums.Manufacturer;
import shop.items.instruments.guitars.ElectricGuitar;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void setup() {
        electricGuitar = new ElectricGuitar(GuitarStyle.FLYING_V, "Dean Guitars VMNT AOD L Dave Mustaine Angel of Death", Manufacturer.DEAN,
                Colour.BLACK, 6, 598.89, 939.99);
    }

    @Test
    public void hasStyle(){
        assertEquals(GuitarStyle.FLYING_V, electricGuitar.getStyle());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink plonk the electric guitar is playing", electricGuitar.play());
    }
}

