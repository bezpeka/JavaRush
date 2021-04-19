package com.javarush.my.task;

public class Ref{
    public static void main(String[] args){
        int m = 5;
        int n = 6;

        System.out.println("M=" + m + " N=" + n);
        int a = m, b = n;

        int c = a;
        a = b;
        b = c;

        System.out.println("M=" + m + " N=" + n);
    }
}

