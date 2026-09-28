package task;
import java.util.Scanner;
public class Switchcaseex {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1.monday,2.tuesday,3.wednesday,4.thursday,5.friday,6.saturday.7.sunday");
	System.out.println("Enter a number:");
	int a =sc.nextInt();
	switch(a) {
	case 1:
		System.out.println("monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
		default:
			System.out.println("invalid day");
			break;
	}
	
	
	}
	

}
