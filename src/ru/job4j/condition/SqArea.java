package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {//double- тип данных который вернёт метод square
        double h = p / (2 * (k + 1));
        double L = h * k;
        double S = L * h;
        return S;
        }

        public static void main(String[] args) {
            double result1 = SqArea.square(6, 2);
            System.out.println(" p = 6, k = 2, s = ?, Площадь S = " + result1);
        }
}
