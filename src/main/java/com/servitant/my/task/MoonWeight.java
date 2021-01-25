package com.servitant.my.task;

public class MoonWeight{
    /*
    Да хоть на Луну!
    */
    public static void main(String[] args){
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight){
        double MoonWeight = earthWeight * 17.00 / 100;
        //Если в формуле вместо 17.00 написать 17, то метод вернет значение не 150.96 а 150.00, почему?
        return MoonWeight;
    }
}

