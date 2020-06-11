package ru.job4j.condition;

public class Cycle {

    public static void cycleWhile() {
        long x = 15;
        int y = 10;
        while( x>10 && y > 0){ //цикл работает до тех пор пока оба условия = true (логическое произведение, то еть логическое "и")
            if ( x % 1000000000 == 0) { // оператор % возвращает остаток од деления первого операнда на второй
                y = y -1;
                System.out.println(y);
            }
            x = x + 1;
        }
    }

    public static void cycleFor() {
        for (int x = 0;   x < 1000000000    ;x = x + 1) {//1 - инициализация, объявить переменную цикла, 2 - условие, пока true , цикл работает, 3 - итерация , то есть изменение переменной цикла
            if ( x % 2 == 0)
            System.out.println(x);
            // в конце тела цикла происходит итерация , объявленная в условии цикла (x = x + 1)
            //затем происходит проверка условия цикла (x<1000000000) , если условие = false, цикл прекращается, программа следует дальше
        }
    }

    public static void cycleDoWhile() {
        int x = 3;
        do {
            System.out.println("Внутри цикла do-while");
            x = x - 1;
        } while (x!=0);
        System.out.println("Вышел из цикла");
    }

    public static void remainder() {

        double tenDiv7 = 100.0 / 7.0;
        int xReminderDiv7 = 100 % 7;
        System.out.println("100 делить на 7 = " + tenDiv7);
        System.out.println("Остаток от деления 100 на 7 = " + xReminderDiv7);

        double hundredDib53 = 100.0 / 53.0;
        int hundRem53 = 100 % 53;
        System.out.println("100 делить на 53 = " + hundredDib53);
        System.out.println("Остаток от деления 100 на 53 = " + hundRem53);
    }



    public static void main(String[] args) {
        Cycle.cycleDoWhile();

    }
}
