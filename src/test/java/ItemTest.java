import org.junit.Before;
import org.junit.Test;
import shop.enums.AccessoryType;
import shop.enums.Manufacturer;
import shop.items.Accessory;
import shop.items.Item;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setup(){
        item = new Accessory("Dunlop 418P .88 Tortex Green Standard", Manufacturer.DUNLOP, AccessoryType.PICK,
                0.4, 0.8);
    }

    @Test
    public void hasModel(){
        assertEquals("Dunlop 418P .88 Tortex Green Standard", item.getModel());
    }

    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.DUNLOP, item.getManufacturer());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(0.4, item.getBuyPrice(), 0.001);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(0.8, item.getSellPrice(), 0.001);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.4, item.calculateMarkup(), 0.001);
    }
}
