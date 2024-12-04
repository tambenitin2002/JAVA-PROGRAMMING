package array;

import java.util.Scanner;

public class InsertElementIntoArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};
		int n=a.length;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the element to insert: ");
		int element=sc.nextInt();
		
   	System.out.println("Enter the position to insert element: "+n );
		int position =sc.nextInt();
		
		
		if(position < 0) {
			System.out.println("Invalid position! please enter a position between 0 and "+n);
		    return;
		    
		}
		int [] newArray=new int [n+1];
		
		for(int i=0;i<position; i++) {
			newArray[i]=a[i];
		}
		
		newArray[position]=element;
		
		
		for(int i=position;i<n;i++) {
			newArray[i+1]=a[i];
		}
		
		System.out.println("Array after insetion: ");
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]+" ");
		}
		
	
	  
	  
		
	}

}
