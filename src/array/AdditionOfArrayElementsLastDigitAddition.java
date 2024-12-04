package array;

public class AdditionOfArrayElementsLastDigitAddition {

	public static void main(String[] args) {
         int a[]= {2175,3123,7130,512,1211};
         int sum=0;
         for(int i=0;i<a.length;i++) {
        	 sum=sum+a[i]%10;
         }
         System.out.println("The sum of the last digit is: "+sum);
	}

}
