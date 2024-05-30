package tests;

import main.OtherMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherMethodsTest {

    OtherMethods otherMethods = new OtherMethods();
    Boolean check = true;

    @Test
    public void exitProgramm() {
        Assertions.assertTrue(otherMethods.exitProgramm("Exit"));
    }
}