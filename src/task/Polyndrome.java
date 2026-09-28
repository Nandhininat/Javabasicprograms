package task;

import java.util.Scanner;

public class Polyndrome {
	void drome(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=s.length()-1;j>=i;j--) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println("polyndrome");
				}
				
				else {
					System.out.println("not a polindrome");
}
				break;
				
				}
			}

		}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a variable :");
		String n =sc.nextLine();
		Polyndrome pe =new Polyndrome();
		pe.drome(n);
		
	}

}
