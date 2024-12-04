 package numbers;

import java.util.Scanner;

public class AbudentNO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int num=sc.nextInt();
		int fact=1;
		int sum=0;
		
		for(int i=num;i>=1;i--) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum>num) {
			System.out.println("The Number is Abudent");
		}else
		{
			System.out.println(" The Number is not Abudent");
		}

	}

}
