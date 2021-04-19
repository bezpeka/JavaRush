package servitant.task.TestExample;

public class TestArray {
    public static void main ( String[] args ) {
        /** Создаем новый массим типа int и размера 10
         * Все значения в нем инициализируются нулями
         */
        int[] values = new int[10];
        //Выводим на экран значения нашего массива с указанием индекса
        for (int i = 0; i < values.length; i++) {
            System.out.println ( i + ":" + values[i] );
        }
    }

    private static void test () {
        /**   (индексы) 0, 1, 2, 3, 4
         *    Создаём массив values типа int, размера 5, с номерами ячеек         *
         */
        int[] values = {1, 5, 6, 8, 9};
        // Выводим на экран третье значение массива равное 6
        System.out.println ( values[2] );
        // Меняем 8 на 18 и выводим на экран
        values[3] = 18;
        System.out.println ( values[3] );
    }
}
