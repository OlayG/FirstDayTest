package com.example.admin.firstdaytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Admin on 8/1/2017.
 */

public class CodingTest {

    public static void main(String[] args) {

        int[] array = new int[20];

        fillArray(array);
        System.out.println("=============PART 1===============");
        printArray(array);
        System.out.println("====================================");
        FizzBuzz(array);
        System.out.println("=============END PART 1===============");


        System.out.println("=============PART 2===============");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");

        PrintDuplicates(stringArrayList);
        System.out.println("=============END PART 2===============");
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

    private static void PrintDuplicates(ArrayList<String> stringArrayList) {

        HashMap<String, Integer> dupes = new HashMap();

        for(int i = 0; i < stringArrayList.size(); i++) {

            if(!dupes.containsKey(stringArrayList.get(i))) {
                dupes.put(stringArrayList.get(i), 1);
            }else {
                dupes.put(stringArrayList.get(i), dupes.get(stringArrayList.get(i)) + 1);
            }
        }

        for(String key: dupes.keySet()) {
            if(dupes.get(key) > 1)
                System.out.println(key);
        }
    }
}
