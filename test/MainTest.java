import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSumOfPositiveNumbers(){
        int resultToTest = Main.sum(33,12);
        assertEquals(45, resultToTest);
        resultToTest = Main.sum(21,10);
        assertEquals(31, resultToTest);
    }
}
