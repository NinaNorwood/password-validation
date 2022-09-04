import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class passwordTest {


    @Test
    public void testLengthFor8() {
        String kennwort = "Blume123";
        String actual = password.letterAmount(kennwort);
        assertEquals("8", actual);
    }

    @Test
    public void testLengthFor11() {
        String kennwort = "verschenken";
        String actual = password.letterAmount(kennwort);
        assertEquals("11", actual);
    }

    @Test
    public void testForNumbersIncluded() {
        String kennwort = "Blume123";
        boolean actual = password.includesNumbers(kennwort);
        assertEquals(true, actual);
    }

    @Test
    public void testForNumbersNotIncluded() {
        String kennwort = "Blume";
        boolean actual = password.includesNumbers(kennwort);
        assertEquals(false, actual);
    }
}
