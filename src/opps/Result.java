package opps;
import java.util.Scanner;

public class Result extends Student {
	void result() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mark1:");
		int mark1 = sc.nextInt();
		System.out.println("Enter a mark2:");
		int mark2 = sc.nextInt();
		System.out.println("Enter a mark3:");
		int mark3 = sc.nextInt();
		int total;
		total = (mark1+mark2+mark3);
		System.out.println(total);
	}
	public static void main(String []args) {
		
		Result r=new Result();
		
		r.student();
		r.result();
	}

}
