package El_Bahja_Academy.Conditions;

//package com.casting.java;
public class ConditionShortHand{
    public static void main(String[] args){
        int x = 20  , y = 12 ;
        String Result ;
        // the code bellow shows us how we can write a condition with short handing .
        Result = (x > y) ? "the value of X is great than Y" : "the value of X is less than Y" ;
        //System.out.printf("%s \n",Result);

        String test ;
         test = ( x < y ) ? "Yes you are right !!" : "  No you are wrong !!" ;
        System.out.println(test);
    }


}


