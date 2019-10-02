import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanNumerals_ {
    private final int number;
    private final String romanValue;
    public RomanNumerals_(int number, String romanValue) {
        this.number = number;
        this.romanValue = romanValue;
    }

    @Test
    public void execute() {
        assertThat((new RomanNumerals(number).toRomanNotation()).equals(romanValue));
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][] {
                {1, "I"},
                {20, "XX"},
                {33, "XXXIII"},
                {101, "CI"},
                {249, "CCIL"},
                {548, "DXLVIII"},
                {800, "DCCC"},
                {2019, "MMXIX"},
                {3333, "MMMCCCXXXIII"},
        };
    }

}
