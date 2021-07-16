package NewbeToOracle.Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a) {
        return a * 2;
    }

    public double zp3() {
        salary = salary * 3;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        System.out.println(emp1.uvelichitel(emp1.salary));
        System.out.println(emp1.salary);
        emp1.zp3();
        System.out.println(emp1.salary);
    }
}