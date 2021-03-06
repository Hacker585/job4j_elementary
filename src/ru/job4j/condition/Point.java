package ru.job4j.condition;

import java.util.Calendar;
import java.util.Date;

public class Point {


    public static void main(String[] args) {//особый метод с именем main с которого стартует любая программа
        System.out.println("Hello, stas");
        Date current = new Date(2020, Calendar.JUNE, 6);
        System.out.println(current);
        double result = Point.distance(4, 2, 12, 6);//создаю переменную  именем result и присваиваю ей результат вычисления
        // метода distance( который я программировал заранее) из класса Point(который я сам и создал),
        // в аргументы метода distance передаю координаты точек между которыми хочу найти расстояние
        System.out.println("Расстояние между точкой А(4, 2) и Б(12, 6) равно " + result);//прошу вывести на экран два аргумента первый из них текст"result(0,0) to (2
    }

    public static double distance(int x1, int y1, int x2, int y2) {// double- тип данных который вернёт метод distance
        int x2x1 = x2 - x1;//создаю переменную типа int с именем x2x1 и присваеваю её результат разности х2 - х1
        int y2y1 = y2 - y1;// аналогично верхней строчке
        double first = Math.pow(x2x1,2);//создаю переменную типа double с именем first и присваиваю ей результат, который вернёт метод pow(степень) из класса Math
        //первый аргумент - это имя переменной для возведения в степень а второй - это степень в которую нужно возвести.
        double second = Math.pow(y2y1,2);//аналогично верхней строчке(операция - точка(.) для доступа к методам класса Math
        double  firstAndSecond = first + second;//создал новую переменную именем "firstAndSecond" и присвоил ей результат двух прдведущих переменных
        double rsl = Math.sqrt(firstAndSecond);// создал переменную с именем rsl и присвоил ей результат который вернёт метод sqrt(корень квадратный) из класса Math
        return rsl;//прошу метод distance вернуть программе значения переменной rsl
    }

}
