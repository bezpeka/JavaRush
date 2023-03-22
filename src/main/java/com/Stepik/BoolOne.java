package com.Stepik;

public class BoolOne {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return true; // your code should be here
    }

    public static void main(String[] args) {
        final int N = 16;
        boolean[][] variants = new boolean[][]{
                {false, false, false, false},
                {false, false, false, true},
                {false, false, true, false},
                {false, false, true, true},
                {false, true, false, false},
                {false, true, false, true},
                {false, true, true, false},
                {false, true, true, true},
                {true, false, false, false},
                {true, false, false, true},
                {true, false, true, false},
                {true, false, true, true},
                {true, true, false, false},
                {true, true, false, true},
                {true, true, true, false},
                {true, true, true, true}
        };
        boolean[] answers = {
                false,
                false,
                false,
                true,
                false,
                true,
                true,
                false,
                false,
                true,
                true,
                false,
                true,
                false,
                false,
                false
        };

        for (int i = 0; i < N; i++) {
            boolean[] v = variants[i];
            boolean result = booleanExpression(v[0], v[1], v[2], v[3]);
            System.out.printf("test #%d: %s\n", i + 1, result == answers[i] ? "OK" : "FAIL");
        }
    }
}
