import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DrinkOrdererTest {

    private DrinkOrderer drinkOrderer;

    @Before
    public void setUp() throws Exception {
        drinkOrderer = new DrinkOrderer();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sendingTeaMessageWithoutSugar() {
        Assert.assertEquals("T::", drinkOrderer.createCommand(Drink.TEA,0, 0.4));
    }

    @Test
    public void sendingCoffeeMessageWithoutSugar() {
        Assert.assertEquals("C::", drinkOrderer.createCommand(Drink.COFFEE,0, 0.6));
    }

    @Test
    public void sendingChocolateMessageWithoutSugar() {
        Assert.assertEquals("H::", drinkOrderer.createCommand(Drink.CHOCOLATE,0, 0.5));
    }

    @Test
    public void sendingTeaMessageWithOneSugar() {
        Assert.assertEquals("T:1:0", drinkOrderer.createCommand(Drink.TEA,1, 0.4));
    }

    @Test
    public void sendingChocolateWithTwoSugar() {
        Assert.assertEquals("H:2:0", drinkOrderer.createCommand(Drink.CHOCOLATE,2, 0.5));
    }

    @Test
    public void sendingGiveYourMoneyMessage() {
        Assert.assertEquals("M:Give your money", drinkOrderer.sendMessage("Give your money"));
    }

    @Test
    public void sendingThankYouMessage() {
        Assert.assertEquals("M:Thank you", drinkOrderer.sendMessage("Thank you"));
    }

    @Test
    public void sendingMessageBecauseOfNotEnoughMoney() {
        Assert.assertEquals("M:Missing 0.3 dollar", drinkOrderer.createCommand(Drink.CHOCOLATE,0,0.2));
    }

    @Test
    public void sendingCoffeeCommandWithOneDollarMore() {
        Assert.assertEquals("C::", drinkOrderer.createCommand(Drink.COFFEE,0,1.6));
    }

}