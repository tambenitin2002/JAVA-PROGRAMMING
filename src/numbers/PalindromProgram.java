package numbers;

import java.util.Scanner;

public class PalindromProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean val=true;
		while(val) {
			System.out.println("Choose the : \n 1.Check  Number \n 2.Log Out");
			int choose=sc.nextInt();
			if(choose==1) {
				System.out.println("Enter the Number: ");
				int num=sc.nextInt();
				int finals=num;
				int rev=0;
				int rem=0;
				while(num!=0) {
					 rem=num%10;
					rev=rev*10+rem;
					num=num/10;
			}
				if(finals==rev) {
					System.out.println("The Given Number Palindrom");
				}else {
					System.out.println("The given number is not palindrom");
				}
				System.out.println("final: "+finals);
				System.out.println("rev: "+rev);
				System.out.println("------------------------------------------------------");
			}else if(choose==2){
				System.out.println("Application Log Out");
				val=false;
			}else {
				System.out.println("Invalid selection. Choose 1 or 2");
				
			}
		}
			
		
		
		
		
		

	}

}
