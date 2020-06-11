package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left < right;
        int result = condition ? right : left;//Тернарная операция - укороченная форма записи условного перехода
        return result;
    }

    public static int max2(int left, int right) {
        boolean condition = left > right;
        int max;
        if (condition) {
            max = left;
        } else {
            max = right;
        }
        return max;
    }
    // && - логическое "и" , то есть логическое произведенеие :
    // 0 * 1 = 0 ;              1 * 0 = 0 ;                  1 * 1 = 1;
    // true && false = false ; false &&  true = false;     true && true = true ;
    // "Если хотя бы один из членов операции НЕ равен true , то весь результат не равен true, то есть false;
    //
    //
    //  "||" - логичекое "или" , то есть логческая сумма:
    // 0 + 1 = 1       ;      1 + 0 = 1      ;    1 + 1 = 1
    // true + false = true ;  false + true = true ; true + true = true ; false + false = false
    // словестно - если хотя бы один из объектов операции равен true , то общий результат  = true .
    //
    public static String salary(int salary, String car) {
        String phrase;
        String haveCar = "Car";
        if (salary == 50000 || haveCar.equals(car)) { // haveCar.equals(car) то же самое что haveCar == car
            phrase = "Ураа я доволен";
        } else {
            phrase = "Блять ! Я не доволен";
        }
        return phrase;
    }


    public static void main(String[] args) {
        int msg= Max.max(55,54);
        int msg2 = Max.max2(11, 45);
        String phrase = Max.salary(49000, "Car");
        String phrase2 = Max.salary(51000, "Car");
        String phrase3 = Max.salary(50000, "Car");
        System.out.println(phrase);
        System.out.println(phrase2);
        System.out.println(phrase3);
        System.out.println(msg);
        System.out.println(msg2);
    }
}


