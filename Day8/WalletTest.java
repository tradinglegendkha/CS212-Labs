package Day8;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WalletTest {
    @Test
    public void test() {
        Wallet wa = new Wallet();
        System.out.println("Test: ");
        assertEquals(100.00, wa.addMoney(2, wa.getFifty()), 0);

    }

}
