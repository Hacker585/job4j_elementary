package ru.job4j.Fit;

public class Fit {
    public static double manWeigt(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(double height){
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
       double man = Fit.manWeigt(180);

       System.out.println("Man's weight  is " + man);

       double woman = Fit.womanWeight(160);

       System.out.println("Woman's weight  is " + woman);

    }
}
