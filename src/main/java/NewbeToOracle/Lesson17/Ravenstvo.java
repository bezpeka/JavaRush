package NewbeToOracle.Lesson17;

public class Ravenstvo {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if(sb1.length() == sb2.length()){
            for(int i = 0; i < sb1.length(); i++) {
                if(sb1.charAt(i) != sb2.charAt(i)){
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

class RavenstvoTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        StringBuilder sb3 = new StringBuilder("Hello");
        boolean a = Ravenstvo.ravenstvo(sb1, sb3);
        System.out.println(a);
        System.out.println(Ravenstvo.ravenstvo(sb1, sb3));
        System.out.println(Ravenstvo.ravenstvo(new StringBuilder(""), new StringBuilder("")));
        System.out.println(Ravenstvo.ravenstvo(new StringBuilder(), new StringBuilder()));
    }
}

