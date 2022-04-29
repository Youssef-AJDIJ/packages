package El_Bahja_Academy.Mathematic;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class StyleAndFraction_DecimalNumber {
    public static void main(String[] args){
        // here I will show you how defined how many numbers you want to see after the comma ,
        // and in the same time I will show you how to change the format of the numbers .

        double Num1 = 2087624.125 ;

        // here I print it without any modification .
        System.out.println("I print it without any modification : "+Num1);

        // first I will define the numbers after comma .
        BigDecimal NumConv = new BigDecimal(Num1);
        System.out.println("I define the numbers after comma : "+NumConv.setScale(5,BigDecimal.ROUND_HALF_EVEN));

        // second I will change the format of numbers .
        Locale LocStyle = new Locale("EN" , "MA");
        NumberFormat NumStyle = NumberFormat.getInstance(LocStyle) ;
        System.out.println("I change the format of numbers : "+NumStyle.format(Num1));

        // Now we go to use the both functions together .
        System.out.println("I use the both functions together : "+NumStyle.format(NumConv.setScale(2,BigDecimal.ROUND_HALF_EVEN)));


    }

}
