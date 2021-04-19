package servitant.task;

public class brainstorm{
    public static void main(String[] args){
        //создаем переменные
        int a = 2;
        int b = 5;
        int c = 8;
        //вызываем наш метод сложения
        int result = varplus(a, b, c);
        System.out.println(result);
    }

    //создаем функцию (метод) сложения переменных
    public static int varplus(int var1, int var2, int var3){
        int res = var1 + var2 + var3;
        return res;
    }

}
