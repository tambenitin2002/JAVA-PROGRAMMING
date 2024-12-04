package array;

import java.util.Scanner;

public class PrintLargetElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+ i +" index value" );
			int val=sc.nextInt();
			a[i]=val;
		}
		int largestElement=0;
		for(int i=0;i<size;i++) {
			if(largestElement<a[i]) {
				largestElement=a[i];
			}
		}
		System.out.println("Largest value: "+largestElement);

	}

}
