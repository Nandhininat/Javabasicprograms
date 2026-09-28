package company100problems;
import java.util.*;
public class Day5 {
	void power(int n,int p) {
		int result=1;
		for (int i=1;i<=p;i++) {
            result=result*n;
        }
		System.out.println(result);

	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a base value:");
		int n=sc.nextInt();
		System.out.println("Enter a power value:");
		int p=sc.nextInt();
		Day5 d5 = new Day5();
		d5.power(n, p);
		
	}

}
