package com.HeadFirstJava.page100to199.page191;

import java.util.ArrayList;

public class ArrayListMagnet {

    public static void main (String[] args) {
        ArrayList < String > a = new ArrayList < String > (); //создаётся только для объектов String
        a.add (0, "ноль");  //помещаем в ArrayList слова один, два, три под разными индексами
        a.add (1, "один");  //помещаем в ArrayList слова один, два, три под разными индексами
        a.add (2, "два");   //помещаем в ArrayList слова один, два, три под разными индексами
        a.add (3, "три");   //помещаем в ArrayList слова один, два, три под разными индексами
        printAl (a); //вызов метода
        if (a.contains ("три")){ //Если a содержит элемент "три", добавляем элемент "четыре"
            a.add ("четыре");
        }
        a.remove (2); //Удаляем индекс ArrayList-а номер 2, у которого элемент "два"
        printAl (a); //вызов метода
        if (a.indexOf ("четыре") != 4){ /*Тут вопрос, как я понял тут условие, что если индекс ArrayList-а под номером четыре
            не равен индексу 4, то добавить елемент 4.2. И он добавляет, так какой же всё же индекс у 4*/
            a.add (4, "4.2");
        }
        printAl (a); //вызов метода
        if (a.contains ("два")){ //Это условие не срабатывает
            a.add ("2.2");
        }
        printAl (a); //вызов метода
    }

    public static void printAl (ArrayList < String > al) {
        /*Метод приниимает любой объект типа ArrayList<String>
        и помещает его в свою внутреннюю переменную al.
        При вызове этого метода в мейне - вы передаете туда как-раз объект этого же типа
        (который вы предварительно сохранили в переменную а этого же типа).

        Если бы вы в мейне понасоздавали еще несколько других объектов такого типа и передавали бы
        их в метод printAl() - этот метод бы прекрасно бы работал с любым таким объектом
        (а именно, перебирал бы все элементы такого списка и выводил бы их на экран с пробелом после каждого элемента,
        после чего вывел бы пустую строку)*/
        for (String element : al){ //для каждого элемента в массиве al: присвоить элемент переменной element
            // и запустить тело цикла
            System.out.print (element + " ");
        }
        System.out.println ();
    }
}
