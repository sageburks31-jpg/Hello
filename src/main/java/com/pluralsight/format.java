package com.pluralsight;

public class format {
    public static void main(String[] args){

        System.out.println(formatName("Bob", "Smith"));
        System.out.println(CompareNumbers.isEven(3));
        System.out.println(CompareNumbers.isPositive(3));
    }
    public static String formatName(String first, String last) {

        return first+", "+last;
    }


}
