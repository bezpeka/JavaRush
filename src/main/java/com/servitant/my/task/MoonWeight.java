package com.servitant.my.task;

public class MoonWeight{
/*
Да хоть на Луну!
*/
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double MoonWeight = earthWeight*17.00/100;//напишите тут ваш код
        return MoonWeight;
    }
}

