package servitant.task.Extands;

public class Dog extends Animals { // создал класс dog, унаследованный от animals

    private String name; //Добавил классу переменную типа стринг, для хранения имени

    public void sleep () { //переопределил метод "спать" унаследованный от animals для dog
        System.out.println ("Dog is sleeping");
    }

    public Dog () { //создал конструктор по-умолчанию, так как ниже есть перегруженный конструктор
    }

    public Dog (String name) { //создал перегруженный конструктор для указания имени
    }

    public static void main (String[] args) {
        Dog A = new Dog ("Layka");
        A.sleep (); //Вызвал методы animals для ссылки А типа Dog
        A.eat ();
        System.out.println (A.getName ());
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
