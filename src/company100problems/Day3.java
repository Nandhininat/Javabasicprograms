package company100problems;

import java.util.Scanner;

public class Day3 {
	void count() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
	  int count =0;
	  for(int i=0;i<a;i++) {
		  count++;
		  
	  }
	  System.out.println(count);
	}
	

	public static void main(String[] args) {
		Day3 d= new Day3();
		d.count();
	}
}

