package com.javarush.afterPause;

public class testCalc {
    public static void main(String[] args) {
        double k1 = 9.164218513153935;
        double k2 = 42.17367388182621;
        double k3 = 13.964693708952195;
        double k4 = 18.27749468559262;
        double rating = (k1 * 352.3 + k2 * 79.69 + k3 * 44.87 + k4 * 66.59) -5401.219452018892; //3208 (3031)
        //double rating = (k1 * 270.1 + k2 * 55.03 + k3 * 53.79 + k4 * 68.19) -5401.219452018892; //1381 (1392)
        // Вывод рейтинга на экран
        System.out.println("Рейтинг автомобиля: " + rating);
    }
}
