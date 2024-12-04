package numbers;

import java.util.Scanner;

public class HappyNumber {
 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the Number: ");
		int num=sc.nextInt();
		int rem=0;
		
		
		while(num>9) {
			
			int sum=0;
			while(num!=0) {
			rem=num%10;
			int sqr=rem*rem;
			sum=sum+sqr;
			num=num/10;
			
			}
			num=sum;
				
			}
		
		if(num==1) {
			System.out.println("The Number is happy number ");
		}else {
			System.out.println("The Number is sad Number");
		}
		}
		
	
	}

