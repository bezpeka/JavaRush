package servitant.task.Inheritance;

public class Dog extends Animal implements run{
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
    public void runs(){
        System.out.println("Dog is running");
    }

    @Override
    public void swims() {
        System.out.println("Dog is swimming very good");
    }
}
