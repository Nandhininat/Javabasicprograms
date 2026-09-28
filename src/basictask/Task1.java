package basictask;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[]a= {'A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int count=0;
		int count1=25;
		for(int i=0;i<=count1+1;i++) {
			for(int j=count1+1;j>=0;j--) {
				if(i!=j) {
					System.out.print(a[count]);
					System.out.print(a[count1]);
					count++;
					count1--;
					
				}
				
			}
		}
		
		
		
		
	}

	

}
