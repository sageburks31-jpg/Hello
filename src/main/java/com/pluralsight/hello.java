package com.pluralsight;

public class hello {
    public static void main(String[] args) {

        menu.displayMenu();
        sayHello();
        sayGoodbye();
        sayGoodMorning();
        menu.displayMenu();
    }
    public static void sayHello(){
        System.out.print("Hello, World!");

    }
    public static void sayGoodbye(){
        System.out.print("Goodbye!");

    }
    public static void sayGoodMorning(){
        System.out.println("Good morning!");

    }
}