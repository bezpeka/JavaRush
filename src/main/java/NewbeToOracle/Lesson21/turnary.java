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
}