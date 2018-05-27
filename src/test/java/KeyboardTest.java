import org.junit.Before;
import org.junit.Test;
import shop.enums.Colour;
import shop.enums.InstrumentType;
import shop.enums.Manufacturer;
import shop.items.instruments.DrumKit;
import shop.items.instruments.Keyboard;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setup(){
        keyboard =  new Keyboard("Yamaha PSR E453 Keyboard", Manufacturer.YAMAHA, Colour.BLACK,149.99,
                299.99);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARD, keyboard.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink plonk the keyboard is playing", keyboard.play());
    }
}
