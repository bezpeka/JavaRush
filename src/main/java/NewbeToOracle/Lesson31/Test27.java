package NewbeToOracle.Lesson31;

public class Test27 {
}

class AA {
    int a = 3;

    int returnAA() {
        System.out.println("Class AA " + a);
        return a;
    }
}

class BB extends AA {
    int a = 5;

    public int returnAA() {
        System.out.println("Class BB " + a);
        return a;
    }

    public static void main(String[] args) {
        AA test1 = new BB();
        System.out.println(test1.a + " " + test1.returnAA());
        BB test2 = ( BB ) test1;
        System.out.println(test2.a + " " + test2.returnAA());
    }
}
