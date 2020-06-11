package ru.job4j.condition;

public class MultyMax {
    public static int max(int first, int second, int third) {
        if (first>second){
            if(first>third){
                return first;
            } else {
                return third;
            }

        }else {
            if (second>third){
                return second;
            }else {
                return third;
            }
        }

    }

    public static int maxTernar(int first, int second, int third) {
        int maxOfTwu = first > second ? first : second;
        int max = maxOfTwu > third ? maxOfTwu : third;
        return max;
    }


    public static void main(String[]args){
       int result  = MultyMax.maxTernar(12,9,25);
       System.out.println(result);
    }
}

