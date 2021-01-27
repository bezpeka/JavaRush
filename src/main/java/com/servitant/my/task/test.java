package com.servitant.my.task;

public class test{
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.name);
        changeName(cat);
        System.out.println(cat.name);
    }

    public static String changeName(Cat cat) {
        cat.name = "Jerry";
        return null;
    }

    public static class Cat {
        String name = "Tom";
    }
}
