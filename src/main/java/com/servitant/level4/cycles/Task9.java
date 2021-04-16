package com.servitant.level4.cycles;
/*
Рисуем линии

package com.javarush.task.task04.task0438;

Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок
(символ из горизонтальной строки не учитывается).
 */

public class Task9 {
    public static void main (String[] args) {
        for (int a = 1; a <= 10; a++){
            System.out.print (8);
        }
        System.out.println ();
        for (int b = 1; b <= 10; b++){
            System.out.println (8);
        }
    }
}
