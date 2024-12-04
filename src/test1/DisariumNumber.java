
//To Check the Number is disarium number or not
package test1;

import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num=sc.nextInt();
	int numCopy=num;
	int count=0;
	int rem=0;
	int sum=0;
	int temp=num;
	
	while(temp!=0) {
	//	temp=temp/10;
		rem=temp%10;
		count++;
		temp=temp/10;
		
	}
	temp=num;
	while(temp>0) {
		rem=temp%10;	
	int power=1;
	for(int i=1;i<=count;i++) {
		power=power*rem;
	}
	sum=sum+power;
	count--;
	temp=temp/10;
	
	
	}
	
	if(num==sum){
		System.out.println("The number is disarium");
	}else {
		System.out.println("The number is not disarium");
	}
	}

}
