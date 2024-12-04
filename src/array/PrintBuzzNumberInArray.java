package array;

public class PrintBuzzNumberInArray {

	public static void main(String[] args) {
		//Print the buzz numbers of array
    	int a[]= {47,24,28,49,7};
    	
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%7==0 || a[i]%10==7) {
    			System.out.print(a[i]+" ");
    		}
    	}

	}

}
