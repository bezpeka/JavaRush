package com.javarush.task.task06.task0601;

/*
Метод finalize класса Cat

В классе Cat создать метод protected void finalize() throws Throwable.
*/

public class Cat {
    //напишите тут ваш код

    @Override
    protected void finalize () throws Throwable { //синтаксис идея подставила сама
        super.finalize ();
    }

    public static void main (String[] args) {

    }
}