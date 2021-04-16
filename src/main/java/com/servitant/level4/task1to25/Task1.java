package com.servitant.level4.task1to25;

/*
Тут у нас задачи н видимость переменных.
Подумайте, что делает программа.
Исправь ошибку в программе чтобы переменная age объекта person изменила свое значение.

Подсказка:
тщательно просмотрите метод adjustAge

Исходный вариант:
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            age = age + 20;
            System.out.println("Age in adjustAge() is: " + age);
        }
    }
 */
public class Task1 {
    public static void main (String[] args) {
        Person person = new Person ();
        System.out.println ("Age is: " + person.age);
        person.adjustAge (person.age);
        System.out.println ("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;
/*
1. Создан класс Person, в классе объявили переменную age и назначили ей число 20.
*/

        public void adjustAge (int age) {
            this.age = age + 20;
            System.out.println ("Age in adjustAge() is: " + age);
/*
 2. В методе adjustAge аргументом является переменная age.
 Запрашиваемая строка вывода консоли на экран System.out.println
 в данном методе вызывает переменную age.

 3. Если оставить как было изначально в коде задачи, то к значению  20
 приплюсуется значение 20 и будет 40. Если же мы перед переменной age
 метода adjustAge добавим ключевое слово this, то программа будет запрашивать
 именно эту, конкретную переменную age класса Person

 4. И уже измененное значение поля  объекта person (person.age)
 с логикой прописанной в  методе adjustAge выводится на экран,  то есть число 40
*/
        }
    }
}

