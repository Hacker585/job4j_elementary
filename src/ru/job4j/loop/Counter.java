package ru.job4j.loop;

public class Counter {
    public static int sum( int start, int finish){
        int sum = 0;
        for ( int x = start; x < finish; x = x +1){
            sum = sum +x;

        }
return sum;
    }
     public static void main(String[]args){
      int result =  Counter.sum(1,11);
        System.out.println(result);
        int result2 = Counter.sumByEven(1,12);
        System.out.println(result2);
     }
     public static int sumByEven( int start, int finish){
        int sum = 0;
        for ( int x = start; x <= finish; x = x+1){
            if (x % 2 == 0){
                sum = sum +x;
            }
        }
        return sum;
     }
}

