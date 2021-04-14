package com.servitant.level4;

/*
Допишите код метода setName, чтобы с его помощью установить значение
private String fullName равное значению локальной переменной String fullName.
 */
public class Task6Cat {
    private String fullName;

    public void setName (String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
        //напишите тут ваш код
    }

    /*
    Если ты в методе main создашь объект класса Cat,
    то у этого объекта будет своя личная переменная String fullName,
    принадлежащая только ему (По умолчанию она равна null),
    и его личный метод setName. Что бы ее задать или проинициализировать,
    ты можешь вызвать метод setName c какими-то двумя параметрами.
    Ну то есть (String firstName, String lastName).
    Дальше метод работает так: слово this.fullname - вот конкретно ЭТО fullName,
    конкретно твого созданного объекта равно fullName,
    которое получилось слиянием двух строк на 11 строке кода.
     */
    public static void main (String[] args) {
    }
}
//TODO: Задача решена правильно, но не смог вывести значение fullName
// на экран для проверки, через sout. разобраться как это сделать?