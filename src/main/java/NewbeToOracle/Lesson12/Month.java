package NewbeToOracle.Lesson12;

public class Month {
    int monthNumber;

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public static void dayOfMonth(int n) { //Если сделать метод статичным, можно его использовать не создавая экземпляр класса
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце 31 день");
                break;
            case 2:
                System.out.println("В месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце 30 дней");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
    }

    public static void main(String[] args) {
        //Month m = new Month(1); //Создаем экземпляр класса, если метод не статичный
        //m.dayOfMonth(1); //Вводим номер месяца и на экран выводится количество его дней
        dayOfMonth(2); //Обращаемся к методу, без экземпляра класса
    }
}
