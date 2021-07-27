package NewbeToOracle.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {
    public ArrayList <String> abc(String... s) {
        ArrayList <String> aL = new ArrayList <>();
        for(String s1: s) {
            if(!aL.contains(s1)){
                aL.add(s1);
            }
        }
        System.out.println(aL);
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        hw.abc("privet", "ok", "poka", "privet", "kak dela?", "ok", "hello", "1", "2");
    }
}
