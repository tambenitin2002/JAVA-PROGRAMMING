package array;

public class PrintStrongNumberInArray {

	public static void main(String[] args) {
		//Print the Strong number of array
    	int a[]= {145,456,145,86};
    	
    	
    	for(int i=0;i<a.length;i++) {
    		int numCopy = a[i];
            int rem = 0;

            int strong = 0;

            while (a[i] != 0) {
                rem = a[i] % 10;
                a[i] = a[i] / 10;
                int fact = 1;  
                for (int j = rem; j >= 1; j--) {
                    fact = fact * j;
                }
                strong = strong + fact;
            }

            
            if (strong == numCopy) {
                System.out.println(numCopy);
            }
    	}

	}

}
