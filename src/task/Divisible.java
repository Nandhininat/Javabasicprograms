package task;

import java.util.Scanner;

public class Divisible {
	void nums(int n) {
		if(n%5==0 && n%11==0) {
			System.out.println("The number is divided by both 5 and 11:");
		}
		else if(n%5==0) {
			System.out.println("the number is divided by only 5 :");
		}
		else if(n%11==0) {
			System.out.println("the number is divided by only 11 :");
		}
		
		else {
			System.out.println("the number is not divisible by 5 and 11:");
		}
	}
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n =sc.nextInt();
		Divisible dd = new Divisible();
		dd.nums(n);
		
	}

}
