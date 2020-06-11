package ru.job4j.loop;

public class Factorial {
    public static int calc(int n){
        int result = 1;
        for (int i = 1; i <= n; i = i +1){
            result = result * i;

        }
        return result;
    }
    public static void main(String[]args){
        int result = Factorial.calc(19);
        System.out.println(result);
    }
}
