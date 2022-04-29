package El_Bahja_Academy.Loops;//package com.casting.java;

public class Boucle_BreakAndContinue {
    public static void main(String[] args){
        int Number , i , Result;
        Number = 6 ;
        i = 1;
        while(i<=10){
            Result = Number * i;
            if(i == 5){
                // break ;
                /* there is also (continue) , it ignores the value and continue the loop again,
                and we have added (i) before function (continue) .*/
                i++;
                continue;
            }
            // as you see we can add another if in the loop , and here it goes hide the number seven also .
            if (i == 7){
                i++;
                continue;
            }
            System.out.println("Multiplication Of Number " + Number + " Is : " + Number + " x " + i + " = " + Result );
            i++ ;
        }
        System.out.println("The loop is completed !!");
    }
}
