package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату

Вывести на экран текущую дату в аналогичном виде "21 02 2014".

Полезная статья по решению этой задачи
http://proglang.su/java/date-and-time
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date ();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat ("dd MM yyyy");
        System.out.println (formatForDateNow.format (date));
    }
}