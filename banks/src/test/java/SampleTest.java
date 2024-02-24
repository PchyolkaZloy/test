import en.pchz.banks.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    public void BanksWth4SymbolsShouldBeCreated() {
        final String name = "ABCD";

        Bank bank = new Bank(name);

        assertEquals(name, bank.getName());
    }

    @Test
    public void BanksWth3SymbolsShouldBeCreated() {
        final String name = "AB";

        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Bank bank = new Bank(name);
                });
    }
}
