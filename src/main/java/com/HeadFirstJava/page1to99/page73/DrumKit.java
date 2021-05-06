package com.HeadFirstJava.page1to99.page73;

public class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat () {
        System.out.println ("динь динь ди-динь");
    }

    void playSnare () {
        System.out.println ("бах бах ба-бах");
    }
}

class DrumKitTestDrive {
    public static void main (String[] args) {
        DrumKit d = new DrumKit ();
        if (d.snare == true){
            d.playSnare ();
        }
        d.playTopHat ();
        d.snare = false;

    }
}
