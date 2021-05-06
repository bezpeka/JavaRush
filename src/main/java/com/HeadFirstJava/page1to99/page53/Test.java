package com.HeadFirstJava.page1to99.page53;

public class Test {
    public static void main (String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y;              // 1
            y = y + x;              // 2
            y = y + 2;              // 3
            if (y > 4){             // 3
                y = y - 1;          // 3
            }                       // 3
            x = x + 1;              // 4
            y = y + x;              // 4
            if (y < 5){             // 5
                x = x + 1;          // 5
                if (y < 3){         // 5
                    x = x - 1;      // 5
                }                   // 5
            }                       // 5
            y = y + 2;              // 5
            System.out.print (x + "" + y + " ");
            x = x + 1;
        }
    }
}

