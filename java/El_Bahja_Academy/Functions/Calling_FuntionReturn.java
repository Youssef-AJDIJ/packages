package El_Bahja_Academy.Functions;

public class Calling_FuntionReturn {
    public static void main(String[] args){
       /* long x ;
        x = Square(10);
        System.out.println(x);*/
        System.out.println(Square(10));
    }
    // this function can stock the result in variable we need to remove void from the function
    // because void mains function shows only the result not stock it
    public static long Square(long value){
        long result = value * value;
        //System.out.println(" The square of "+ value + " Is : " + result);
        return result;
    }
}
