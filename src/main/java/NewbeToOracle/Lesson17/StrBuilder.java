package NewbeToOracle.Lesson17;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello World");
        sb1.delete(4, 11);
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = sb2.append("45");
        sb3 = sb3.append("6").append("7").append("89");
        StringBuilder sb4 = sb3.append(sb3.append(sb3.append(0)));
        System.out.println(sb2);
        System.out.println(sb3);
//        System.out.println(sb4);
    }
}
