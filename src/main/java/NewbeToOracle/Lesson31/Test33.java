package NewbeToOracle.Lesson31;

public class Test33 {
    public static void main(String[] args) {
        int[] array1 = {-3, 2, 0, 8, 1};
        int[] array2 = {9, 0, 4, -10};
        System.out.println(array1[(array1 = array2)[1]]);
    }
}