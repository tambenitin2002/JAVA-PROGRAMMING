package test1;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int sqr=num*num;
		boolean flag =true;
		
		while(num>0) {
			
		if(num%10!=sqr%10) {
			flag=false;
		}else
		num=num/10;
		sqr=sqr/10;
		
        

	}
		if(flag){
        	System.out.println("The Number is Automorphic ");
        }else {
        	System.out.println("The Number is not Automorphic ");
        }
	}

}
