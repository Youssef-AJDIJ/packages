
import java.util.Scanner;

public class User_Input {
    public static void main(String[] args){

        System.out.printf("Please entry Your Fist name :");
        Scanner SCN = new Scanner(System.in);
        String name = SCN.nextLine();
        System.out.printf("Please entry Your Fist name1 :");
        Scanner SCN1 = new Scanner(System.in);
        String name1 = SCN.nextLine();
        System.out.println(name + name1);

    }
}
