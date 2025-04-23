package com.example;

public class ArraySumExample {

    public static void main(String[] args) {

        int num[] = {12,13,14,15};
        int s=0;
        for(int x:num){
            s = s+x;
        }
        System.out.println("Sum of the variables: " + s);
    }
}
