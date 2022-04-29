package El_Bahja_Academy.Mathematic;//package com.casting.java;

public class Mathematic {
    public static void main(String[] args){
    int x = 10 ; int y = 3 ;
    int Add = x + y ;
    int Sub = x - y ;
    int Mul = x * y ;
    int Div1 = x / y ;
    float Div2 = (float) x / y ; // this for the exact result you must use variable float or double .
    int Mod = x % y ; // this shows to us a number that it stays after division .

        System.out.println("the addition is : " + Add);
        System.out.println("the subtraction is : " + Sub);
        System.out.println("the multiplication is : " + Mul);
        System.out.println("the division is : " + Div1);
        System.out.println("the division is : " + Div2);
        System.out.println("the modulo is : " + Mod);

    float Z = -17.412f ;
    float AbsF = Math.abs(Z); // this code convert numbers from Negative to positive .
    float RoundF = Math.round(AbsF);
    double XYZ1 = Math.ceil(AbsF);
    double XYZ2 = Math.floor(AbsF);
    String XYZ3 = String.format("%.0f",XYZ2); // this code for hidden all numbers after the comma .
        System.out.println("this is the absolute value : "+AbsF);
        System.out.println("this is the round value : "+ RoundF);
        System.out.println("this is the ceil value :  "+ XYZ1);
        System.out.println("this is the floor value :  "+ XYZ2);
        System.out.println("this is the value without comma :  "+ XYZ3);

    }

}
