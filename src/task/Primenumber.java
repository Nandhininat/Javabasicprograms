package task;
import java.util.Scanner;
public class Primenumber {
	void prime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("prime number");
			}
			else {
				System.out.println(" not prime number");
			}
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		Primenumber ps = new Primenumber();
		ps.prime(num);
		
	}

}
