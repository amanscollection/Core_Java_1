package com.example;

public class SwicthExample {

    public static void main(String[] args){

        String day = "Mon";

        switch (day){

            case "Mon":
                System.out.println("Monday");
                break;
            case "Tues":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
