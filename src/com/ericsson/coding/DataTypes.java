package com.ericsson.coding;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by smcgrath on 7/13/2017.
 */
public class DataTypes {
    public static void main(String[] args) {

        changeToCel(212.00);
        changeToMet(1000);

        Scanner in = new Scanner(System.in);


//        int [] array = new int[3];
//
//
//        for(int i =0; i < array.length; i++){
//            System.out.println("Please enter your number");
//             array[i] = in.nextInt();
//        }
//
//        countInts(array);
        minsToYears(3456789);

    }

    public static double changeToCel(double fahrenheit) {

        double celsuis = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsuis);
        return celsuis;
    }

    public static double changeToMet(int inch) {
        double inichInMeters = 0.0254;

        double total = inch * inichInMeters;
        System.out.println(total);
        return total;
    }

    public static int countInts(int [] num){
        int tot = 0;
        for(int i =0; i< num.length; i++){
            tot += num[i];
        }
        System.out.println(tot);
        return tot;
    }

    public static void minsToYears(int min){

        double minInYear = 60 * 24 * 365;

        long years = (long) (min /minInYear);
        int days = (min /60/24) % 365;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }


}
