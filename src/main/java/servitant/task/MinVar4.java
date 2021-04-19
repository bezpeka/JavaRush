package servitant.task;

public class MinVar4{
    /*
Минимум четырех чисел (2-й уровень, 8 лекция)
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка: Нужно написать тело двух существующих функций min.

*/
    public static int min(int a, int b, int c, int d){
        //напишите тут ваш код
        int result = 0;
        int abres = min(a, b);
        if (abres <= c && abres <= d)
            result = abres;
        else if (c <= abres && c <= d)
            result = c;
        else
            result = d;
        return result;
    }

    public static int min(int a, int b){
        //напишите тут ваш код
        int abres = b;
        if (a < b)
            abres = a;
        else
            abres = b;
        return abres;
    }

    public static void main(String[] args) throws Exception{
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
