public class StringBuilder_ObjectDataType {
    public static void main(String[] args){
        /* if you see bellow I use old way for create many sentences,
        that's I will need another way that makes me to use the minimum of memory RAM */
        String STR1 = "Hello";
        String STR2 = "YOUSSEF";
        String STR3 = STR1 + ", " + STR2 + " !!" ;
        System.out.println(STR3);
        // look with how I write it by Object Data Type Or OOP (Object-Oriented Programming)
        StringBuilder UserInfo = new StringBuilder()
                .append("User ID : 001\n")
                .append("First name : Youssef\n")
                .append("Last name : Ajdij\n")
                .append("Birthday : 14/11/1992\n")
                .append("Profession : Technician\n")
                .append("Salary : 6000.00 \u0024 \n")
                .append("Address : Z, I, RABAT \n")
                .append("Code Postal : 10000 \n");
        System.out.println(UserInfo);
        //System.out.println(UserInfo.length());// this for know how many characters in the stringBuilder .
        //System.out.println(UserInfo.delete(10,163)); // this for deleting anything or something from the contractor .
    }
}
