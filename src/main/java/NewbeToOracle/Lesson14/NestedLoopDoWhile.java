package NewbeToOracle.Lesson14;

public class NestedLoopDoWhile {
    public static void main(String[] args) {
        int hours = 0;
        HOURSLOOP:
        do {
            int minutes = 0;
            MINUTESLOOP:
            do {
                int seconds = 0;
                SECONDSLOOP:
                while (seconds < 60) {
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                    seconds++;
                }
                minutes++;
            } while (minutes < 60);
            hours++;
        } while (hours < 24);
    }
}
