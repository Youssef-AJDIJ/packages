package El_Bahja_Academy.Functions;

public class Creation_Function {
    public static void main(String[] args){
        Addition(110,11);
        Subtraction(15,11);
        Multiplication(102,3);
        Division(10 , 10);
        Modulo(101 , 12);

    }
    // outside the main function I can to create a new function then I will call it from another function .

    public static void Addition(int x , int y){
        int z = x + y ;
        System.out.println("The Addition is : " + z);
    }
    public static void Subtraction(int x , int y){
        int z = x - y ;
        System.out.println("The Subtraction is : " + z);
    }
    public static void Multiplication(int x , int y){
        int z = x * y ;
        System.out.println("The Multiplication is : " + z);
    }
    public static void Division(int x , int y){
        int z = x / y ;
        System.out.println("The Division is : " + z);
    }
    public static void Modulo(int x , int y){
        int z = x % y ;
        System.out.println("The Modulo is : " + z);
    }
}
