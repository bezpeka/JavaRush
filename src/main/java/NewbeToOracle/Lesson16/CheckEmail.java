package NewbeToOracle.Lesson16;

public class CheckEmail {
    public static void email(String email) {
        int a; //позиция символа @
        int b; //позиция символа .
        int c = 0; //позиция символа ;
        while (c < email.length() - 1) {
            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1);
            System.out.println(email.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; you@mail.ru; we@gmail.com;");
    }
}
