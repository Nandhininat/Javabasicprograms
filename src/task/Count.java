package task;

import java.util.Scanner;

public class Count {
	void digits(int n) {
		int count =1;
		for(int i=0;i<=n;i++) {
			n = n/10;
			count++;
		}
		System.out.println("count:"+count);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a variable :");
		int n =sc.nextInt();
		Count ct=new Count();
		ct.digits(n);
		
	}

}
