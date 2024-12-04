package numbers;

import java.util.Scanner;

public class XylemAndPhloyemNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Number");
		int num =sc.nextInt();
		int temp=num;
		int numCopy=num;
		int ls=num%10;
		int sum=0;
		int var=0;
		
		while(num>9) {
			
			num=num/10;
		}
		while(temp!=0) {
			var=temp%10;
			sum=sum+var;
			temp=temp/10;
		}
		int val1=num+ls;
		int mdn=sum-val1;
		
		if(val1==mdn) {
			System.out.println("This is Xylem Number");
		}else {
			System.out.println("This is a phloem Number");
		}
		
		System.out.println("Fn: "+num);
		System.out.println("Fn: "+ls);
		System.out.println("val1: "+val1);
		System.out.println("Sum: "+sum);
		System.out.println("mdn: "+mdn);
		
		}
	

}
