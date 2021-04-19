package servitant.task;
/* Это задача 2-й уровень, 10 лекция JR
Как я понимаю, в зависимости от того,
в какой последовательности мы передаем параметры создаваемого пользователя,
выбирается соответствующий метод, с нужной последовательностью данных,
по их типам, стринг, шорт, инт
 */
public class User{

    String name;
    short age;
    int height;

    public User(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(String name, int height, short age){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User(short age, int height, String name){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, String name, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, String name, short age){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(int height, short age, String name){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args){

        User user1 = new User("Andrew", ( short ) 18, 182);
        User user2 = new User("Andrew", 182, ( short ) 18);
        User user3 = new User(( short ) 18, "Andrew", 182);
        User user4 = new User(( short ) 18, 182, "Andrew");
        User user5 = new User(182, "Andrew", ( short ) 18);
        User user6 = new User(182, ( short ) 18, "Andrew");

        System.out.println(user1.name + " " + user1.age + " " + user1.height);
        System.out.println(user2.name + " " + user2.age + " " + user2.height);
        System.out.println(user3.name + " " + user3.age + " " + user3.height);
        System.out.println(user4.name + " " + user4.age + " " + user4.height);
        System.out.println(user5.name + " " + user5.age + " " + user5.height);
        System.out.println(user6.name + " " + user6.age + " " + user6.height);
    }
}