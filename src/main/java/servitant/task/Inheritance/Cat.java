package servitant.task.Inheritance;

public class Cat extends Animal implements run{
    @Override
    void sleep() {
        System.out.println("Cat is sleeping");
    }
    public void runs(){
        System.out.println("Cat is running");
    }
}
