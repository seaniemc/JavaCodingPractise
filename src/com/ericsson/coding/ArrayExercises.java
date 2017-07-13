package com.ericsson.coding;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by smcgrath on 7/13/2017.
 */
public class ArrayExercises {
    public static void main(String[] args) {
//        sortArray();
//        System.out.println("");
//        sumArray();
//        System.out.println("");
//        printArray();
//        System.out.println("");
//        avOfArray();
//        System.out.println("");
//        isItThere(55);
//        System.out.println("");

//        System.out.println("Please enter an Integer value to be checked!");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        boolean there = isItThere(num);
//        System.out.println("Is the Integer there? " +there);
       // dupsOfValues();
        copyArray();
        highestValue();
        highestAndLowestValue();
        //reverseValue();
        findAve();
    }

    public static void sortArray(){
        int[] array = {1,4,5,6,0,9,8,7,6,5};
        String[] strArray = {"e", "f", "q", "p", "r", "m"};

        System.out.println("The original Array " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array " +Arrays.toString(array));

        System.out.println("The original Array " +Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted array " +Arrays.toString(strArray));

    }

    public static void sumArray(){
        int [] array = {9,8,7,2,1,4,6};
        int total = 0;

        for(int i =0; i < array.length; i++){
            total += array[i];
        }
        System.out.println("Total value of array " + total);
    }

    public static void printArray(){
        int [][]a = new int[10][10];

        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void avOfArray(){
        int [] array = {922,33,44,225,23,23,343,4,3456};

        int aver = 0;

        for(int i =0; i < array.length; i ++){
            aver += array[i];
        }
        aver = aver / array.length;
        System.out.println("The average of the Array " + aver);
    }
    public static boolean isItThere(int num) {

        int[] array = {1, 3, 4, 222, 33, 44, 23442, 456789, 9923, 34, 214};
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return true;
        }
        return false;
    }

    public static void copyArray(){
        int [] array ={2,5,7,8,9,0};
        System.out.println("Original array is: "+ Arrays.toString(array));
        int [] array2 = new int[array.length];

        for (int i = 0; i <array.length ; i++) {
            array2[i] = array[i];
        }
        System.out.println("Original array is: "+ Arrays.toString(array2));
    }

    public static void highestValue(){
        int [] array = {1,5,6,3,77,8,99,88,6445,6,5,4,67,8};
        int highest = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]> highest)
                highest = array[i];
        }
        System.out.println("Is "+highest+" the highest value in the Array");
    }

    public static void highestAndLowestValue(){
        int [] array = {4,5,6,3,77,8,99,88,6445,6,5,4,67,8};

        int highest, lowest;
        Arrays.sort(array);

        lowest = array[0];
        highest =array[array.length-1];

        System.out.println(highest+" IS the highest value in the Array, while " +lowest+ " Is the lowest value");

    }

    public static void reverseValue(){
        int [] array = {4,5,6,3,77,8,99,88,6445,6,5,4,67,8};

        int []reversed = new int[array.length];
        int j = 0;
        for (int i = array.length ; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }

        System.out.println("Original Array is " +Arrays.toString(array));
        System.out.println("Reversed Array is " + Arrays.toString(reversed));
    }

    public static void dupsOfValues(){
        int [] array = {3,4,82,1,2,4,4,5,3,0,9,8};

        for (int i = 0; i < array.length; i++){
            for(int j = 1; j <=array.length; j++){
                if(array[i] == array[j] && i !=j){
                    System.out.println(array[j]+" Is a duplicate number");
                }
            }
        }
    }
    public static void findAve(){
        int [] array ={223,567,389,3838,3,3432,4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int aver = 0;
        int i;
        for( i = 1; i < array.length-1; i ++){
            aver += array[i];
        }
        aver = aver / i;
        System.out.println("The average of the Array " + aver);
    }
}
