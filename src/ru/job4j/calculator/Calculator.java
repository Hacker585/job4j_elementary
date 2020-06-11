package ru.job4j.calculator; // первая строка в файле класса - это путь к классу от папки src до файла класса

import ru.job4j.condition.Stas;

public class Calculator {
    public static void main( String[] args){
     int one = 1;
     int two = 2;
     int six = 6;
     int four = 4;
     int five = 5;
     int sixDivTwo = six/two;
     int fiveMinusTwo = five - two;
     int fourTimeTwo = four * two;
     int sum = one + two + six + four + five;
     System.out.println("Сумма = " + sum);
     System.out.println(sixDivTwo);
     System.out.println(fourTimeTwo);
     System.out.println(fiveMinusTwo);
     Stas stas = new Stas();
     Stas stas2 = new Stas();
     String string = new String();
     string = "I'm string";
     char c = 'H';

     stas2.weight = 65;

     System.out.println("Мой рост - " + stas.height);
     System.out.println("Я раньше весил " + stas.weight + " но теперь я вешу " + stas2.weight);
     stas.sayHello();

    }
}
