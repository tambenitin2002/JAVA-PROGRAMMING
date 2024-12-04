package array;


import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int a[]= {12,-1,7,9,5};
		int temp=0;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}

	}

}
