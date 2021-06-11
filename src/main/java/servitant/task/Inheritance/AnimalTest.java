package servitant.task.Inheritance;

public class AnimalTest {
    static Dog sharik = new Dog();
    static Cat murka = new Cat();
    static Animal Noname = new Animal();

    public static void main(String[] args) {
        sharik.runs();
        murka.sleep();
        Noname.eat();
        sharik.swims();
        murka.swims();
    }
}
