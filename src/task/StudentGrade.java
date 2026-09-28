package task;
import java.util.Scanner;

public class StudentGrade {
	 void calculateGrade(int marks) {
		if(marks>=90 && marks<=100) {
			System.out.println("A");
		}
		else if(marks>=75 && marks<=89) {
			System.out.println("B");
		}
		else if(marks>=60 && marks<=74) {
			System.out.println("C");
		}
		else if(marks>=40 && marks<=59) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Marks :");
		int marks =sc.nextInt();
		StudentGrade sg =new StudentGrade();
		sg.calculateGrade(marks);
		
	
		
	}

}
