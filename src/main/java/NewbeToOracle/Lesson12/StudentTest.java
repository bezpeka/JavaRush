package NewbeToOracle.Lesson12;

import NewbeToOracle.Lesson11.Student;

public class StudentTest {
    public static void comparison(Student s1, Student s2) {
        if(s1 == s2){
            System.out.println("Студенты равны");
        } else System.out.println("Студенты не равны");
    }

    public static void compareNested(Student s1, Student s2) {
        if(s1.name.equals(s2.name)) System.out.println("Имена студентов одинаковые");
        else System.out.println("Имена студентов разные");
        if(s1.course == s2.course) System.out.println("Курсы у студентов одинаковые");
        else System.out.println("Курсы у студентов разные");
        if(s1.grade == s2.grade) System.out.println("Средняя оценка у студентов одинаковая");
        else System.out.println("Средняя оценка у студентов разная");
    }

    public static void compareNested1(Student s1, Student s2) {
        if(s1.name.equals(s2.name)){
            System.out.println("Имена студентов одинаковые");
        } else {
            System.out.println("Имена студентов разные");
        }
        if(s1.course == s2.course){
            System.out.println("Курсы у студентов одинаковые");
        } else {
            System.out.println("Курсы у студентов разные");
        }
        if(s1.grade == s2.grade){
            System.out.println("Средняя оценка у студентов одинаковая");
        } else {
            System.out.println("Средняя оценка у студентов разная");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Ivan", 3, 9.5);
        Student st3 = new Student("Petr", 1, 5.3);
        comparison(st1, st2);
        compareNested(st1, st3);
    }
}

