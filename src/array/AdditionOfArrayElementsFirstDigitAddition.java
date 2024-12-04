package array;

public class AdditionOfArrayElementsFirstDigitAddition {
	public static void main(String[] args) {
		   int a[]= {1132,3841,52,4210,1211};
		   int sum=0;
		   
		   for(int i=0;i<a.length;i++) {
			   
			   
		   while(a[i]>9) {
			   
			   a[i]=a[i]/10;
			   
		   }
		   sum=sum+a[i];
		   
		   }
		   System.out.println(" addition of first digit is: "+sum);
	}

}
