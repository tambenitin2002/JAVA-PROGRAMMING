package array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
	

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
		
		//-------------------------------------------------
		
		for(int i=0;i<size;i++) {
			System.out.println(a[i] );
			
			
		}
		
		Arrays.sort(a);
		
		System.out.println("--------------------- Sorted Array ----------------------------");
		
		for(int i=0;i<size;i++) {
			System.out.println(a[i] );
			
			
		}
		
		}
		

	}


