package NewbeToOracle.Lesson31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    public static void main(String[] args) {
        int a = abc();
        System.out.println(a);
    }

    static int abc() {
        try {
            FileInputStream fis = new FileInputStream("file_not_found.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            System.out.println("Finally block is worked");
        }
        System.out.println("Program is worked");
        return 18;
    }
}
