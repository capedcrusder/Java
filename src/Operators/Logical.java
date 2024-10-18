package Operators;

public class Logical {
public static void main(String[] args) {
    //compares two boolean value

    int a=54;
    int b=76;

    boolean result= (a>b && a<b);     //And Operation i.e  if any value becomes false the result will be false 
    System.out.println(result);

    boolean result1= a<b || a>b;     //OR Operator if any value is True the result will be true;
    System.out.println(result1);

    boolean  result3= a>b ||b<a;       //the result is false as both are false
    boolean result2= a<b && b>a;       //the result is true as both are true;


    System.out.println(!result3);      //NOT Operator   :- reverses the result from flase to true
    System.out.println(!result2);      //NOT Operator   :- reverses the result from true to false

      boolean result4 = a!=b;        //NOT Operator :- Expected result is false but it will return true
      System.out.println(result4);


}
}
