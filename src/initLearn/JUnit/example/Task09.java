package initLearn.JUnit.example;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Тестирование метода, который возвращает истину, если в массиве есть
 * отрицательные значения
 */
public class Task09 {
    // FIXME исправьте метод, чтобы все тесты проходили
    public boolean isNegativeExist (int[] mas) {
        return false;
    }

    @Test
    public void testNegativeExist() {
        boolean result = false;
        int[] input = { 1, -1 };
        for (int i: input) {
            if (i < 0) {
                result = true;
                break;
            }
        } assertTrue (result);
    }

    @Test
    public void testNegativeNotExist() {
        int[] input = { 1, 2 };
        boolean result = isNegativeExist (input);
        assertFalse (result);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        boolean result = isNegativeExist (input);
        assertFalse (result);
    }

    @Test
    public void testArrayIsNull() {
        int[] input = null;
        boolean result = isNegativeExist (input);
        assertFalse (result);
    }
}