package NewbeToOracle.Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HomeWork {
    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    static class TestEmployee {
        void printEmployee(Employee e) {
            System.out.println("Имя работника: " + e.name + " , департамент: " + e.department + ", зарплата:" + e.salary + ".");
        }

        void filtrRabotnikov(ArrayList <Employee> l, Predicate <Employee> p) { //про Predicate нужно почитать подробнее, нихуя не понял
            for(Employee e: l) {
                if(p.test(e)){
                    printEmployee(e);
                }
            }
        }

        public static void main(String[] args) {
            ArrayList <Employee> list = new ArrayList <>();
            Employee e1 = new Employee("Ivan", "IT", 150);
            Employee e2 = new Employee("Nikolay", "Sales", 200);
            Employee e3 = new Employee("Elena", "HR", 250);
            Employee e4 = new Employee("Petr", "IT", 300);
            Employee e5 = new Employee("Maria", "IT", 350);
            Employee e6 = new Employee("Aleksandr", "HR", 400);
            Employee e7 = new Employee("Ekaterina", "Sales", 450);
            list.add(e1);
            list.add(e2);
            list.add(e3);
            list.add(e4);
            list.add(e5);
            list.add(e6);
            list.add(e7);

            TestEmployee t = new TestEmployee();
            t.filtrRabotnikov(list, x -> x.department.equals("IT")&& x.salary > 200);
            System.out.println("--------------------------------------------------");
            t.filtrRabotnikov(list, x -> x.name.startsWith("E") && x.salary !=450);
            System.out.println("--------------------------------------------------");
            t.filtrRabotnikov(list, x -> x.name.equals(x.department));
        }
    }
}
