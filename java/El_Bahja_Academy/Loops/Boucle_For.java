package El_Bahja_Academy.Loops;//package com.casting.java;

public class Boucle_For {

    public static void main(String[] args){
        int i , number , result ;
        number = 6 ;
        // we create a simple calculation multiplication for any number you input .
        for(i = 0 ; i <= 3 ; i ++){
            result = number * i ;
             System.out.println("Multiplication Of Number "+ number +" Is :   " + number + " x " + i + " = " + result);
        }
        for(i = 3 ; i > 0 ; i --){
        // this code loop for inverse the loop from the greatness to the less .
            System.out.println(i);
        }

        for(i = 0 ; i < 10 ; i +=2){
        // this code for define how many steps you want to move by its.
            System.out.println(i);
        }
        }
    }

