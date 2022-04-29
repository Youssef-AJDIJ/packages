package El_Bahja_Academy.Functions;

public class Function_OverLoading {
    public static void main(String[] args){
        System.out.println(SurFace("Square" , 20 , 20 , "Metre"));

    }
    // over loading means can we create many function with a same name,
    // but not the same argument as this : (int) or (int,int) (float , String) ...
    public static float SurFace(String Materiel ,float Length , float Width , String Unity){
        float surface = Length * Width ;
        //System.out.println("The surface of " + Materiel + " = " + surface + " " + Unity );
        return surface;
    }
    public static float SurFace(int Length , int Width){
        float surface = Length * Width ;
        //System.out.println("The surface of " + Materiel + " = " + surface + " " + Unity );
        return surface;
    }
    public static float SurFace(float Length , float Width){
        float surface = Length * Width ;
        //System.out.println("The surface of " + Materiel + " = " + surface + " " + Unity );
        return surface;
    }
}
