package array;

public class CheckArrayIsAssendingDecendingorUnsorted {

	public static void main(String[] args) {
		int a[]= {12,13,6};
		int count1=0;
		int count2=0;
		
		for(int i=1;i<a.length;i++) {
			if(a[i-1]<a[i])
			{
				count1++;
			}
			else {
				break;
			}
			
		}

		
		for(int i=1;i<a.length;i++) {
			if(a[i-1]>a[i])
			{
				count2++;
			}
			else {
				break;
			}
			
		}
	}

}
//print the sub array
//rotate the array

