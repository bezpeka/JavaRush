package com.HeadFirstJava.page1to99.page94;

public class TestArrays {
    public static void main (String[] args) {
        int y = 0;
        String[] islands = new String[4];
//  эта запись значит, что мы создали ссылку для строкового массива типа island
//  которой  присвоили новосозданный объект, который является строковым массивом размерности 4,
//  каждая ячейка которого содержит ссылки на пока еще не существующие объекты того же типа island
//  т.е. ссылки не имеют физических объектов в куче и равняются значению null
        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.println (islands[ref]);
            y = y + 1;
        }
    }
}
