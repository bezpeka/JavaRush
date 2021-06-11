package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <String> list = new ArrayList <>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for(String element: list) {
            System.out.println(element);
        }
    }

    public static ArrayList <String> fix(ArrayList <String> list) {
        //напишите тут ваш код

        //Delete word contain "р"
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).indexOf("р") >= 0 && list.get(i).indexOf("л") == -1)
                list.remove(i);
        }
        //Duplicate word with "л"
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).indexOf("л") >= 0 && list.get(i).indexOf("р") == -1)
                list.add(list.get(i));
        }
        return list;
    }
}