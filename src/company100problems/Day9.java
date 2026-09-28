package company100problems;
import java.util.*;
public class Day9 {
   void sumsingle(int n) {
	   int fact;
	   while (n > 0) {
           int digit = n % 10;
           System.out.println(digit);
           n = n / 10;
           fact=n*digit;
           System.out.println(fact);
       }
	  
   }
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
	   Day9 d = new Day9();
	   d.sumsingle(n);
	   
}
}
