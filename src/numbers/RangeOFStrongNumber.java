package numbers;

import java.util.Scanner;

public class RangeOFStrongNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the 1st Number: ");
	        int num1 = sc.nextInt();
	        System.out.println("Enter the 2nd Number: ");
	        int num2 =sc.nextInt();
	        
	        for(int j=num1;j<=num2;j++) {
	        	int num = j;
	        	int numCopy=num;
	        	 int rem = 0;
	        	int strong = 0;
	          while (num != 0) {
	            rem = num % 10;
	            
	            int fact = 1;  
	            for (int i = rem; i >= 1; i--) {
	                fact = fact * i;
	            }
	            strong = strong + fact;
	            num = num / 10;
	        }
	        if (strong == numCopy) {
	            System.out.println(j);
	        } 
	        }


	}

}
