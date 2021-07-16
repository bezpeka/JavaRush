package NewbeToOracle.Lesson11;

public class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static int changeDoor(int door, int plus) {
        return door + plus;
    }
    public static void changeDoor(Car c, int doorCount){
        c.doorCount = doorCount;
    }

    public static void changeColor(Car c1, Car c2) {
        Car c3 = new Car("white", "4", 4);
        Car c4 = new Car("orange", "4", 4);
        c3.color = c1.color;
        c4.color = c2.color;
        c1.color = c4.color;
        c2.color = c3.color;
    }
    static void changeColor2(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("red", "2", 3);
        Car c2 = new Car("blue", "3", 5);
        changeColor2(c1, c2);
        System.out.println("Color c1 was red, and now is " + c1.color);
        System.out.println("Color c2 was blue, and now is " + c2.color);
        c1.doorCount = changeDoor(c1.doorCount, 3);
        c2.doorCount = changeDoor(c2.doorCount, 9);
        System.out.println(c1.doorCount);
        System.out.println(c2.doorCount);
        ct.changeDoor(c1, 3);
        ct.changeDoor(c2, 4);
        System.out.println(c1.doorCount);
        System.out.println(c2.doorCount);
    }
}

