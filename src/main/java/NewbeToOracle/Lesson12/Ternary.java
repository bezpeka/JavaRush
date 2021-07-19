package NewbeToOracle.Lesson12;

/*
(boolean expression) ? (if true) : (if false)
В скобках пишем проверяемое условие, проверяем его. Условие верно или ложно, ставим знак вопроса?
далее, если условие верно, выполнить то что в скобках (if true)
Ставим двоеточие, которое говорит - иначе
Если условие ложь, то выполнить этот операнд (if false)
 */
public class Ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b; // (boolean expression) ? (if true) : (if false)
        int mathMax = Math.max(a, b); //нахождение максимума с помощью функции
        System.out.println(max);
        System.out.println(mathMax);
    }
}
