package NewbeToOracle.Lesson31;

public class Test33 {
//    public static void main(String[] args) {
//        int[] array1 = {-3, 2, 0, 8, 1};
//        int[] array2 = {9, 0, 4, -10};
//        System.out.println(array1[(array1 = array2)[1]]); //объяснение ниже
    /*
    Здесь мы выводим на экран элемент первого массива, который имеет индекс = (array1 = array2)[1].
    Тут мы приравняли ссылку первого массива ко второму, после чего первый массив станет недоступен.
    Так как первый индекс второго массива, это ноль, то на экран выводится нулевой индекс первого массива -3,
    до того как он станет недоступным на следующей строке.
     */
//    }

    public static void main(String[] args) {
        int[] array1 = {-3, 2, 0, 8, 1};
        int[] array2 = {9, 0, 4, -10};
        int k = 1;//тут могут быть 1 или 2
        int m = (array2)[k]; // если k = 1, то m = 0, а если k = 2, то m = 4
        System.out.println("k =" + " " + k);
        System.out.println("m =" + " " + m);
        System.out.println(array1[m]); //выводим на экран m-й элемент первого массива
    }
}