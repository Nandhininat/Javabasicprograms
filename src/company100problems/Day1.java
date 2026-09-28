package company100problems;
import java.util.Scanner;

public class Day1 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a numbers: " );
	int n = sc.nextInt();
		        while (n > 0) {
		            int digit = n % 10;
		            System.out.println(digit);
		            n = n / 10;
		        }
		    }
		
 }

