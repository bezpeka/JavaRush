package NewbeToOracle.Lesson31;

public class Test19 {
}

class Employee15 {
    String name = "Ivan";
    int id = 5;

    void printInfo() { //если метод сделать статическим - Compile time error
        System.out.println("Imya studenta: " + name + " id: " + id);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee15 emp = new Employee15();
        emp.printInfo();
    }
}
