package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {// перед именем метода стоит тип переменной который вернёт этот метод (int)
      int result = value / 70;
      return result;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[]args){// перед именем метода стоит void, значит он ничего не возвращает
        int euro = Converter.rubleToEuro(140);
        System.out.println(" 140 rubles are " + euro +" euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println(" 120 rubles are " + dollar + " dollar." );
    }
}
