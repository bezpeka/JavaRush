package NewbeToOracle.Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Time {
    public static void main(String[] args) {
        //Данные объекты создаются не с помощью конструктора, а с помощью статического метода of
        LocalDate ld1 = LocalDate.of(2021, 8, 25);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2021, Month.AUGUST, 25);
        System.out.println(ld2);
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15, 30, 45);
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(15, 30, 45, 123456789);
        System.out.println(lt3);
        LocalDateTime ldt1 = LocalDateTime.of(2021, 8, 21, 16, 36);
        System.out.println(ldt1);
        LocalDateTime ldt11 = LocalDateTime.of(2021, Month.AUGUST, 21, 16, 36);
        System.out.println(ldt11);
        LocalDateTime ldt2 = LocalDateTime.of(2021, 8, 21, 16, 36, 45);
        System.out.println(ldt2);
        LocalDateTime ldt21 = LocalDateTime.of(2021, Month.AUGUST, 21, 16, 36, 45);
        System.out.println(ldt21);
        LocalDateTime ldt3 = LocalDateTime.of(2021, 8, 21, 16, 36, 45, 123456789);
        System.out.println(ldt3);
        LocalDateTime ldt31 = LocalDateTime.of(2021, Month.AUGUST, 21, 16, 36, 45, 123456789);
        System.out.println(ldt31);
        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt4);
    }
}
