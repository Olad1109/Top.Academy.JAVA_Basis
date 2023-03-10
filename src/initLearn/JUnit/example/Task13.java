package initLearn.JUnit.example;

import initLearn.JUnit.example.util.StringUtils;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Theories — чем-то схожа с Parameterized, но параметризует тестовый метод, а не
 * конструктор. Данные помечаются с помощью @DataPoints и @DataPoint, тестовый
 * метод — с помощью @Theory
 */

@RunWith (Theories.class)
public class Task13 {

    @DataPoints
    public static Object[][] isEmptyData = new Object[][]
            {{ "", true }, { " ", false }, { "some string", false }};

    @DataPoint
    public static Object[] nullData = new Object[] {null, true};

    @Theory
    public void testEmpty(final Object... testData) {
        final boolean actual = StringUtils.isEmpty ((CharSequence) testData[0]);
        assertEquals (testData[1], actual);
    }

}