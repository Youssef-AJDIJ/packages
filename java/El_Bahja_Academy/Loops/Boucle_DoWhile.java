package El_Bahja_Academy.Loops;//package com.casting.java;

public class Boucle_DoWhile {
    public static void main(String[] args){
        int i = 0;
        boolean Accepted = true;
    /* this the different between (While) and (Do While)
        do while gives us one run time to program than it move to the loop while for check conditions,
         if conditions are false then the program will stop it */
        do {
            i++;
            System.out.println(i);
        }
        while (i <= 3 && Accepted == true);
    }
}
