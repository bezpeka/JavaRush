package com.HeadFirstJava.page200to299.page222;

//todo В этом задании разобраться особенно внимательно! Пока не пойму что тут происходит, дальше делать нечего!
class A { //создали класс А с единственной переменной равной 7, наследуется классом В и С
    int ivar = 7;

    void m1 () { // создали первый метод класса А, печатающий текст
        System.out.print ("A`s class m1, ");
    }

    void m2 () { // создали второй метод класса А, печатающий текст
        System.out.print ("A`s class m2, ");
    }

    void m3 () { // создали третий метод класса А, печатающий текст
        System.out.print ("A`s class m3, ");
    }
}

class B extends A { // создали класс В, унаследовали его от А
    void m1 () { // переопределили первый метод класса А, в классе В, печатающий текст
        System.out.print ("B`s class m1, ");
    }
}

class C extends B { // создали класс с, унаследовали его от В
    void m3 () { // переопределили третий метод класса А, в классе С, печатающий текст
        System.out.print ("C`s class m3, " + (ivar + 6));
    }
}

class mixed2 { // создали класс для тестирования ранее созданных классов
    public static void main (String[] args) {
        A a = new A (); // создали переменную а, типа А и присвоили ей ссылку на новый объект класса А
        B b = new B (); // создали переменную b, типа B и присвоили ей ссылку на новый объект класса B
        C c = new C (); // создали переменную c, типа C и присвоили ей ссылку на новый объект класса C
        A a2 = new C (); // создали переменную а2, типа А и присвоили ей ссылку на новый объект класса C

        b.m1 (); // вызываем у переменной b, унаследованный от класса А и переопределенный в классе B метод m1
        c.m2 (); // вызываем у переменной с, метод m2 из класса А, так как класс С наследует метод m2 у родительского класса А
        a.m3 (); // вызываем у переменной а, метод метод m3 из класса А
        System.out.println ();
        c.m1 (); // вызываем у переменной c, унаследованный от класса В метод m1, который переопределяет метод m1 класса А
        c.m2 (); // вызываем у переменной c, унаследованный из класса A метод m2
        c.m3 (); // вызываем у переменной с, переопределенный из класса A в классе С метод m3
        System.out.println ();
        a.m1 (); // вызываем у переменной а, метод m1 из класса А
        b.m2 (); // вызываем у переменной b, метод m2 из класса А, так как класс B наследует метод m1 у родительского класса А
        c.m3 (); // вызываем у переменной с, метод переопределенный метод m3 из класса С
        System.out.println ();
        a2.m1 (); // вызываем у переменной а2 которая ссылается на екземпляр класса С, метод m1 из класса В где он переопределяет метод m1 класса А
        a2.m2 (); // вызываем у переменной а2 которая ссылается на екземпляр класса С, метод m2 из класса А
        a2.m3 (); // вызываем у переменной а2 которая ссылается на екземпляр класса С, метод m3 из класса С где он переопределяет метод m3 класса А
    }
}