import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.enums.AccessoryType;
import shop.enums.Colour;
import shop.enums.GuitarStyle;
import shop.enums.Manufacturer;
import shop.items.Accessory;
import shop.items.Item;
import shop.items.instruments.DrumKit;
import shop.items.instruments.Keyboard;
import shop.items.instruments.guitars.AcousticGuitar;
import shop.items.instruments.guitars.ElectricGuitar;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Item item;

    @Before
    public void setup(){
        shop = new Shop();
        shop.addItem(new Keyboard("Yamaha PSR E453 Keyboard", Manufacturer.YAMAHA, Colour.BLACK,149.99,
                299.99));
        shop.addItem(new ElectricGuitar(GuitarStyle.FLYING_V, "Dean Guitars VMNT AOD L Dave Mustaine Angel of Death", Manufacturer.DEAN,
                Colour.BLACK, 6, 598.89, 939.99));
        shop.addItem(new AcousticGuitar(true, "Epiphone EJ-200SCE Solid Top Cutaway Acoustic/Electric Guitar", Manufacturer.EPIPHONE,
                Colour.BLACK, 6, 146.99, 304));
        shop.addItem(new DrumKit("Roland TD-1K Electronic V-Drum Kit", Manufacturer.ROLAND, Colour.BLACK,
                350, 450));
        shop.addItem(new Accessory("Dunlop 418P .88 Tortex Green Standard", Manufacturer.DUNLOP, AccessoryType.PICK,
                0.4, 0.8));

        item = new Accessory("Snark SN5X Guitar Bass and Violin Clip On Tuner", Manufacturer.SNARK, AccessoryType.TUNER,
                5.99, 10.99);
    }

    @Test
    public void hasMoney(){
        assertEquals(0, shop.getMoney(), 0.001);
    }

    @Test
    public void canAddItems(){
        assertEquals(5, shop.stockCount());
        shop.addItem(item);
        assertEquals(6, shop.stockCount());
    }

    @Test
    public void canRemoveItemExists(){
        shop.addItem(item);
        shop.removeItem(item);
        assertEquals(5, shop.stockCount());
    }

    @Test
    public void cantRemoveItemDoesntExists(){
        shop.removeItem(item);
        assertEquals(5, shop.stockCount());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(748.51, shop.calculateMarkup(), 0.001);
    }

    @Test
    public void canSellExistingItem(){
        shop.addItem(item);
        shop.sellItem(item);
        assertEquals(item.getSellPrice(), shop.getMoney(), 0.001);
        assertEquals(5, shop.stockCount());

    }

    @Test
    public void cannotSellItemNotInStock(){
        shop.sellItem(item);
        assertEquals(0, shop.getMoney(), 0.001);
        assertEquals(5, shop.stockCount());
    }

}
