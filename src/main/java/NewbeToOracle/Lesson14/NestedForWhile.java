package NewbeToOracle.Lesson14;

public class NestedForWhile {
    public static void main(String[] args) {
        for(int hours = 0; hours < 24; hours++) {
            for(int minutes = 0; minutes < 60; minutes++) {
                int seconds = 0;
                while (seconds < 60) {
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                    seconds++;
                }
            }
        }
    }
}
