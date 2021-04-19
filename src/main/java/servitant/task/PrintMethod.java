package servitant.task;

public class PrintMethod{
/*
Печатаем трижды
*/

    public static void print3(String text){
        System.out.print(text + " ");
        System.out.print(text + " ");
        System.out.print(text + " ");
    }

    public static void main(String[] args){
        print3("window");
        print3("file");
    }
}
