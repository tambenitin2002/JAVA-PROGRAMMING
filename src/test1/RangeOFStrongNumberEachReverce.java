package test1;

import java.util.Scanner;

// WAJP TO Print the in range of strong number and the strong numbers revers 
public class RangeOFStrongNumberEachReverce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter the Ending Number: ");
		int end = sc.nextInt();
	
		for (int i = start; i <= end; i++) {
			int num=i;
			int sum=0;
			while(num>0) {
				int rem=num%10;
				 int fact=1;
				for(int j=1;j<=rem;j++) {
					
						fact=fact*j;
					
				}
				num=num/10;
				sum=sum+fact;
				
			}
			
			
		
			if(sum==i) {
				int strong=i;
				int rev=0;
				while(strong>0) {
				int	rem1=strong%10;
					rev=rev*10+rem1;
					strong=strong/10;
				}
                System.out.println("Strong Number: " + i + ", Reverse: " + rev);

			}
			
			
		}
	}

}
