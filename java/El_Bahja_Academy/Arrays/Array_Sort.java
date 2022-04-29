package El_Bahja_Academy.Arrays;//package com.Casting.java;

import java.util.Arrays; // this is an utils already exist in java .
import java.util.Collection;
import java.util.Collections;

public class Array_Sort {
    public static void main(String[] args){
        int Array1[] = {150,12,300,2000,4};
        char Array2[] = {'D','G','A','W','R'};


        //Arrays.sort(Array1,0,5);
       Arrays.sort(Array1); // this code for sorting the array from Min to Max ...

        for (int Num : Array1){
            System.out.printf(Num + " ");
        }
        System.out.println();
        for (int i = Array1.length-1 ; i >= 0 ; i--){
            System.out.print(Array1[i]+ " ");
        }
        /*for ( int i = 0 ; i < Array2.length ; i++){
            System.out.println(Array2[i]);
        }
        for (int i = Array2.length-1; i >= 0 ; i--){
            System.out.println(Array2[i]);
        }*/
    }
}
