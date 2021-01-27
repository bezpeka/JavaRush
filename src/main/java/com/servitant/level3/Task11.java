package com.servitant.level3;

/*
Добавь метод public static int convertToSeconds(int hour)
который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
 */
public class Task11{
    /*
    Конвертируем время
    */
    public static void main(String[] args){
        System.out.println(convertToSeconds(10));
        System.out.println(convertToSeconds(5));
    }

    public static int convertToSeconds(int hour){
        return hour * 3600;
    }
}


