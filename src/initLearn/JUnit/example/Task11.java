package initLearn.JUnit.example;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @RunWith позволяет объединить запуск нескольких тестовых классов в один тест
 */
@Suite.SuiteClasses ({ Task01.class, Task08.class })
@RunWith (Suite.class)
public class Task11 {}