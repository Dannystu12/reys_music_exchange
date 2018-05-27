import org.junit.Before;
import org.junit.Test;
import shop.enums.Colour;
import shop.enums.InstrumentType;
import shop.enums.Manufacturer;
import shop.items.instruments.DrumKit;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void setup(){
        drumKit =  new DrumKit("Roland TD-1K Electronic V-Drum Kit", Manufacturer.ROLAND, Colour.BLACK,
                350, 450);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION, drumKit.getType());
    }
}
