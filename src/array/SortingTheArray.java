package array;

import java.util.Arrays;

public class SortingTheArray {

	public static void main(String[] args) {
		 int numberArray[]= {5,8,6,4,3,7,45,12,89,13,56,39,75};
		 String stringArray[]= {"Java","C","Python","HTML","CSS","DSA"};
		 
		 
		 
		 System.out.println("Original Number Array: "+Arrays.toString(numberArray));
		 Arrays.sort(numberArray);
		 System.out.println("Sorted Number Array: "+Arrays.toString(numberArray));
		 
		 
		 System.out.println("Original Number Array: "+Arrays.toString(stringArray));
		 Arrays.sort(stringArray);
		 System.out.println("Sorted Number Array: "+Arrays.toString(stringArray));

	}

}
