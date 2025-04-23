package com.example;

public class IfExample {
    public static void main(String[] args){
        //if
        int n = 12;

        if(n>0){
            System.out.println("Yes, It is");

        }
        else{
            System.out.println("No, it is not");
        }

        // if-else
        int marks=10;

        if(marks>90){

            System.out.println("Grade A");

        } else if(marks>80 && marks<=90) {

            System.out.println("Grade B");
        } else {

            System.out.println("Fail");
        }

        // Nested if
         int num=141;

         if(num>0){

             if (num%2==0){

                 System.out.println("It is odd");
             }
         }
    }
}
