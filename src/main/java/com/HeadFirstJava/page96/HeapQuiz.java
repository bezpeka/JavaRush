package com.HeadFirstJava.page96;

public class HeapQuiz {
    int id = 0;

    public static void main (String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) { // Создали три ссылки на объекты hq типа HeapQuiz, id0 (hq0), id1 (hq1), id2 (hq2)
            hq[x] = new HeapQuiz (); // еще две ссылки (hq3) и (hq4) объектов не имеют = null
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1]; //Ссылка (hq3) теперь ссылается на объект id1, на который так же ссылается (hq1)
        hq[4] = hq[1]; //Ссылка (hq4) теперь ссылается на объект id1, на который так же ссылается (hq1)
        hq[3] = null;  //Ссылка (hq3) теперь обнулена
        hq[4] = hq[3]; //Ссылка так же обнулена
        hq[0] = hq[3]; //Ссылка так же обнулена
        hq[3] = hq[2]; //Ссылка (hq3) теперь ссылается на объект id2, на который так же ссылается (hq2)
        hq[2] = hq[0]; //Ссылка так же обнулена
        // Делаем что-то
    }
}