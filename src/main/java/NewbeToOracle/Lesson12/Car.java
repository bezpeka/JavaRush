package NewbeToOracle.Lesson12;

public class Car {
    int engine;
    int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(1, 6);
        Car c2 = new Car(2, 5);

        if(c1.engine > c2.engine){
            if(c1.doorCount > c2.doorCount){
                System.out.println("Мощность двигателя и количество деверей у первой машины больше");
            } else {
                System.out.println("Мощность двигателя у первой машины больше, а количество деверей меньше");
            }
        } else {
            System.out.println("Мощность двигателя и количество деверей у первой машины меньше");
        }
    }
}
