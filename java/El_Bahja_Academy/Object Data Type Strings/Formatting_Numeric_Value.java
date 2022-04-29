import java.text.NumberFormat;
import java.util.Locale;
import java.math.*;

public class Formatting_Numeric_Value {
    public static void main(String[] args){
        double Num2 = 1221265324.5621 ;
        Locale localePc = new Locale("EN","MA");
        Locale LocalePc1 = new Locale("EN" , "MA");
        // we this util for number formatting takes the same parameters of numbers in the local (My Laptop).
        double Num1 = 12789.15 ;
        NumberFormat NumStyle = NumberFormat.getNumberInstance(localePc);
        System.out.println("the number is :"+NumStyle.format(Num1));

        NumberFormat currSym = NumberFormat.getCurrencyInstance(LocalePc1);
        System.out.println("the currency is : " +currSym.format(Num1));

        NumberFormat IntStyle = NumberFormat.getIntegerInstance();
        System.out.println("the integer is : "+IntStyle.format(Num1));
        BigDecimal NumConv = new BigDecimal(Num2);
        System.out.println(NumStyle.format(NumConv.setScale(2,BigDecimal.ROUND_HALF_EVEN)));


        }
    }

