package com.javarush.array.task;

public class Task5 {
    public static void main(String[] args) {
        String[][] argv = {
                {"vasya", "lena", "katya", "serg"},
                {"sasha", "yana", "lyuba", "maks"},
                {"olya", "yulya", "galya", "petr"}
        };
        //задаем строковый двумерный массив с 12 значениями
        //argv[1][0] = "marina";
        //меняем значение массива с указанным индексом, Сашу на Марину
        for(int i = 0; i < 4; i++) {
            System.out.println("hello, " + argv[0][i]);
            //печатаем каждый 1 элемент массивов
            System.out.println("hello, " + argv[1][i]);
            //печатаем каждый 2 элемент 1 массивов
            System.out.println("hello, " + argv[2][i]);
            //печатаем каждый 3 элемент массивов
        }
/*        for (int i = 0; i < 3; i++ )
        {
            System.out.println("hello, " + argv[i][0]);
            //печатаем первый элемент каждого массива
            System.out.println("hello, " + argv[i][1]);
            //печатаем второй элемент каждого массива
            System.out.println("hello, " + argv[i][2]);
            //печатаем третий элемент каждого массива
            System.out.println("hello, " + argv[i][3]);
            //печатаем четвертый элемент каждого массива
        }*/
    }
}
