package com.servitant.level4.cycles;

/*
Треугольник из восьмерок
package com.javarush.task.task04.task0437;

Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
 */
public class Task8 {
    public static void main (String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = i - 1; j >= 0; j--){
                System.out.print ("8");
            }
            System.out.println ();
        }
    }
}
