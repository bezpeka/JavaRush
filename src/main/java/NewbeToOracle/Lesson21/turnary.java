package NewbeToOracle.Lesson21;

public class turnary {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a < 4 ? 7 : "А не меньше 4-х");
        int b = (a < 4) ? 7 : 10;
        System.out.println(b);
        String sb = (a < 4) ? "7" : "А не меньше 4-х";
        System.out.println(sb);

        Test test = new Test(); //Вызвали коструктор
        test.Test(); //Вызвали метод
    }
}

class Test { //Метод от конструктора отличается только наличием возвращаемого значения и может иметь такое же имя
    Test() { //Это конструктор
        System.out.println("Конструктор создал новый объект класса Test");
    }

    void Test() { //Это метод
        System.out.println("Вызван метод класса Test");
    }

    //    int Test = 5; //Мы можем создать переменную типа инт с именем Test
    Test Test; //И даже переменную типа Test с именем Test, но так делать ну нужно
}

class NestedTest {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(a > 2 ? a < 5 ? 3 : 6 : 9);
    }
}

class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car1;
        car1 = null;
        Car car4 = car1;
        car3 = null;
        car2 = null;
        car2 = new Car();
        System.gc();
    }
}

class Employee {
    Employee manager = new Employee();
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e = null;
        e = new Employee();
        e = null;
    }
}