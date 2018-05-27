import org.junit.Before;
import org.junit.Test;
import shop.enums.AccessoryType;
import shop.items.Accessory;
import shop.items.Item;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setup(){
        item = new Accessory("Dunlop 418P .88 Tortex Green Standard", AccessoryType.PICK,
                0.4, 0.8);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(0.4, item.getBuyPrice(), 0.001);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(0.8, item.getSellPrice(), 0.001);
    }
}
