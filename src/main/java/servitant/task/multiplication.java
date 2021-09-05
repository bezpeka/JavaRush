package servitant.task;
/*
multiplication table
Таблица умножения
 */
public class multiplication {
    public static void main ( String[] args ) {
        int a=1;
        int b=1;
        while(a<=3){ //количество строк
            while(b<=10){ //количество столбцов
                System.out.print(a*b + " ");
                b++;
            }
            System.out.println(" ");
            a++;
            b=1;
        }
    }
}
