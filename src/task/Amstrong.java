package task;

import java.util.Scanner;

public class Amstrong {
	void strong(int num) {
		int temp=num;
		int sum =0;
		while(temp >0) {
			int digit=temp%10;
			temp=temp/10;
		    sum=sum+digit*digit*digit;
		}
		if(num==sum) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not a amstrong");
		}
	}
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num =sc.nextInt();
		Amstrong as=new Amstrong();
		as.strong(num);
		

}
}
