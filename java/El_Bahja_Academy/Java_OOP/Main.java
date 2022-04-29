package El_Bahja_Academy.Java_OOP;

public class Main {
    public static void main(String[] args){
        // public class it means can anyone modify in the class .
        // protected class means you can modify in class tell you are stilling in same folder .
        // private class that's mean the only one can modify in the class name not else .

        Phone phone_01 = new Phone(); // this operation called instantiation
        // we create here above a new phone
                phone_01.OS = "Android";
                phone_01.model = "Samsung Galaxy S20";
                phone_01.RAM = 16 ;
                phone_01.camera = 24 ;
                phone_01.storage = 256 ;
                phone_01.price = 15000 ;
/*
        // now I will call the function from the class phone

            phone_01.call();
            new Phone().ring(); // anonymous object for one use and it will be disappeared
*/

        phone_01.setRAM(2);
        System.out.println(phone_01.getRAM());

        // I specify what information you will entry in this constructor

        Phone_1 NewPhone = new Phone_1("Android" , "Samsung A8" , 4 , 12 , 5500 , 4200);
        System.out.println(NewPhone.Battery);
       // ==============================================

        Person person01 = new Person();
            person01.name = "Youssef";
            person01.age = 29 ;
            person01.weight = 70 ;
            person01.job = "Technician" ;
            person01.size = 1.88 ;

        System.out.println(person01.weight);

        Student st1 = new Student();
        st1.age = 20 ;
        st1.nameSchool = "Moulay Ismail";

        System.out.println(st1.nameSchool);

        Public_Student ps1 = new Public_Student();
        ps1.name = "AJDIJ";

    }
}
