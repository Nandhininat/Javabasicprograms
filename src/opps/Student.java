package opps;

import java.util.Scanner;

public class Student extends Inheritancetask{
	void student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rollno:");
		int rollno = sc.nextInt();
		System.out.println("Enter a course:");
		String course = sc.nextLine();
		sc.nextLine();
	}

}
