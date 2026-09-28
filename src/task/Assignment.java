package task;
import java.util.Scanner;
public class Assignment {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		if (age >= 18) {

		    if (age == 18) {
		        System.out.println("Welcome to first time vote");
		    }
		    else if (age > 80) {
		        System.out.println("Too old to vote");
		    }
		    else if (age >= 50) {
		        System.out.println("Senior cityzen");
		    }
		    else {
		        System.out.println("Eligible to vote");
		    }

		}
		else if (age == 17) {
		    System.out.println("One more year to vote");
		}
		else {
		    System.out.println("Too younger");
		}
	}

}
