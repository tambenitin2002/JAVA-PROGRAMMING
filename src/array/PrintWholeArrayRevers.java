package array;

public class PrintWholeArrayRevers {

	public static void main(String[] args) {
		//Print the revers of whole array
		
		int a[]= {10,63,23};
		int rev[]=new int[a.length];
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("Reverse Array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
			
		}
	}
}