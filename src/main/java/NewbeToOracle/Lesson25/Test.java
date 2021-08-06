package NewbeToOracle.Lesson25;

public class Test {
    public static void main(String[] args) {
        int i = 10;
        long l = 10;
        //i = i * l; //так делать нельзя, потому что результат умножения на лонг, не помещается в инт
        i *= l;//это то же самое что и i = i * l, но так не выбрасывает эксепшин
        l = i * l; // так делать можно без приведения типов
        l *= i; //это то же самое что и l = i * l
        i = ( int ) (i * l); //можно привести к инту все выражение
        i = i * ( int ) l; //можно привести к инту переменную лонг
        System.out.println("i = " + i);
        System.out.println("l = " + l);
    }
}
