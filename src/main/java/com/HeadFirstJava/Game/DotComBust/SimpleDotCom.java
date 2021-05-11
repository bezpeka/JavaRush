package com.HeadFirstJava.Game.DotComBust;

public class SimpleDotCom { // создали рабочий класс
    int[] locationCells; //массив для хранения координатов кораблей
    int numofHits = 0; // количество попаданий

    public void setLocationCells (int[] locs) { //метод для установки координат корабля в массив (сеттер)
        locationCells = locs;
    }

    public String checkYourself (String stringGuess) { //метод проверки попадания
        int guess = Integer.parseInt (stringGuess); // считаваем данные пользователя (строку), парсим в инт
        String result = "Мимо"; // сразу присваиваем результату значение мимо
        for (int cell : locationCells){ // Повторяем это с каждым элементом массива
            if (guess == cell){ //Проверяем попадание
                result = "Попал";
                numofHits++;
                break;
            }
        }
        if (numofHits == locationCells.length){ // если количество попаданий = длине масива то...
            result = "Потопил";
        }
        System.out.println (result);
        return result; // возвращаем результат в вызывающий метода
    }
}
