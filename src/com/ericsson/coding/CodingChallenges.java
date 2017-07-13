package com.ericsson.coding;

/**
 * Created by smcgrath on 7/12/2017.
 */
public class CodingChallenges {
    public static void main(String[] args) {

        stringTimes("What is the craic", 3);
        frontString("This is a load of bollocks", 3);
        countXX("this is a test xxx xxxx ");

    }
    public static   String stringTimes(String str, int n){
        String result = "";

        for(int i = 0; i< n; i++){
            result = result + str;
        }
        System.out.println(result);
        return result;
    }

    public static   String frontString(String str, int n){
        String result = "";

        for(int i = 0; i< n; i++){
            result = result + str.substring(0,n);
        }
        System.out.println(result);
        return result;
    }

    public static   void countXX(String str){
       int count = 0;
        for(int i = 0; i< str.length(); i++){
            if(str.contains("xx"))
                count ++;
            else if(str.contains("xxx"))
                count = 2;
            else{
                count = 3;
            }
        }
        System.out.println(count);
       
    }

}
