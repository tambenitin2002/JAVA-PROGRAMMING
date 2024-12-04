package numbers;

import java.util.Scanner;

public class AdditionOfAllTheDigite {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter The Number: ");
	 int num=sc.nextInt()	;
	 int sum=0;
	 while(num!=0) {
		 int rem=num%10;
		 sum=sum+rem;
		 num=num/10;
		 
	 }
	 System.out.println("Addition of all the  digits is: "+sum);
}
}
