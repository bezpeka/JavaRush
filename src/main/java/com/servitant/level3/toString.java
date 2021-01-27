package com.servitant.level3;
/*3-й уровень 3-я лекция
Три приведённых примера эквивалентны.
Все  объекты в Java могут быть преобразованы в строку.
Все классы в Java унаследованы от класса Object,
а он имеет метод toString(), который вызывается,
когда объект нужно преобразовать к строке.

Стандартный метод toString() класса Object возвращает строку,
состоящую из имени класса и адреса объекта в памяти (в шестнадцатеричном виде)

Поэтому консоль выводит что-то типа этого
Cat is com.servitant.level3.toString$Cat@1b6d3586
 */
public class toString{
    public static void main(String[] args){
        Cat cat = new Cat();
        System.out.println("Cat is " + cat);
    }

//    public static void main(String[] args){
//        Cat cat = new Cat();
//        System.out.println("Cat is " + cat.toString());
//    }
//
//    public static void main(String[] args){
//        Cat cat = new Cat();
//        String catText = cat.toString();
//        System.out.println("Cat is " + catText);
//    }

    public static class Cat{

    }
}
