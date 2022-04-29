package El_Bahja_Academy.Functions;

import javax.swing.*;

public class CallingFunctionInAnother_fun {
    public static void main(String[] args){
        Invoice("LIGEON MEDIA" , "Banner FrontLite",5,920,.20,"MAD");
        Invoice("AM TIRAGE","HEAD DX5",1,1900,0.20,"$");

    }
    public static void  Invoice(String Client ,String Poduct, double Qantity ,double Prix_Htt , double TVA , String Devise ){
        System.out.println("Client : " + Client);
        System.out.println("Product : " + Poduct);
        System.out.println("Prix : " + Prix_Htt + " " + Devise);
        System.out.println("Qantity : " + Qantity);
        Qantity = Prix_Htt * Qantity ;

        double Total_TVA = Qantity * TVA ;
        System.out.println("TVA : " + Total_TVA + " " + Devise);
        double Prix_Ttc = Qantity + Total_TVA;
        System.out.print("Montant Total: " + Prix_Ttc + " " + Devise);
        Convert_Money(Devise , Prix_Ttc);
        System.out.println("\n\n");

    }
    public static void Convert_Money(String Devise , double Prix_Ttc){
        switch (Devise){
            case "$":
                System.out.println(" =   ( " + Prix_Ttc * 9 + " MAD )");
            break;
            case "€":
                System.out.println(" =   ( " + Prix_Ttc * 11 + " MAD )");
            break;
        }
    }
}
