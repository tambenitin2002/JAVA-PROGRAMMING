package numbers;

import java.util.Scanner;

public class TechNo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the Number: ");
		int num=sc.nextInt();
		int num1=num;
		int count=0;
		while(num1>0) {
			num1=num1/10;
			count++;
		}
		System.out.println(count);
		if(count%2==0) {
			num1=num;
		int split = count/2;
		int rem=0;
		int num2=0;
		System.out.println("num1: "+num1);
		System.out.println("split:"+split);
		while(split>0) {
				rem=num1%10;
				num2=num2*10+rem;
				num1=num1/10;
				split--;
			}
		System.out.println("Num2:"+num2);
		int rev=0;
		
		while(num2>0) {
			rem=num2%10;
			rev=rev*10+rem;
			num2=num2/10;
		}
		System.out.println("rev "+rev);
		int sumofnum=num1+rev;
		int numofcheck=sumofnum*sumofnum;
		System.out.println("numofcheck "+numofcheck);
		if(num==numofcheck) {
			System.out.println("The Number is  tech no");
		}
		else {
			System.out.println("The Number is not tech no");
		}
		
		}else {
			System.out.println("The Number is not tech no");
		}
		}
	}


