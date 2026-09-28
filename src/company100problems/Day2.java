package company100problems;
import java.util.Scanner;
public class Day2 { 
	void sum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
	  int sum =0;
	  for(int i=0;i<=a;i++) {
		  sum = sum +i;
		  
	  }
	  System.out.println(sum);
	}
	

	public static void main(String[] args) {
		Day2 d= new Day2();
		d.sum();
	}
}
