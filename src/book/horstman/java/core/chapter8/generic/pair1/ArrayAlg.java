package book.horstman.java.core.chapter8.generic.pair1;

import book.horstman.java.core.chapter8.generic.Pair;

public class ArrayAlg {
    /**
     * Получает символьные строки с минимальным и
     * максимальным значениями среди элементов массива
     *
     * @param a Массив символьных строк
     * @return Пара минимального и максимального значений
     * или пустое значение, если параметр а имеет
     * пустое значение
     */
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                min = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}















