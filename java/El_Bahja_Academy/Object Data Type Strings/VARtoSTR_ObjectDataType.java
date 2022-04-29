import java.text.NumberFormat;

public class VARtoSTR_ObjectDataType {
    public static void main(String[] args){
    boolean BooL = true ;
    String BoolStr = Boolean.toString(BooL);
        System.out.println(BoolStr);
    int VarInt = 201 ;
    String IntStr = Integer.toString(VarInt);
        System.out.println(IntStr);
    // these codes for you do to add a comma to a long numbers.
    double VarLong = 3_018_258_256.205;
        NumberFormat newFormat = NumberFormat.getInstance();
        String LongStr = newFormat.format(VarLong) ;
        //String final = String.format("%.2f",VarLong);
        System.out.println(LongStr);
    double VarDouble = 8_834_883.55;
    NumberFormat nezStyle = NumberFormat.getInstance();
    String STRF = nezStyle.format(VarDouble);
        System.out.println(STRF);





    }
}
