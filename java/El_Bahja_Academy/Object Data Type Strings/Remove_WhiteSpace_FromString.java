public class Remove_WhiteSpace_FromString {
    public static void main(String[] args){

        String str1 = "Ajdij    ";
        //str1 = str1.trim();
        System.out.println(str1.trim()); // this code for remove the white space (User Name for the login ...)

        System.out.println(str1+" this sting has " + str1.length() + "El_Bahja_Academy/Characters \n"
                + "I convert it to Upper Case : " +str1.toUpperCase());

        System.out.println(str1.trim()+" this sting has " + str1.trim().length() + "El_Bahja_Academy/Characters \n"
                + "I convert it to Upper Case : " +str1.toUpperCase());
    }

}
