package NewbeToOracle.Lesson12;

import NewbeToOracle.Lesson11.Student;

public class StudentTest {
    public static void comparison(Student s1, Student s2) {
        if(s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade){
            System.out.println("Студенты одинаковые");
        } else System.out.println("Студенты не одинаковые");
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
            System.out.println("Имена у студентов одинаковые");
        } else {
            System.out.println("Имена у студентов разные");
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

    public static void compareNested2(Student s1, Student s2) {
        if(s1.name.equals(s2.name)){
            if(s1.course == s2.course){
                if(s1.grade == s2.grade){
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки разные");
                }
            } else {
                System.out.println("Имена одинаковые, но курсы  и оценки у студентов разные");
            }
        } else {
            System.out.println("Имена студентов, курсы и оценки разные");
        }
    }



    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Ivan", 3, 9.5);
        Student st3 = new Student("Petr", 3, 5.3);
        Student st4 = new Student("Petr", 2, 5.3);
        comparison(st1, st3);
        compareNested2(st3, st4);
    }
}

