package El_Bahja_Academy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Calculator_Test {
    public static void main(String[] args) {
        //LocalDate date1 = LocalDate.now();
        Locale locale1 = new Locale("EN" , "MA");
        LocalDateTime locale2 = LocalDateTime.now();
        DateTimeFormatter formTime1 = DateTimeFormatter.ofPattern("dd / MMMM / yyyy \nHH : mm ",locale1);
        System.out.println(formTime1.format(locale2));
            boolean work = true ;
            int i = 0 ;
        do {
            i++ ;
            System.out.print("enter first value : ");
            Scanner SNR1 = new Scanner(System.in);
            double Val1 = SNR1.nextFloat();

            System.out.println("enter the operator : ");
            Scanner SNR3 = new Scanner(System.in);
            String Val3 = SNR3.nextLine();

            System.out.print("enter first value : ");
            Scanner SNR2 = new Scanner(System.in);
            double Val2 = SNR2.nextFloat();
            double result;
        /*NumberFormat formNum1 = NumberFormat.getNumberInstance(locale1);
        BigDecimal nubAfterComm = new BigDecimal(result);
        BigDecimal formRes = nubAfterComm.setScale(2,BigDecimal.ROUND_HALF_EVEN);*/

            switch (Val3) {
                case "+":
                    result = Val1 + Val2;
                    System.out.println(result);
                    break;
                case "-":
                    result = Val1 - Val2;
                    System.out.println(result);
                    break;
                case "*":
                    result = Val1 * Val2;
                    System.out.println(result);
                    break;
                case "/":
                    result = Val1 / Val2;
                    System.out.println(result);
                    break;
            }
        }while (i <=10 && work == true );

    }
}

