package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height){
        for (int row = 0; row < height; row++) {//Внешний цикл - идёт по столбцам
            for (int cell = 0; cell < width; cell++) {//внутренний цикл идёт по рядам
                if ((row+cell)%2 == 0){//Проверка, что сумма индеков - чётное чило
                    System.out.print("x");//если - Да, печает "Х"(без переноа строки на новую)
                } else {
                    System.out.print(" ");//если - НЕТ, печатае пробел(без переноса троки на новую)
                }
            }
            System.out.println();//поле заполнения одного ряда имволами, переносит на следующую строку
        }
    } public static void main(String[]args){
        Board.paint(3,3);
    }
}
