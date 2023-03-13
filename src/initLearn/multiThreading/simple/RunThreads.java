package initLearn.multiThreading.simple;

/*   Многопоточность в JAVA!
   Пользователь с клавиатуры вводит значения в массив. После чего
   запускаются два потока. Первый поток находит максимум в массиве и
   сумму элементов массива. Второй поток находит минимум в массиве и
   среднеарифметическое в массиве. Результаты вычислений возвращаются
   в метод main. */

import java.util.Scanner;

class RunThreads {
    // Класс, реализующий дочерний поток в задаче
    static class Streams implements Runnable {
        private final Thread thr; // ссылка на дочерний поток
        private final int[] arrayInit;
        private int superMax, superMin;
        // Конструктор - получает массив целых чисел
        Streams (int[] _ArrayInit) {
            // Инициализация массива
            arrayInit = _ArrayInit;
            // Создание потока
            thr = new Thread (this, "Thread_1.");
            // Запуск потока
            thr.start();
        }
        // Код выполнения потока, ищущий значения Min и Max
        public void run() {
            int max = arrayInit[0];
            int min = arrayInit[0];
            for (int i = 1; i < arrayInit.length; i ++) {
                if (max < arrayInit[i]) max = arrayInit[i];
                if (min > arrayInit[i]) min = arrayInit[i];
            }
            superMax = max;
            superMin = min;
        }
        // Методы доступа к полям класса
        Thread getThread() {
            return thr;
        }
        int getMax() {
            return superMax;
        }
        int getMin() {
            return superMin;
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in); // Объявляем Scanner
        System.out.println ("Укажем количество элементов массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] arrInit_1 = new int[size]; // Создаём массив int размером в size
        System.out.println ("Заполняем массив: ");
        for (int i = 0; i < size; i ++) {
            arrInit_1[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        double sum = 0;
        for (int j : arrInit_1) {
            sum = sum + j;
        }
        double average = 0;
            if (arrInit_1.length > 0) {
                int i;
                for (i = 0; i < arrInit_1.length; i ++) {
                    sum += arrInit_1[i];
                }
                average = (sum * 0.5) / i;
                sum = sum / 2;
            }
        // Создание дочерних потоков, получение ссылок на них
        Streams t1 = new Streams (arrInit_1);
        Streams t2 = new Streams (arrInit_1);
        // Чтение результата
        try {
            t1.getThread().join();
            t2.getThread().join();
        } // ожидание завершения потоков
        catch (InterruptedException e) {
            System.out.println ("Error!");
        } // вывод сообщения на случай прерывания потока
        System.out.println ("max = " + t1.getMax());
        System.out.println ("min = " + t1.getMin());
        System.out.printf ("sum = " + "%.2f", sum);
        System.out.printf ("\naverage = " + "%.2f", average);
    }
}
