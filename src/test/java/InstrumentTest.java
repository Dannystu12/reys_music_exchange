import org.junit.Before;
import org.junit.Test;
import shop.enums.Colour;
import shop.enums.Manufacturer;
import shop.items.instruments.Instrument;
import shop.items.instruments.Keyboard;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void setup(){
        instrument = new Keyboard("Yamaha PSR E453 Keyboard", Manufacturer.YAMAHA, Colour.BLACK,
                 149.99, 299.99);
    }

    @Test
    public void hasColour(){
        assertEquals(Colour.BLACK, instrument.getColour());
    }
}
