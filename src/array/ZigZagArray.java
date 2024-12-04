package array;

import java.util.Arrays;

public class ZigZagArray {

	public static void main(String[] args) {
      int a[]= {1,3,5,7,9};
      int b[]= {2,4,6,8,10};
      
      System.out.println("1st Array ");
      System.out.println(Arrays.toString(a));
      System.out.println("2st Array ");
      System.out.println(Arrays.toString(b));
      int c[]=new int [a.length+b.length];
      
      int p=0;
      int q=0;
      for(int i=0;i<c.length;i++) {
    	  if(i%2==0) {
    		  c[i]=a[p];
    		  p++;
    	  }
    	  else {
    		  c[i]=b[q];
    		  q++;
    	  }
      }
      System.out.println(Arrays.toString(c));

	}

}
// WAJP To shift all the -1 on left and other value to right
// WAJP To Print the array in first and last format
// WAJP To insert an element on first position
// WAJP Insert a element on given Position
// WAJP To Delete the element from array
// Rotate the Array to the right n number of time
