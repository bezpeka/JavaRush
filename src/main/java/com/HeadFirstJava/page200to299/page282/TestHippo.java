package com.HeadFirstJava.page200to299.page282;

public class TestHippo {
    public static void main (String[] args) {
        System.out.println ("Starting Test...");
        Hippo h = new Hippo ();
    }
}
/*
При создании объекта, h конструктор Hippo() помещается во фрейм на вершине стека
Далее Hippo() вызывает конструктор родительского класса Animal() и помещает его на вершину стека
Следующим вызывается конструктор родителя Object()
Завершают свою работу и удаляются из фрейма конструкторы в такой последовательности Object() - Animal() - Hippo()
Что мы и видим в терминале, при запуске теста.
*/
