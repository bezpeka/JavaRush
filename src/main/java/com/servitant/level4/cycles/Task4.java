package com.servitant.level4.cycles;

/*
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
 */
public class Task4 {
    public static void main (String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println ("SSSSSSSSSS");
            i++;
        }
    }
}
