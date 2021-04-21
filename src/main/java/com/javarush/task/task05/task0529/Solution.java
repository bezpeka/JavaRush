package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка

Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка,
например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
*/

public class Solution {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
        int sum = 0;                                //создаем переменную для вывода резудьтата
        while (true) {
            String word = buffer.readLine ();       //считываем введенные даные
            if (word.equals ("сумма")){             //сравниваем с заданым значением
                System.out.println (sum);           //если совпало, печатаем результат и выходим из программы
                break;
            }
            else {                                  //иначе, если не совпало
                int num = Integer.parseInt (word);  //парсим из считанного значеия число
                sum += num;                         //добавляем считанное значение к результату
            }
        }
    }
}