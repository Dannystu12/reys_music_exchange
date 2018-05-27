import org.junit.Before;
import org.junit.Test;
import shop.enums.AccessoryType;
import shop.enums.Manufacturer;
import shop.items.Accessory;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void setup(){
        accessory = new Accessory("Dunlop 418P .88 Tortex Green Standard", Manufacturer.DUNLOP, AccessoryType.PICK,
                0.4, 0.8);
    }


    @Test
    public void hasType(){
        assertEquals(AccessoryType.PICK, accessory.getType());
    }
}
