package TypeConversion;

public class TypConversion {
public static void main(String[] args) {
//Implicit conversions
    int a =257;
    long l=a;  //implicit conversion as long holds larger value than int 


    byte j = 127;
    int i=j;   //implicit conversion as int hold longer value than byte  
     
    float f=a; //int converted into float   
    double d=a; 

    int t=12334;
    int g=56789; //as we know there product will be a large value which int can't hold
    
    long c=t*g;  // converts int into long


    //explicit conversion 
    //when we convert int to byte it performs some modulus operations behind 
    //such as it divides the int num with the range of byte     
    byte b=(byte)a;   //will cause integer overflow as byte holds smaller values

    float n=5.6f;
    int x=(int)n;

    System.out.println(l);
    System.out.println(b);
    System.out.println(i);
    System.out.println(f);
    System.out.println(d);
    System.out.println(c);
    System.out.println(x);
}
}
