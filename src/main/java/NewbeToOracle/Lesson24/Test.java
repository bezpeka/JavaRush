package NewbeToOracle.Lesson24;

public class Test {
    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("Массив из трёх значений создан");
        try {
            System.out.println(array[5]);
            System.out.println("Этот текст выведен не будет");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошло исключение, которое мы обработали");
        }
        System.out.println("Наша программа после него продолжила свою работу");
    }
}
