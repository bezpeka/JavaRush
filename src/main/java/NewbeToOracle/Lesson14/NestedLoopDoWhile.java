package NewbeToOracle.Lesson14;

public class NestedLoopDoWhile {
    public static void main(String[] args) {
        int hours = 0;
        OUTER:
        do {
            int minutes = 0;
            INNER:
            while (minutes < 60) {
                System.out.println(hours + ":" + minutes);
                minutes++;
            }
            hours++;
        } while (hours < 24);
    }
}
