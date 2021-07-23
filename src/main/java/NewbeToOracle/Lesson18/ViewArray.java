package NewbeToOracle.Lesson18;

public class ViewArray {
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print("{");
            for(int j = 0; j < array[i].length; j++) {
                if(j != array[i].length - 1){
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if(i != array.length - 1){
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        String array[][] = {{"apple", "orange"}, {"hello", "bye", "ok"}, {"car", "bike"}};
        showArray(array);
        showArray(new String[][]{{"man", "woman"}, {"male", "female"}});
    }
}
