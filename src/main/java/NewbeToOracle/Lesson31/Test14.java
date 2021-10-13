package NewbeToOracle.Lesson31;

public class Test14 {
    public static void main(String[] args) {
        String[][] array = {{"A", "B", "C"}, null, {"D"}, new String[8]};
        System.out.println(array);
        System.out.println(array[1]);
        System.out.println(array[0][2]);
        System.out.println(array[3][0]);
        System.out.println(array[3][5].length());
    }
}
