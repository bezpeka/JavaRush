package com.HeadFirstJava.page100to199.page118;

public class Clock {
    String time;

    void setTime (String t) {
        time = t;
    }

    String getTime () { //Тут не хватало String,
        return time; // геттер в своем объявлении должен содержать тип возвращаемого значения
    }
}

class ClockTestDrive {
    public static void main (String[] args) {
        Clock c = new Clock ();
        c.setTime ("1245");
        String tod = c.getTime ();
        System.out.println ("время: " + tod);
    }
}
