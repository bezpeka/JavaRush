package NewbeToOracle.Lesson27;

public class Test {
    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("Массив из трёх значений создан");
        try {
            System.out.println(array[5]);
            System.out.println("Этот текст выведен не будет");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошло исключение: " + e + " значения массива не существует");
        }
        System.out.println("Наша программа продолжила свою работу дальше");
    }
}
