public class Count_Search_CutStrings {
    public static void main(String[] args){
        String str1 = "Hello Every One !!";
        System.out.println(str1);
        System.out.println(str1.toUpperCase()); // this code for converting form lower case to upper case .
        System.out.println(str1.replace("Hello","Welcome And Hi "));
        System.out.println(str1.length());
        int position = str1.indexOf("Every"); // Now it will return me the position of string that I am looking for it,
        // then I stock it in variable int because it returned me a value integer .
        System.out.println(position);
        // Now I can to show the sentence from any position I want because I stock it in variable names (position).
        String STR2 = str1.substring(position , str1.length());
        System.out.println(STR2);
    }
}
