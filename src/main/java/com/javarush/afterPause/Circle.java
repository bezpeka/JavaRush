package com.javarush.afterPause;
/*Використовуючи два вкладені цикли, ми проходимо по кожній точці на площині
з координатами x та y, і визначаємо, чи вона знаходиться в межах круга.
Якщо так, то виводимо символ "#", якщо ні - то ".".
Результат виконання цього коду буде круг з радіусом 10 символів, виведений в консоль.*/
public class Circle {

    public static void main(String[] args) {
        int radius = 10; // радіус круга
        int diameter = 2 * radius; // діаметр круга
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("# "); // виводимо символ # для точок в межах круга
                } else {
                    System.out.print(". "); // виводимо символ . для точок за межами круга
                }
            }
            System.out.println(); // перехід на новий рядок
        }
    }
}


