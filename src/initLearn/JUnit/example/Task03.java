package initLearn.JUnit.example;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 
 * Использование проверок результата типа boolean
 *
 */
public class Task03 {
    @Test
    public void testBoolean1() {
        boolean value = true;
        assertTrue ("Не истина", value);
    }

    @Test
    public void testBoolean2() {
        boolean value = false;
        assertFalse ("Не ложь", value);
    }
}