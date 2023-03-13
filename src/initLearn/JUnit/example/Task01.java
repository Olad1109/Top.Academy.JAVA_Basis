package initLearn.JUnit.example;


import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * 
 * Проверка корректности работы метода, используя тестовый метод.
 *
 */
public class Task01 {
    /**
     * Тестируемый метод.
     * Возвращает сумму входных параметров
     */
    public int test (int value1, int value2) {
        // FIXME исправь код метода таким образом, чтобы тест проходил,
        //  напиши еще три тестовых метода проверяющих работу метода test
        return value1 + value2;
    }

    /**
     * Тестирующий метод
     */
    @Test
    public void testMethod () {
        // подготовка входных данных
        int value1 = 2;
        int value2 = 2;
        // вызов тестируемого метода и получение результата
        int result = test (value1, value2);
        // сверка результата с требованиями к работе метода
        assertSame ("Неверная сумма, результат должен быть равен 4", result, 4);
    }

}