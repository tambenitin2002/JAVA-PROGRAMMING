package basicProgram;

import java.util.Scanner;

public class Program9 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	while(num>9) {
		num=num/10;
	}
	System.out.println(num);
			
  }
}
