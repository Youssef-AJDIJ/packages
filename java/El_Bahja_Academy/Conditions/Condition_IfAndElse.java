package El_Bahja_Academy.Conditions;//package com.casting.java;

public class Condition_IfAndElse {
    public static void main(String[] args){
        float Num1 = 12.20f ;
        float MinNote = 10.25f ;
        String Num2 = String.format("%.2f",Num1);

        if (Num1 >= 10.25 && Num1 <= 20.00 ){
            System.out.println("You are Pass with successfully ");
            System.out.println("Your note is : " + Num2);
        }
        else if (Num1 > 20) {
            System.out.println("Please check your note again !! \nyour note should be between 0 and 20");
        }
        else {
            System.out.println("You are failed !!");
            System.out.println("Your note should be Great than or equal : "+ MinNote);
        }
    }
}
