package company100problems;
import java.util.Scanner;

public class Day4 {
	void reverse(int num){
		int reverse=0;
		while (num != 0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
		System.out.println("reverse:"+reverse);
	}
	public static void main(String [] args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num =sc.nextInt();
		Day4 rs = new Day4();
		rs.reverse(num);

}

}
