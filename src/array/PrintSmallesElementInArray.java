package array;

import java.util.Scanner;

public class PrintSmallesElementInArray {
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
      		int smallestElement=0;
      		for(int i=0;i<size;i++) {
      			if(smallestElement>a[i]) {
      				smallestElement=a[i];
      			}
      		}
      		System.out.println("Largest value: "+smallestElement);

        	  
		}
}
