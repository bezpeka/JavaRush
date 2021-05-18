package com.HeadFirstJava.page200to299.page224;

public class Rowboat extends Boat { //создали первый класс наследник
    public void rowTheBoat () { // дали наследнику его метод
        System.out.print ("Давай Наташа!");
    }
}

class Boat { // создали родительский класс, у которого есть два наследника
    private int lenght;

    public void setLenght (int len) { // сеттер родительского класса
        lenght = len;
    }

    public int getLenght () { // геттер родительского класса
        return lenght;
    }

    public void move () { //метод родитеьского класса
        System.out.print ("Дрейф ");
    }
}

class TestBoats { // создали тестовый класс
    public static void main (String[] args) {
        Boat b1 = new Boat ();
        //создали переменную b1 типа родительского класса Boat и привязали ее к новому объекту типа Boat
        Sailboat b2 = new Sailboat ();
        //создали переменную b2 типа унаследованного класса Sailboat и привязали ее к новому объекту типа Sailboat
        Rowboat b3 = new Rowboat ();
        //создали переменную b3 типа унаследованного класса Rowboat и привязали ее к новому объекту типа Rowboat
        b2.setLenght (32);
        //вызываем сеттер класса родителя из переменной наследника b2 и устанавливаем для неё значение length = 32
        System.out.println (b2.getLenght ());
        //проверяем значеие переменной для объекта Sailboat на который ссылется переменная b2 (b1 = 0 и b3 = 0)
        b1.move ();
        //вызываем метод класса родителя из переменной b1
        b3.move ();
        //вызываем унаследованный метод класса родителя из переменной b3
        b2.move ();
        //вызываем переопределенный в наследнике метод родительского класса из переменной b2
        b3.rowTheBoat ();
    }
}

class Sailboat extends Boat { // создали второй класс наследник
    public void move () { // переопределили унаследованнй метод родительского класса
        System.out.print ("Поднять паруса!");
    }
}
