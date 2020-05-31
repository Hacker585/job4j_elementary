package ru.job4j.condition;

public class AlertDivByZero {

    public static void main(String[] args) {
            possibleDiv( -4);
            possibleDiv( 16);
        }

        public static void possibleDiv(int number) {
        if (number  < 0 ) {
                System.out.println("This is negative numbers" + number);
            }
        else {
            System.out.println("This is positive numbers" + number);
        }
        }
    }

