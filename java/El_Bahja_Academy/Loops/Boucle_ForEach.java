package El_Bahja_Academy.Loops;//package com.casting.java;

import java.util.Arrays;

public class Boucle_ForEach {
    public static void main(String[] args){
        int UsersID[] = {12,20,1,150,5,7,200};
        String Users[] = {"YOUSSEF","MOHAMED","FARID","AMAR"};
        int i = 0 ;
        int Array1 = 0 ;
        Arrays.sort(Users);
        System.out.println("This is all users have in the company !!");
        // the first example I worked by loop for only
        for (i = 0 ; i <= UsersID.length-1 ; i++){

            System.out.println("Array "+ Array1++ + " = " + UsersID[i]);
        }
        // here I used Loop For Each ,It is very simple .
       /* for( int ID : UsersID ){
            System.out.println("The Value Of Index "+ Array1++ + " Is : " + ID);
        }*/
        for(String Name : Users ){
            System.out.println("His First Name Is : " + Name);
        }



    }
}
