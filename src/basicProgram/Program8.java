package basicProgram;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the Number: ");
	   int num = sc.nextInt();
	   int afterRemoveLastDigit=num/10;
	   System.out.println(afterRemoveLastDigit);
	}

}
