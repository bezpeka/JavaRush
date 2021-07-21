package NewbeToOracle.Lesson14;

/*
Тестирую вложенные циклы на основе часов
Специально циклы сделал одинаковыми, по 100 итераций,
чтобы ограничить их с помощью имен циклов.
 */
public class NestedLoopFor {
    public static void clock() {
        HOURSLOOP:
        for(int hours = 0; hours <= 100; hours++) {
            if(hours == 24){
                break HOURSLOOP;
            }
            MINUTESLOOP:
            for(int minutes = 0; minutes < 100; minutes++) {
                if(minutes == 60){
                    break MINUTESLOOP;
                }
                SECONDSLOOP:
                for(int seconds = 0; seconds < 100; seconds++) {
                    if(seconds == 60){
                        break SECONDSLOOP;
                    }
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                }
            }
        }
    }


    public static void main(String[] args) {
        clock();
    }
}
