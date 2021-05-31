package com.HeadFirstJava.page200to299.page285;

public class TestHippo {
    public static void main (String[] args) {
        Hippo h = new Hippo ("Buffy");                        //Создаем Hippo, передаем его конструктору имя
        System.out.println ("Our Hippo name is - " + h.getName ());  //Вызываем метод getName,
    }                                                               //унаследованный классом Hippo от родителя Animal
}
