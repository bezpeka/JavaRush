package NewbeToOracle.Lesson25;

public class Test2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee x = new Doctor();
        Doctor y = new Doctor();
        e.sleep();
        x.sleep();
        y.sleep();
    }
}

class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }
}

class Doctor extends Employee {
    void sleep() {
        System.out.println("Doctor sleeps");
    }
}