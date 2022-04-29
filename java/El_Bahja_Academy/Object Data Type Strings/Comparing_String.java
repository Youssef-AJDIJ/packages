public class Comparing_String {
    public static void main(String[] args){
        String str1 = "hi";
        String str2 = "HI";
        String str3 = str1 + str2;
        String str4 = "Hi five";

        /*if (str3 == str4){
    // this code for normal comparing . shows us they are not equal ,but there a way for confirm about this case
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }
        // here I will go to show you another way for exact result .
        if (str3.equals(str4)){
           System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }*/
        // and we have also another way for ignore alphabets if Upper case or Lower case,
        // because by default java see (A - a) are not equal
       /* if (str1 == str2){
            System.out.println("the are equal");
        }else {
            System.out.println("the are not equal");
        }
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("the are equal");
        }else {
            System.out.println("the are not equal");
        }*/
    }
}
