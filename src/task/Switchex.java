package task;
import java.util.Scanner;
public class Switchex {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("yours menu : 1.idly 2.Dosa 3.pongal 4.poori 5.Exit");
		System.out.println("Enter a choice:");
		int ch = sc.nextInt();
		int b;
		
		switch(ch) {
		case 1:
			System.out.println("one idly rs.40");
			System.out.println("how many idly do you want :");
			b=sc.nextInt();
			System.out.println("Bill:" + b* 40);
			break;
		case 2:
			System.out.println("one Dosa rs.50");
			System.out.println("how many Dosa do you want :");
			b=sc.nextInt();
			System.out.println("Bill:" + b* 50);
			break;
		case 3:
			System.out.println("one Pongal rs.40");
			System.out.println("how many pongal do you want :");
			b=sc.nextInt();
			System.out.println("Bill :" + b* 40);
			break;
		case 4:
			System.out.println("one poori rs.45");
			System.out.println("how many poori do you want :");
			b=sc.nextInt();
			System.out.println("Bill :" + b* 45);
			break;
		case 5:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
	}

}
