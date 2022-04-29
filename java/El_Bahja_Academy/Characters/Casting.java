package El_Bahja_Academy.Characters;//package com.casting.java;
        // this code for telling this software where is the location or path of these files .

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Casting {
    public static void main(String[] args){
        int ValX ;
        ValX = 100;
        System.out.println("the integer value is : " + ValX);
        double ValY ;
        ValY = ValX + 1.5;
        String ValZ = String.format("%.4f",ValY) ;
        float NumX = 1253.251f;
        BigDecimal NumConv1 = new BigDecimal(NumX) ;
        Locale local1 = new Locale("EN");
        NumberFormat NumStyle = NumberFormat.getNumberInstance(local1);
        System.out.println(NumStyle.format(NumX));
        System.out.println(NumConv1.setScale(2,BigDecimal.ROUND_HALF_EVEN));
        System.out.println(NumStyle.format(NumConv1.setScale(2,BigDecimal.ROUND_HALF_EVEN)));

        //System.out.println(ValZ);

        // this code here above for defined how many numbers you want after the comma .

        // these codes bellow for knowing how much the MaxValue of eich variables numeric .
       /* System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);*/

        // and here bellow we will start to learn how to convert a variable short byte ...
        // to another type as long double ... ( upcasting - downshifting ) .

      /*  byte ValA = 100 ;
        System.out.println(ValA);
        short ValB = ValA  ;
        System.out.println(ValB);
        int ValC = ValA ;
        System.out.println(ValC);
        long ValD = ValA ;
        System.out.println(ValD);*/
    }
}
