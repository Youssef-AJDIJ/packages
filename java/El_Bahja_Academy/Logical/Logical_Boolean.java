package El_Bahja_Academy.Logical;//package com.casting.java;

public class Logical_Boolean {
    static boolean NULL; /* when you want to declare some variable without a value ,
    then you have to write it outside the methode (void main) */
    public static void main(String[] args){
        boolean A1 = true ;
        boolean A2 = false ;
        System.out.println("the value of A1 is : " + A1);
        System.out.println("the value of A2 is : " + A2);
        System.out.println("the value of NULL is : " + NULL);

        boolean A3 =! A1 ; // this code for inverse true to false .
        System.out.println("the value of A3 is : " + A3);

        int Num1 = 7 ;
        boolean A4 = (Num1 < 10);
        boolean A5 = (Num1 > 10);
        System.out.println("is it the value great than 10 ? : " + A5);
        System.out.println("is it the value less than 10 ? : " + A4);

       /* String Correct = "true" ;
        String Incorrect = "false" ;
         boolean A6 = Boolean.parseBoolean(Correct);
        boolean A7 = Boolean.parseBoolean(Incorrect);
        int Num2 = 10 ;
        boolean A8 = (Num2 > 15);
        boolean A9 = (Num2 < 15);
        System.out.println(A8);*/




    }
}
