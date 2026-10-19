package com.pluralsight;

public class format {
    public static void main(String[] args){

        System.out.println(formatName("Bob", "Smith"));
    }
    public static String formatName(String first, String last) {

        return first+", "+last;
    }


}
