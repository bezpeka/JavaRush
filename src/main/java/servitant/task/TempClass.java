package servitant.task;

public class TempClass {
    public int x = 10;
    public int y = 20;

    public static void main(String[] args) {
        TempClass t = new TempClass();
        TempClass w = new TempClass();
        t.x = t.x * t.y/2;
        w.x = w.x * w.y*2;
        System.out.println(t.x);
        System.out.println(w.x);
    }
}
