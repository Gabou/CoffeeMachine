import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HistoryTest {

    private History history;

    @Before
    public void setUp() throws Exception {
        history = new History();
    }

    @Test
    public void reportingEmptyHistory() {
        Assert.assertEquals("T:0 C:0 H:0 O:0 0.0", history.getHistory());
    }

    @Test
    public void reportingHistoryWithOneDrink() {
        history.addDrink(Drink.TEA);

        Assert.assertEquals("T:1 C:0 H:0 O:0 0.4", history.getHistory());
    }

    @Test
    public void reportingHistoryWithDrinks() {
        history.addDrink(Drink.COFFEE);
        history.addDrink(Drink.CHOCOLATE);
        history.addDrink(Drink.TEA);
        history.addDrink(Drink.CHOCOLATE);
        history.addDrink(Drink.TEA);
        history.addDrink(Drink.TEA);
        history.addDrink(Drink.COFFEE);
        history.addDrink(Drink.ORANGE_JUICE);

        Assert.assertEquals("T:3 C:2 H:2 O:1 4.0", history.getHistory());
    }
}