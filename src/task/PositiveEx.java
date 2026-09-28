package task;

import java.util.Scanner;

public class PositiveEx {
	void example(int n) {
		if(n>=0) {
			System.out.println("positive Number:"+n);
		}
		else {
			System.out.println("Negative Number:"+n);
		}
	}
	
	public static void main(String [] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n =sc.nextInt();
		PositiveEx ps =new PositiveEx();
		ps.example(n);
		
			 
		 }
	}


	

