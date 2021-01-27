//package com.servitant.timemashine;
///*
//Машина времени имеет два метода. Оба принимают на вход число,
//обозначающее текущий год, и либо увеличивают, либо уменьшают значение
//(в зависимости от того, хотим мы отправиться в прошлое или в будущее).
//
//Но, как видно из вывода в консоль, метод не сработал!
//
//Вывод в консоль:    Какой сейчас год?
//                    2020
//                    А сейчас?
//                    2020
//
//Мы передали переменную currentYear в метод goToPast(), но ее значение не поменялось.
//Как было 2020, так и осталось. Но почему? :/
//Потому что примитивы в Java передаются в методы по значению.
//Что это значит?
//Когда мы вызываем метод goToPast(), и передаем туда нашу переменную
//int currentYear = 2020, в метод попадает не сама переменная currentYear, а ее копия.
//
//Значение этой копии, конечно, тоже равно 2020,
//но все изменения, которые происходят с копией,
//никак не влияют на нашу изначальную переменную currentYear!
// */
//public class TimeMashinePrimitive{
//
//    public void goToFuture(int currentYear) {
//
//        currentYear = currentYear+10;
//    }
//
//    public void goToPast(int currentYear) {
//
//        currentYear = currentYear-10;
//    }
//
//    public static void main(String[] args) {
//
//        TimeMashinePrimitive timeMachine = new TimeMashinePrimitive();
//        int currentYear = 2020;
//
//        System.out.println("Какой сейчас год?");
//        System.out.println(currentYear);
//
//        timeMachine.goToPast(currentYear);
//        System.out.println("А сейчас?");
//        System.out.println(currentYear);
//    }
//}
