package pe.edu.cibertec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YearUtilitiesTest {
    @Test
    public void test1() {
        assertTrue(YearUtilities.isLeap(4));//es bisiesto
    }
    @Test
    public void test2() {
        assertFalse(YearUtilities.isLeap(6));//no es bisiesto
    }
    @Test
    public void test3() {
        assertFalse(YearUtilities.isLeap(100));//no es bisiesto
    }
    @Test
    public void test4() {
        assertTrue(YearUtilities.isLeap(400));//es bisiesto
    }
    @Test
    public void test5() {
        assertFalse(YearUtilities.isLeap(2015));//no es bisiesto
    }
    @Test
    public void test6() {
        assertTrue(YearUtilities.isLeap(2016));//es bisiesto
    }
}
