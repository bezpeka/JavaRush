package com.servitant.level4;

/*
Написать код, чтобы правильно считалось количество созданных котов (count)
и на экран выдавалось правильное их количество.
 */
public class Task7Cat {
    public static void main (String[] args) {
        Cat cat1 = new Cat ();
        Cat.count++;//напишите тут ваш код

        Cat cat2 = new Cat ();
        Cat.count++;//напишите тут ваш код

        System.out.println ("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
