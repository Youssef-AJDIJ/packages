package El_Bahja_Academy.Loops;//package com.casting.java;

public class Boucle_While {
    public static void main(String[] args){
        float i , number  ;
        float result ;
        i = 1 ;
        number = 55 ;
    // here we used (while loop) for make calculator of any number you input .
        while(i <= 10){
            result = number / i ;
            String ReS = String.format("%.2f",result);
            System.out.println(number + " / " + i + " = " + ReS);
            i +=2 ;
        }
    }
}
