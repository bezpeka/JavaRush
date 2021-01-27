package com.servitant.level3;

public class Task9{
    public static void main(String[] args){
        int i, sum = 0;
        int rows = 5;//It is the rows to calculate factorial
        for (i = 1; i <= rows; i++){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
