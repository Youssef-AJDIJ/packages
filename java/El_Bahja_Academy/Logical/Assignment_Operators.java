package El_Bahja_Academy.Logical;//package com.casting.java;

public class Assignment_Operators {
    public static void main(String[] args){
        int a,b ;
        a = 10;
        b = 17;
        a += 2 ; // Or ze can write it as this  (a = a + 2) .
        //a *= 2 ; Or ze can write it as this  (a = a * 2) .
        //a /= 2 ; Or ze can write it as this  (a = a / 2) .
        //a %= 2 ; Or ze can write it as this  (a = a % 2) .
        b -= 5 ; // Or ze can write it as this  (b = b - 2) .
        /* I use printf, and I add (\n) for break the line ,
         and this syntax (%d, %f, %s, ...) for defined the value .*/
        System.out.printf("the new value of a is : %d\n",a);
        System.out.printf("the new value of b is : %d",b);
    }
}
