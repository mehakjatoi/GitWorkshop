import java.lang.Exception;
class example1{
public static void main(String[] args){
int num1,num2;
try {
    num1=0;
 
    int Array[]=new int[10];
    Array[11]=num1;
    num2=23/num1;
    System.out.println(num2);
    System.out.println(Array[10]);
    System.out.println("hey i am at the end of the try block");
    
} catch (ArithmeticException e) {
    System.out.println("you should not divide the num by zero");
}
catch(Exception e){
System.out.println(e.getMessage());

}
System.out.println("I am out of try catch block");
}

}