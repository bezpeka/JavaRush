package com.HeadFirstJava.Game.DotComBust;

import java.util.ArrayList;

public class DotCom {
    private ArrayList < String > locationCells; //массив для хранения координатов кораблей
    //    int[] locationCells;  //заменили этот массив на ArrayList
    int numofHits = 0; // количество попаданий

    public void setLocationCells (ArrayList < String > loc) { //метод для установки координат корабля в массив (сеттер)
        locationCells = loc;
    }

    public String checkYourself (String stringGuess) { //метод проверки попадания
//        int guess = Integer.parseInt (stringGuess); // считаваем данные пользователя (строку), парсим в инт
        String result = "Мимо"; // сразу присваиваем результату значение мимо
        int index = locationCells.indexOf (stringGuess);
        if (index >= 0){
            locationCells.remove (index);
            if (locationCells.isEmpty ()){
                result = "Потопил";
            }
            else {
                result = "Попал";
            }
        }
        System.out.println (result);
        return result; // возвращаем результат в вызывающий метода
    }

}
