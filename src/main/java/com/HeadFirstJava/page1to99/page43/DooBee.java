package com.HeadFirstJava.page1to99.page43;

/*
Задача, стр 43
Текст который нужно вывести DooBeeDooBeeDo
 */
public class DooBee {
    public static void main (String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print ("Doo");
            System.out.print ("Bee");
            x = x + 1;
        }
        if (x == 3){
            System.out.println ("Do");
        }
    }
}