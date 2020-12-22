import java.util.Scanner;

/* Тут мы импортируем класс Scanner, содержащийся в пакете утилит java.util,
		который предоставляет нам несколько полезных функций,
		для обработки ввода с клавиатуры. */
public
class HiLo {
    /*Создали открытый Класс (шаблон) HiLo (слово public), сообственно вся наша программа
     * - это шаблон для игры.
     * Единожды его создав - сможем использовать повторно.
     */
    public static
    void main ( String[] args ) {
        // Внутри класса HiLo находится метод main, он будет запускаться при выполнении класса
        Scanner scan = new Scanner ( System.in );
        // Эта строка импортирует класс Scanner и все его функции из основного пакета утилит Java.
        String playAgain;
        playAgain = "";

        /*String это класс, содержащий функции со строками текста, переменную назвали playAgain
         * В кавычках ничего нет, это значит, наша переменная пока без текста.
         */
        do {
            int theNumber = ( int ) (Math.random () * 200 - 100);
			/* С помощью встроенного класса Math генерируем случайное число
					- Для этого создаем переменную int (целое число) с именем theNumber
					- Число будет генерироваться в диапазоне от 1 до 100
					- Для этого нужна встроенная функция Math.random()
					Эта функция генерирует числа в диапазоне от 0,0 до 0,99999
					Поэтому результат мы умножим на 100, получая диапазон от 0,0 до 99,9999
					Добавив к нему 1, у нас будет нужный диапазон от 1,0 до 100,9999
					- Так как мы сделали приведение типа int, мы получим не десятичную дробь, а целое число
					В результате дробная часть после запятой отбрасывается и остается значение 1 - 100
			 */
            int numberOfTries = 0;
            //Счетчик попыток
            int AllTries = 10;
            //Тут мі задаем количество попыток
            //System.out.println(theNumber);
            //Теперь мы можем вывести на экран сгенерированное значение
            int guess = 0;
            // Добавили переменную, для хранения ответов пользователя
            System.out.println ( "Угадайте случайное число в диапазоне от -100 до 100, за 10 попыток" );
            while (guess != theNumber && AllTries > 0) {
                /*тело цикла должно находится в своих фигурных скобках, как и тело метода main
                 * Цикл будет повторятся, пока значение переменной guess не будет равно theNumber
                 */
                guess = scan.nextInt ();
                numberOfTries = numberOfTries + 1;
                AllTries = AllTries - 1;
                if ( guess < theNumber )
                    System.out.println ( "Ваш ответ " + guess + " меньше загаданного числа. И это Ваша " + numberOfTries + " попытка. Осталось " + AllTries + " попыток" );
                else if ( guess > theNumber )
                    System.out.println ( "Ваш ответ " + guess + " больше загаданного числа. И это Ваша " + numberOfTries + " попытка. Осталось " + AllTries + " попыток" );
                else
                    System.out.println ( "Поздравляем, Вы угадали, число " + guess + " c " + numberOfTries + " попытки. Вы выиграли!" );
            }
            System.out.println ( "Вы хотите сыграть еще раз (y/n)?" );
            playAgain = scan.next ();
        } while (playAgain.equalsIgnoreCase ( "y" ));
        System.out.println ( "Спасибо за игру! До свидания." );
        scan.close ();
    }

}
