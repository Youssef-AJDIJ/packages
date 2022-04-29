package El_Bahja_Academy.Catch_Try;

public class Catch_Try {
    public static void main(String[] args){
        String STR1 = "AJDIJ";
        char CRT1[] = STR1.toCharArray();
      /*  try {
            for (int i = 1 ; i <= CRT1.length ; i++){
                System.out.println(CRT1[i]);
            }
        } catch (Exception e){
                //e.printStackTrace();
                e.fillInStackTrace(); // for ignore errors from debugging and continue the code .
        }*/

        try { // this code for special error shows .
            for (int i = 0 ; i <= CRT1.length-1 ; i++){
                System.out.println(CRT1[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
           //e.printStackTrace();
            System.out.println("Index 5 out of bounds for length 5");
        }
        System.out.println("Catch the problem ??");
    }
    }
