package com.servitant.level3;

/*
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...
 */
public class Task14{
    public static void main(String[] args){
        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int q : pif){
            for (int w : pif){
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }
    }
}

