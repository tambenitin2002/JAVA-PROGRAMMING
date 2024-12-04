package numbers;

import java.util.Scanner;

public class NievenNumber {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enetr The Number: ");
	int num=sc.nextInt();
	int numCopy=num;
	int rem=0;
	int sum=0;
    while(num!=0) {
    	rem=num%10;
    	sum=sum+rem;
    	num=num/10;
    }
    if(numCopy%sum==0) {
    	System.out.println("The Number is Nieven");
    }else {
    	System.out.println("The Number is Not Nieven");
    }
 }
}
