package numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int numCopy=num;
		int temp=num;
		int rem=0;
		int rem1=0;
		int count=0;
		
		int sum=0;
		while(num!=0) {
			rem=num%10;
			count++;
			num=num/10;
			
		}
		while(temp!=0) {
			rem1=temp%10;
			int power=rem1;
			for(int i=1;i<count;i++) {
				power=power*rem1;
			}
			sum=sum+power;
			temp=temp/10;
			
		}
		System.out.println("Sum: "+sum);
//		System.out.println("Power: "+power);
		System.out.println("Num: "+numCopy);
		System.out.println("Count: "+count);
		if(sum==numCopy) {
			System.out.println("It is a Armstrong Number");
		}else {
			System.out.println("It is a Not Armstrong Number");
		}
			
	}

}
