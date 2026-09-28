package company100problems;
import java.util.*;
public class Day6 {
void factorial(int n) {
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	Day6 d=new Day6();
	d.factorial(n);
}
}
