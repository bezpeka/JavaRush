package com.HeadFirstJava.Game.DotComBust;

import java.util.ArrayList;

public class DotCom {
    private ArrayList < String > locationCells; //массив для хранения координатов кораблей
    private String name;

    public void setLocationCells (ArrayList < String > loc) { //метод для установки координат корабля в массив (сеттер)
        locationCells = loc;
    }

    public void setName (String n) {
        name = n;
    }

    public String checkYourself (String userinput) { //метод проверки попадания
        String result = "Мимо"; // сразу присваиваем результату значение мимо
        int index = locationCells.indexOf (userinput);
        if (index >= 0){
            locationCells.remove (index);

            if (locationCells.isEmpty ()){
                result = "Потопил";
                System.out.println ("Ой! Вы потопили " + name + " :( ");
            }
            else {
                result = "Попал";
            }
        }
        System.out.println (result);
        return result; // возвращаем результат в вызывающий метод
    }
}
