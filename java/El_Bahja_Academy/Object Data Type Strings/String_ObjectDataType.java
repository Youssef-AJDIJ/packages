import javax.print.DocFlavor;

public class String_ObjectDataType {
    public static void main(String[] args){
        String STR1 = "Hello !!\n" ;
        String STR2 = "I am Youssef ";
        String STR3 = STR1 + STR2 + 30 + " Years old .";
        char CHAR1[] = {'Y','O','U','S','S','E','F'};
        int i ;
        // System.out.println(STR3);
        /*for (i =0 ; i <= CHAR1.length-1 ; i++){
        // I use here For Loop
            System.out.println(CHAR1[i]);
        }*/
        /*for(char Alpha1 : CHAR1){
        // here I am using For Each Loop
            System.out.println(Alpha1);
        }*/
        String STR4 = new String(CHAR1); // Now I want to convert the array of characters to string .
        System.out.println(STR4);

        char CHAR2[] = STR4.toCharArray(); // Here I convert string to Array .
        for( char CHAR3 : CHAR2){
            System.out.println(CHAR3);
        }

    }
}
