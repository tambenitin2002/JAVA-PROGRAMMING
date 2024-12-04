package array;

public class AdditionOfArrayElementsAllDigitAddition {

	public static void main(String[] args) {
		   int a[]= {1132,3841,52,4210,1211};
		  
		   int num=0;
		   for(int i=0;i<a.length;i++) {
			   num=a[i];
			   int sum=0;
		   while(num>0) {
			   sum=sum+num%10;
			   num=num/10;
			   
		   }
		   System.out.println(a[i]+" : "+sum);
		   }
	}

}
