package NewbeToOracle.Lesson20;
/*
Если не задать нулевой элемент, то словим ексепшн IndexOutOfBoundsException
даже если указать емкость ArrayList в параметрах.
 */

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList <>();
        students.add(0, "Pidarov"); //Обязательно начинать с нулевого элемента
        students.add(1, "Ivanov");
        students.add(2, "Petrov");
        students.add(3, "Sidorov");
        students.remove(2);
        for(String s: students) {
            System.out.print(s + " ");
        }
    }
}
