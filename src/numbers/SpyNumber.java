package numbers;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean val=true;
		while (val) {
			System.out.println("Choose The Following:"
					+ " \n 1.check the number spy or not!!! "
					+ "\n 2. Log Out the application!!!");
			int choose=sc.nextInt();
			
		if(choose==1) {
			System.out.println("Enter The Number: ");
		    int num=sc.nextInt();
		    int sum=0;
		    int mul=1;
		    int rem=0;
		    while (num!=0) {
			rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;	
		    }
		    if(sum==mul) {
			System.out.println("The number is spy number!!!");
		    }else {
			System.out.println("The number is not spy number!!!");
		     }
		    System.out.println("----------------------------------------------------------");
		
		
		}else if(choose==2) {
			System.out.println(" Application is Closed!!");
			val=false;
		}else {
				System.out.println("choose valid option. 1 or 2 only");
		}
		
		}
	}

}
