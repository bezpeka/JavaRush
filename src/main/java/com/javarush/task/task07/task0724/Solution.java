package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human grandfather1 = new Human("Дедушка мамы", true, 70);
        Human grandfather2 = new Human("Дедушка папы", true, 80);
        Human grandmother1 = new Human("Бабушка мамы", false, 60);
        Human grandmother2 = new Human("Бабушка папы", false, 50);

        Human mother = new Human("Мама", false, 20, grandfather1, grandmother1);
        Human father = new Human("Папа", true, 30, grandfather2, grandmother2);

        Human child1 = new Human("Младшая дочь", false, 2, mother, father);
        Human child2 = new Human("Сын", true, 3, mother, father);
        Human child3 = new Human("Старшая дочь", false, 4, mother, father);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human { // создали класс с нужными полями
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name; // создали конструктор для класса с отсутствующими полями отец и мать
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name; // создали конструктор для класса с полями отец и мать
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() { // переопределили метод класса toString класса object для получения нужного результата при выводе
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if(this.father != null)
                text += ", мать: " + this.father.name;
            if(this.mother != null)
                text += ", отец: " + this.mother.name;
            return text;
        }
    }
}






















