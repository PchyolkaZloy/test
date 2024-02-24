package en.pchz.banks;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Bank {
    private final String name;

    public Bank(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name of should be at least 3 symbols");
        }

        this.name = name;
    }

}
