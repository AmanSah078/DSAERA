package Dsa_Once_Again.Target_50_Questions;

public class Fibonacci_Series {
 public static void main(String[] args) {
     int a=0;
     int b=1;
     for(int i=0; i<5; i++)
     {
         System.out.print(a+" ");
         int c=a+b;
         a=b;
         b=c;
     }

 }
}
