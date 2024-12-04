package array;

public class PrintDuplicateElementsFromArray {

	public static void main(String[] args) {
       int [] array= {1,2,3,4,2,5,6,3,7,8,4};
       
       System.out.println("Duplicate elements: ");
       
       for(int i = 0;i<array.length;i++) {
    	   boolean isDublicate=false;
    	   
    	   for(int j=0;j<i;j++) {
    		   if(array[i]==array[j]) {
    			   isDublicate=true;
    			   break;
    		   }
    	   }
    	   if(isDublicate) {
    		   System.out.println(array[i]+" ");
    	   }
       }
	}

}
