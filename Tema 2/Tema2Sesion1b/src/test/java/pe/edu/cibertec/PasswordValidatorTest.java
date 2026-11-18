package pe.edu.cibertec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    public void testValidLength() {
        assertEquals(true, PasswordValidator.isValid("Abcd123"));
    }
    @Test
    public void testNotDigit() {
        assertEquals(false, PasswordValidator.isValid("Abcdefg"));
    }
    @Test
    public void testNotUpperCase() {
        assertEquals(false, PasswordValidator.isValid("abcdef1"));
    }
    @Test
    public void testUpperCaseDigit() {
        assertEquals(true, PasswordValidator.isValid("AAbcdefee4"));
    }
    @Test
    public void testUpperCaseNotDigit() {
        assertEquals(false, PasswordValidator.isValid("AAbcdefes"));
    }
}
