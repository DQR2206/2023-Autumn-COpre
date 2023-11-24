import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void botaverageprice() {
        Shop shop = Shop.getInstance();
        shop.addbotcnt();
        shop.addbotcnt();
        shop.addallbotprice(1000);
        shop.addallbotprice(11);
    }

    @Test
    public void botaveragecapacity() {
        Shop shop = Shop.getInstance();
        shop.addbotcnt();
        shop.addbotcnt();
        shop.addallbotcapacity(10);
        shop.addallbotcapacity(21);
    }

    @Test
    public void equaverageprice() {
        Shop shop = Shop.getInstance();
        shop.addequcnt();
        shop.addequcnt();
        shop.addallequprice(25);
        shop.addallequprice(10);
        assertEquals(283,shop.equaverageprice());
    }

    @Test
    public void equaveragestar() {
        Shop shop = Shop.getInstance();
        shop.addallequstar(25);
        shop.addallequstar(11);
        assertEquals(22,shop.equaveragestar());
    }

    @Test
    public void foodaverageprice() {
        Shop shop = Shop.getInstance();
        shop.addfoodcnt();
        shop.addfoodcnt();
        shop.addfoodcnt();
        shop.addallfoodprice(111);
        shop.addallfoodprice(19);
        shop.addallfoodprice(1);
        assertEquals(56,shop.foodaverageprice());
    }

    @Test
    public void foodaverageenergy() {
        Shop shop = Shop.getInstance();
        shop.addallfoodenergy(111);
        shop.addallfoodenergy(10);
        assertEquals(95,shop.foodaverageenergy());
    }
}