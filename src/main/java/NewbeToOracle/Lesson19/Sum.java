package NewbeToOracle.Lesson19;

public class Sum {
    static void summa(String s, double... a) { //varargs в листе параметров может быть только один и он должен стоят на последнем месте
        double summa = 0;
        for(int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.print(s);
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa("Сумма введенных чисел равна ", 6, 8, 15, 14, 87, -95);
        summa("Так же можно ввести данные в виде массива и получить тот же результат ", new double[]{6, 8, 15, 14, 87, -95});
    }
}
