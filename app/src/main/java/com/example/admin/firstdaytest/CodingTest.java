package com.example.admin.firstdaytest;

import java.util.Random;

/**
 * Created by Admin on 8/1/2017.
 */

public class CodingTest {

    public static void main(String[] args) {

        int[] array = new int[20];

        fillArray(array);
        printArray(array);
        System.out.println("====================================");
        FizzBuzz(array);
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static void fillArray(int[] array) {
        Random r = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100) + 1;
        }
    }

    private static void FizzBuzz(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i] % 5 == 0 && array[i] % 3 == 0){
                System.out.println("Fizz Buzz");
            } else if (array[i] % 5 == 0){
                System.out.println("Buzz");
            }else if (array[i] % 3 == 0) {
                System.out.println("Fizz");
            } else{
                System.out.println(array[i]);
            }

        }
    }
}
