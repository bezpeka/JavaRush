package NewbeToOracle.Lesson25;

public class HomeWork {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Mech");
        Animal a2 = new Penguin("Peng");
        Animal a3 = new Lion("Leva");
        Fish f1 = new Mechenosec("Mech1");
        Bird b1 = new Penguin("Peng1");
        Mammal ml = new Lion("Leva2");
        Mechenosec mech1 = new Mechenosec("Mech2");
        Penguin p1 = new Penguin("Peng2");
        Lion l1 = new Lion("Leva2");
        Speakable s1 = new Penguin("Peng3");
        Speakable s2 = new Lion("Leva3");
        Animal[] array1 = {a1, a2, a3, f1, b1, ml, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, ml, p1, l1};
        for(Animal a: array1) {
            if(a instanceof Mechenosec){
                Mechenosec m = ( Mechenosec ) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if(a instanceof Penguin){
                Penguin p = ( Penguin ) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if(a instanceof Lion){
                Lion l = ( Lion ) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("--------------------------------------");
        }
        for(Speakable s: array2) {
            if(s instanceof Penguin){
                Penguin p = ( Penguin ) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if(s instanceof Lion){
                Lion l = ( Lion ) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("--------------------------------------");
        }
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