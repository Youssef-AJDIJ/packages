package El_Bahja_Academy.Java_OOP;
public class Phone {
        // for creation a class we need two attributes (Fields and methods "Functions")
        // here bellow Fields (المميزات) :
        public String OS ;
        public String model ;
        public double price ;
        public int RAM ;
        public int camera ;
        public int storage ;
        // now I will use Getters (Get) and Setters (Set)

        public int getRAM(){
           return RAM;
        }
        public void setRAM(int RAM){
                //this.RAM = RAM ; // (this.) for tell the program Ram is yours (class)
                if (RAM < this.RAM){
                        System.out.println("Sorry you cant changed ram by another less one");
                }else {
                        this.RAM = RAM;
                }
        }


        // here bellow Methods or Functions ( we write for all action can it does Call , Ring , Take Picture , ... )

/*        public void call (){
                System.out.println("Please wait a moment we are \ncalling...");
        }
        public void ring (){
                System.out.println("Ringing...");

        }*/




}
