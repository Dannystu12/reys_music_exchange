import org.junit.Before;
import org.junit.Test;
import shop.enums.Colour;
import shop.enums.GuitarStyle;
import shop.enums.Manufacturer;
import shop.items.instruments.guitars.AcousticGuitar;
import shop.items.instruments.guitars.ElectricGuitar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void setup() {
        acousticGuitar = new AcousticGuitar(true, "Epiphone EJ-200SCE Solid Top Cutaway Acoustic/Electric Guitar", Manufacturer.EPIPHONE,
                Colour.BLACK, 6, 146.99, 304);
    }

    @Test
    public void hasStyle(){
        assertTrue(acousticGuitar.hasPickups());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink plonk the acoustic guitar is playing", acousticGuitar.play());
    }
}

