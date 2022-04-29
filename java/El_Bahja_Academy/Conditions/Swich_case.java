package El_Bahja_Academy.Conditions;

public class Swich_case {
    public static void main(String[] args){
        // some Countries ID : 1 Morocco - 2 Algerian - 3 Tunisian - 4 Egyptian
        int Country = 20 ;
        switch (Country){
            case 1 :
                System.out.println("Your nationality from : Morocco");
            break;
            case 2 :
                System.out.println("Your nationality from : Algerian");
            break;
            case 3 :
                System.out.println("Your nationality from : Tunisian");
            break;
            case 4 :
                System.out.println("Your nationality from : Egyptian");
            break;
            default :
                System.out.println("Sorry Sir you are not from North Africa");
            break;

        }
    }
}
