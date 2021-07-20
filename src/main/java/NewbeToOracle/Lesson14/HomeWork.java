package NewbeToOracle.Lesson14;

/*
Создать класс. В классе создать статичный метод, который будет
выводить на экран время в формате "час:минута:секунда" в интервале от 0 до 6 часов.
Если час больше единицы и минута кратна 10-ти, то метод нужно закончить.
Если же (секунда умноженная на час) больше минуты, то пора переходить на другую минуту.
Продемонстрировать данный метод в действии.
 */
public class HomeWork {
    public static void clock() {
        HOURSLOOP:
        for(int hours = 0; hours < 6; hours++) {
            MINUTESLOOP:
            for(int minutes = 0; minutes < 60; minutes++) {
                if(hours > 1 && minutes % 10 == 0){
                    break HOURSLOOP;
                }
                SECONDSLOOP:
                for(int seconds = 0; seconds < 60; seconds++) {
                    if(seconds * hours > minutes){
                        continue MINUTESLOOP;
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

