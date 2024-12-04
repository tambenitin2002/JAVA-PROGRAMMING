package array;

import java.util.Scanner;

public class RotateArrayToRight {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of rotations ");
	  int n=sc.nextInt();
	  int a[]= {1,2,3};
	  int temp=0;
	  while(n>=1) {
		  
	  temp=a[0];
	  for(int i=0;i<a.length-1;i++) {
		  a[i]=a[i+1];
	  }
	  a[a.length-1]=temp;
	  for(int i=0;i<a.length;i++) {
		  System.out.print(a[i]+" ");
	  }
	  }
   }
}
