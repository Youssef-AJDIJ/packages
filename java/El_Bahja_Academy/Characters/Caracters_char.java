package El_Bahja_Academy.Characters;

//package com.casting.java;
public class Caracters_char {
    public static void main(String[] args){
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("the character of c1 is : " + c1);
        System.out.println("the character of c2 is : " + c2);
        System.out.println("the character of c3 is : " + c3);

        /* if you want to use some character from unicode
        just write in the windows (character Map) then copy any symbol */

        char DollarSign = '\u0024';
        char AtSign = '\u0040';
        System.out.println("this is the dollar symbol : " + DollarSign);
        System.out.println("this is the commercial At symbol : " + AtSign);

        char a1 = 'A';
        char a2 = 'J';
        char a3 = 'D';
        char a4 = 'I';
        char a5 = 'J';
        // this code for converting the characters from upper to lower .
        System.out.print(Character.toLowerCase(a1));
        System.out.print(Character.toLowerCase(a2));
        System.out.print(Character.toLowerCase(a3));
        System.out.print(Character.toLowerCase(a4));
        System.out.println(Character.toLowerCase(a5));

    }
}
