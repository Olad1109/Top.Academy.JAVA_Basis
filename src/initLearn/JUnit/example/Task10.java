package initLearn.JUnit.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Метод getEven должен возвращать новый массив, в котором содержатся все четные
 * числа из исходного массива mas. Если четных чисел в массиве нет, метод должен
 * возвращать null.
 */
public class Task10 {
    // FIXME исправьте метод, чтобы все тесты проходили
    public int[] getEven(int[] mas) {
        int count = 0;
        for (int j : mas) {
            if (j % 2 == 0) {
                count ++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i ++) {
            for (int ma : mas) {
                if (ma % 2 == 0) {
                    result[i ++] = ma;
                }
            }
        } return result;
    }

    @Test
    public void testEvenExist() {
        int[] input = { 1, 2 };
        int[] result = getEven (input);
        assertArrayEquals (result, new int[] { 2 });
    }

    @Test
    public void testNotNull() {
        int[] input = { 1, 2 };
        int[] result = getEven (input);
        assertNotNull (result);
    }

    @Test
    public void testTwoEvenExist() {
        int[] input = { 1, 2, 3, 4 };
        int[] result = getEven(input);
        assertArrayEquals (result, new int[] {2, 4});
    }

    @Test
    public void testEvenNotExist() {
        int[] input = { 1, 3 };
        int[] result = getEven (input);
        assertNull (Arrays.toString(result), null);
    }

}