package El_Bahja_Academy.Functions;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Creation_FunctionMultiArgs {
    public static void main(String[] args){
        // Detail_Buy("Chocolat",60 , 0.20 , "MAD");
        Detail_Buy("Samsung S10",9000,0.2,"MAD");
    }
    public static void Detail_Buy(String NameProduct ,int Prix , double Total_TVA , String Devis){

        System.out.println("You bought " + NameProduct);
        System.out.println("The Price hors tax is : " + Prix +" " + Devis);

        int TVA = (int) (Prix * Total_TVA);
        System.out.println("Amount of TVA is : " + TVA );
        double TTC = (Prix + TVA) ;
        BigDecimal nn = new BigDecimal(TTC);
        System.out.println("The total amount is : " + nn.setScale(2,BigDecimal.ROUND_HALF_EVEN)+ Devis);

    }
}
