package array;

public class PallindromNumberInArray {

	public static void main(String[] args) {
		//Print the palindrom number in from the array
    	int a[]= {3452,1221,6584,4562,2598};
    	for(int i=0;i<a.length;i++) {
    		int num=a[i];
    		int rem=0, rev=0;
    		while(num>0){
    			rem=num%10;
    			rev=rev*10+rem;
    			num=num/10;
    		}
    		if(rev==a[i]){
    			System.out.println(a[i]);
    		}
    	}

	}

}
