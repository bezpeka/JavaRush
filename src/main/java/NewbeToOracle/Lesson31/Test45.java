package NewbeToOracle.Lesson31;

public class Test45 {
    static String s = "";

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e1) {
            try {
                try {
                    throw new Exception();
                } catch (Exception e2) {
                    s += "1";
                }
                throw new Exception();
            } catch (Exception e3) {
                s += "2";
            } finally {
                s += "3";
            }
        } finally {
            s += "4";
        }
        System.out.println(s);
    }
}
