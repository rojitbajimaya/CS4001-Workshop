
public class DefaultValues{
    
    static byte byteDefault;
    static short shortDefault;
    static long longDefault;
    static int intDefault;
    static float floatDefault;
    static double doubleDefault;
    static char characterDefault;
    static boolean flagDefault;
    
    public static void main(String[] args){
       
    DefaultValues instance = new DefaultValues();
    
    System.out.println("This is a default byte number: " + DefaultValues.byteDefault);
    System.out.println("This is a default short number: " + DefaultValues.shortDefault);
    System.out.println("This is a default long number: " + DefaultValues.longDefault);
    System.out.println("This is a default integer number: " + DefaultValues.intDefault);
    System.out.println("This is a default float number: " + DefaultValues.floatDefault);
    System.out.println("This is a default double number: " + DefaultValues.doubleDefault);
    System.out.println("This is a default char: " + DefaultValues.characterDefault);
    System.out.println("This is a default boolean: " + DefaultValues.flagDefault);
    
    //Need the variables to be static to avoid the occurance of error, can not use non static variable from static context.
    
    /*
    
    byte byteDefault;
    short shortDefault;
    long longDefault;
    int intDefault;
    float floatDefault;
    double doubleDefault;
    char characterDefault;
    boolean flagDefault;
    
    */
   
    }
}