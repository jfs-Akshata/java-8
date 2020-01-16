package practice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		int count =0;
		int no=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the N number");
		int n= sc.nextInt();
		for(int i=2; i<=n; i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count= count +1;
				}
			}
			
		if(count==0) {
			no= no+1;
			System.out.println("prime no is "+i);
			
		}
		
		}
		System.out.println("No of prime no is "+no);
	}

}
