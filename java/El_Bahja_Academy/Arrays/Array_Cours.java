package El_Bahja_Academy.Arrays;//package com.casting.java;

import java.util.Arrays;

public class Array_Cours {
    public static void main(String[] args ){
        int Num1 = 10 ; // for declare a simple variable .
        int [] ArrayNum = {11,14,1992,21,04,2022}; // these values in ths array we say them (elements) .
        System.out.printf("the value is : %d",Num1); // I use here PrintF
        System.out.println(ArrayNum[0]);
        System.out.println(Arrays.stream(ArrayNum).count()); // for counting how many variables in the array .
        System.out.println(Arrays.stream(ArrayNum).min()); // for shows us the Min value of the array .
        System.out.println(Arrays.stream(ArrayNum).max()); // for shows us the Max value of the array
        System.out.println(ArrayNum.length); // for knowing how much the length of the array .
        char ArrayChar[] = {'\u0054','H','C'};
        System.out.printf("the char you select is %c" , ArrayChar[0]); // I use here PrintF

    }
}