package com.example.calculator;

/**
 * SWEN90006 Group Assignment
 * A program that calculate how many coins should be returned to user given the total amount (0，100).
 * Created by donggeliu on 1/10/2016.
 */
public class Changes {

    public static final int MAX = 100;
    public static final int MIN = 0;

//    public static void main(String[] args) {
//
//        System.out.println(calculate(4));
//
//    }

    public static String calculate(int amount) {
        boolean isFirst = true;
        String result = "";

//        System.out.printf("Should return %d cents: ", amount);

        if (amount > MIN && amount < MAX) {

            if (amount >= 50 && isFirst) {
                result += "50";
                isFirst = false;
                amount -= 50;
            }


            if (amount >= 20 && isFirst) {
                amount -= 20;
                result += "20";
                isFirst = false;

                if (amount >= 20) {
                    amount -= 20;
                    result += ", 20";
                }

            } else {
                if (amount >= 20 && !isFirst) {
                    amount -= 20;
                    result += ", 20";
                }

                if (amount >= 20 && !isFirst) {
                    amount -= 20;
                    result += ", 20";
                }
            }

            if (amount >= 10 && isFirst) {
                amount -= 10;
                result += "10";
                isFirst = false;
            } else {
                if (amount >= 10 && !isFirst) {
                    amount -= 10;
                    result += ", 10";
                }
            }

            if (amount >= 5 && isFirst) {
                amount -= 5;
                result += "5";
                isFirst = false;
            } else {
                if (amount >= 5 && !isFirst) {
                    amount -= 5;
                    result += ", 5";
                }
            }

            if (amount >= 2 && isFirst) {
                amount -= 2;
                result += "2";
                isFirst = false;

                if (amount >= 2) {
                    amount -= 2;
                    result += ", 2";
                }

            } else {
                if (amount >= 2 && !isFirst) {
                    amount -= 2;
                    result += ", 2";
                }

                if (amount >= 2) {
                    amount -= 2;
                    result += ", 2";
                }
            }

        }

//        System.out.println(result);

        return result;
    }


}
