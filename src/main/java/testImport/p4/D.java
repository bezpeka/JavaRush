package testImport.p4;

import testImport.p1.A;
import testImport.p1.p2.B;
import testImport.p1.p2.p3.C;
import testImport.p4.p5.E;

public class D {
    public void showinfo(){
        System.out.println("object D is created");
    }
    public static void main(String[] args) {
        A a = new A();
        a.showinfo();
        B b = new B();
        b.showinfo();
        C c = new C();
        c.showinfo();
        D d = new D();
        d.showinfo();
        E e = new E();
        e.showinfo();
        System.out.println(testImport.p1.p2.B.x + testImport.p1.p2.B.y);
    }
}