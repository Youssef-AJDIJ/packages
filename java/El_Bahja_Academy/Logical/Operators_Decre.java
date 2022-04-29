package El_Bahja_Academy.Logical;

public class Operators_Decre {
    public static void main(String[] args){
        int a = 10 ;
        char alpha1 = 'B';
        a++ ; // next value
        //  a-- ; previous value
        alpha1++; // we cant use (alpha1 = alpha1 + 1)
        System.out.println("the next value of a is : " + a);
        System.out.printf("the next character of A is : %c\n", alpha1);
        System.out.println("the lower case of this character is : " + Character.toLowerCase(alpha1));
    }
}
