package com.HeadFirstJava.page1to99.page93;

public class Hobbits {
    String name;

    public static void main (String[] args) {
        Hobbits[] h = new Hobbits[6];
        int z = -1; // Тут важно что массив начинается с нулевого элемента
        while (z < 5) {
            z = z + 1;
            h[z] = new Hobbits ();
            h[z].name = "Бильбо";
            if (z == 1){
                h[z].name = "Фродо";
            }
            if (z == 2){
                h[z].name = "Сэм";
            }
            if (z == 3){
                h[z].name = "Фредегар";
            }
            if (z == 4){
                h[z].name = "Саша";
            }
            if (z == 5){
                h[z].name = "Ариша";
            }
            System.out.print (h[z].name + " - ");
            System.out.println ("имя хорошего хоббита");
        }
    }
}
