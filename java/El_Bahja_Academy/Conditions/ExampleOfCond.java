package El_Bahja_Academy.Conditions;//package com.casting.java;

public class ExampleOfCond {
    public static void main(String[] args){
        String CIN = "Exist" , PASS = "NotExist" ,VIPCard = "Exist", Result ;
    // I Use three conditions in the same order .
        Result = (CIN == "Exist" && PASS == "Exist" || VIPCard == "Exist" )
    // here ze use Or because the customer when has CIN Or Pass can get inside the company
                ? "Valid \n Please Entry !!\n We Hope To You will spending a good time \u0040 "
                : "Invalid \n You have to give us your Pass" ;

        System.out.printf("Sir Your access is : %s", Result);

        // name = (here condition) ? here if true : here if false ;

    }

}
