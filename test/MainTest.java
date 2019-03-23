import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSumOfPositiveNumbers(){
        int resultToTest = Main.sum(33,12);
        assertEquals(45, resultToTest);

        resultToTest = Main.sum(2147483647,1);
        assertEquals(-2147483648, resultToTest);
    }

    @Test
    public void testSubstructionOfPositiveMunbers() {
        int resultToTest = Main.substruct(21,10);
        assertEquals(11, resultToTest);
    }

    @Test
    public void testMultiplicationOfPositiveNumbers() {
        int resultToTest = Main.multiply(10, 15);
        assertEquals(150, resultToTest);
    }

    @Test
    public void testDivisionOfPositiveNumbers(){
        int resultToTest = Main.divide(21,7);
        assertEquals(3, resultToTest);
    }
}
