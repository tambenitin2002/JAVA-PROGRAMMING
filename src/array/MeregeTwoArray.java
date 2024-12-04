package array;

public class MeregeTwoArray {

	public static void main(String[] args) {
		int [] array1= {1,2,3,4};
		int [] array2= {5,6,7,8,9};
		
		int [] finalArray=new int[array1.length+array2.length];
		
		for(int i=0; i< array1.length;i++) {
			finalArray[i]=array1[i];
		}
		
		for(int i=0; i<array2.length;i++) {
			finalArray[array1.length+i]=array2[i];
		}
		
		System.out.println("Mearged Array: ");
		for(int i=0;i<finalArray.length;i++) {
			System.out.print(finalArray[i]+" ");
		}

	}

}
