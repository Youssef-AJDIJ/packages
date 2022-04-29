package El_Bahja_Academy.Logical;

public class Operators_Logic {
    // || this means OR , && this means AND , == this means EQUAL , != this means NOT EQUAL
    public static void main(String[] args){
       /* int Num1 , Num2 ;
        Num1 = 10 ;
        Num2 = 20 ;

        if(Num1 == Num2 || Num1 > Num2){

                System.out.println("these values Equal Or Num1 Great than Num2 ");
             }
        else if (Num1 != Num2 && Num1 < Num2) {

                System.out.println("these values Not Equal And Num1 Great than Num2 ");
        }
        else  {

               System.out.println("Please enter the right values !!");
             }*/

        float mathPass , physPass , svtPass , YoussefMath , YousefPhys , YoussefSvt ;
         mathPass = 10.00f ;physPass = 10.00f ;svtPass = 10.00f ;  // points passed validation .
         YoussefMath = 10.23f;YousefPhys = 14.12f;YoussefSvt = 18.75f; // points of student .

        if (YoussefMath >= mathPass && YousefPhys >= physPass && YoussefSvt >= svtPass ){
            System.out.println(" Congratulation you are passed the exam with successfully !!");
            System.out.printf("your point of Math is : %.2f\n", YoussefMath );
            System.out.printf("your point of Phys is : %.2f\n", YousefPhys );
            System.out.printf("your point of Svt is : %.2f\n", YoussefSvt );
        }
        else {
            System.out.println(" I am sorry to tell you that but you failed ,\n you have to work hard next time !!\n" );
            System.out.println("\n your points are less than 10.00 !!" );

        }
            }
    }


