package company100problems;
import java.util.*;
public class Day8 {
	void prime(int num) {
		int count=1;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
			 count++;
			 if(count==2) {
				System.out.println("prime number");
				break;
			}
			}
			else {
				System.out.println(" not prime number");
				break;
			}
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		Day8 d = new Day8();
		d.prime(num);
	}
}
