package El_Bahja_Academy.Arrays;

import java.util.Arrays;

public class Array_Copy {
    public static void main(String[] args){
        int OriginalArray [] = {12,70,1,120,5,2000};
        int CopyArray [] = new int[6];
        // this code for copy an array to another one .
        // System.arraycopy(OriginalArray,3,CopyArray,3,3);
        System.arraycopy(OriginalArray,0,CopyArray,0,6);

        Arrays.sort(CopyArray,0,5);
        String hfh = "dekd"
        System.out.println(CopyArray[0]);
        System.out.println(CopyArray[1]);
        System.out.println(CopyArray[2]);
        System.out.println(CopyArray[3]);
        System.out.println(CopyArray[4]);
        System.out.println(CopyArray[5]);
    }
}++++
