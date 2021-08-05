package NewbeToOracle.Lesson24;

public class HomeWork {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Меченосец");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        Speakable p = new Penguin("говорящий пингвин");
        p.speak();
        Animal l = new Lion("Животное лев");
        System.out.println(l.name);
        l.eat();
        l.sleep();
        Mammal ml = new Lion("Млекопитающее лев");
        System.out.println(ml.name);
        ml.run();
        ml.eat();
        ml.sleep();
        ml.speak();
    }
}

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    void eat() {
    }

    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(name + " поёт");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Кто-то говорит");
    }
}

class Mechenosec extends Fish {
    public Mechenosec(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }

    void eat() {
        System.out.println("Меченосец не хищная рыба, и она ест корм");
    }
}

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Пингвины любят ест рыбу");
    }

    public void sleep() {
        System.out.println("Пингвины спят прислонившись друг к другу");
    }

    public void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    public void speak() {
        System.out.println("Пингвин не умеет петь как соловей");
    }
}

class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Лев, как любой хищник любит мясо");
    }

    public void sleep() {
        System.out.println("Большую часть дня, лев спит");
    }

    public void run() {
        System.out.println("Лев, это не самая быстрая кошка");
    }
}