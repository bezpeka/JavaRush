package NewbeToOracle.Lesson22.HomeWork;

public class Animal {
    public Animal() {
        System.out.println("I am an Animal");
    }

    int eyes = 2;

    public void eat() {
        System.out.println("The Animal is eating");
    }

    public void drink() {
        System.out.println("The Animal is drinking");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("I am a pet");
    }

    String name;
    int tail = 1;
    int pow = 4;

    public void run() {
        System.out.println("Pet is running");
    }

    public void jump() {
        System.out.println("Pet is jumping");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am a dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I am a cat and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat " + name + " is sleeping");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog("Tuzik");
        Cat c = new Cat("Murzik");
        System.out.println("У нашей собаки " + d.pow + " лапы");
        c.sleep();
    }
}