package com.HeadFirstJava.page100to199.page121;

public class Puzzle4 {
    public static void main (String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];           //пропущенная строка
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b ();               //пропущенная строка
            obs[x].ivar = y;                        //пропущенная строка
            y = y * 10;
            x = x + 1;                              //пропущенная строка
        }
        x = 6;
        while (x > 0) {
            x = x - 1;                              //пропущенная строка
            result = result + obs[x].doStuff (x);   //пропущенная строка
        }
        System.out.println ("Результат " + result);
    }
}

class Puzzle4b {                                    //пропущенная строка
    int ivar;

    public int doStuff (int factor) {               //пропущенная строка
        if (ivar > 100){
            return ivar * factor;                   //пропущенная строка
        }
        else {
            return ivar * (5 - factor);             //пропущенная строка
        }
    }
}
//todo разобраться с этим заданием