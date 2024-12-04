package text2;

import java.util.Scanner;

public class ElementPresentOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int a[]= {23,55,76,88,34,55,90};
		int arrno=0;
		for(int i=0;i<a.length;i++) {
			arrno=a[i];
			if(num==arrno) {
				System.out.println("Element is Present");
				
			}else if(num!=arrno) {
				System.out.println("Not Present");
			}
		}
		

	}

}
