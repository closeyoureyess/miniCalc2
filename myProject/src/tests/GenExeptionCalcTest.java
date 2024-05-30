package tests;

import main.DivideByZeroExeption;
import main.GenExeptionCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenExeptionCalcTest {

    GenExeptionCalc genExeptionCalc = new GenExeptionCalc();
    DivideByZeroExeption divideByZeroExeption;

    @Test
    public void checkZero() {
        Assertions.assertInstanceOf(String.class, genExeptionCalc.checkZero("5"));
        Assertions.assertThrows(DivideByZeroExeption.class, () -> genExeptionCalc.checkZero("0"));
    }
}