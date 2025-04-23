package com.example;

public class LoopExample {

    public static void main(String[] args) {

        //1 to 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //10 to 1
        for(int i = 10; i >0; i--){
            System.out.println(i);
        }

        int j=100;
        while(j <= 110) {
            System.out.println(j);
            j++;
        }

        int num[] = {12,13,14,15};
        for(int x:num){
            System.out.println(x + " ");
        }
    }
}
