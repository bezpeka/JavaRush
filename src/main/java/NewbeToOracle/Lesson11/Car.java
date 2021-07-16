package NewbeToOracle.Lesson11;

public class Car {
    String color;
    String engine;
    int door;

    public Car(String color, String engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }
}

class CarTest {
    public static int changedoor(int door, int plus) {
        return door + plus;
    }

    public static void changecolor(Car c1, Car c2) {
        Car c3 = new Car("white", "4", 4);
        Car c4 = new Car("orange", "4", 4);
        c3.color = c1.color;
        c4.color = c2.color;
        c1.color = c4.color;
        c2.color = c3.color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("red", "2", 3);
        Car c2 = new Car("blue", "3", 5);
        changecolor(c1, c2);
        System.out.println("Color c1 was red, and now is " + c1.color);
        System.out.println("Color c2 was blue, and now is " + c2.color);
        c1.door = changedoor(c1.door, 3);
        c2.door = changedoor(c2.door, 9);
        System.out.println(c1.door);
        System.out.println(c2.door);
    }
}

