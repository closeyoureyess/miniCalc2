package tests;

import main.MathOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathOperationsTest {

    MathOperations mathOperations = new MathOperations();
    @Test
    public void multiplicationMethod() {
        int number = mathOperations.multiplicationMethod(5, 10);
        Assertions.assertEquals(50, number);
    }

    @Test
    public void sumMethod() {
        int number = mathOperations.sumMethod(5, 5);
        Assertions.assertEquals(10, number);
    }

    @Test
    public void substractionMethod() {
        int number = mathOperations.substractionMethod(10, 5);
        Assertions.assertEquals(5, number);
    }

    @Test
    public void divisionMethod() {
        int number = mathOperations.divisionMethod(10, 5);
        Assertions.assertEquals(2, number);
    }
}