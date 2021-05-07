package com.HeadFirstJava.Game.DotComBust;

public class SimpleDotComTestDrive { //Создаем тестовый класс, для проверки нашего основного класса
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom (); //Создаем ссылку на новый екземпляр нашего основного класса

        int[] locations = {2, 3, 4}; //задаем координаты нашего кораблика (морской бой)
        dot.setLocationCells (locations); //вызываем метод из нашего основного класса

        String userGuess = "2"; //задаем точку выстрела
        String result = dot.checkYourself (userGuess); // проверяем попадаение
        String testResult = "Неудача";
        if (result.equals ("Попал")){
            testResult = "Пройден";
        }
        System.out.println (testResult); // выводим результат
    }
}
