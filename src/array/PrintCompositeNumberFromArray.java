package array;

public class PrintCompositeNumberFromArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int count = 0;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    count++;
                    break; // If a divisor is found, no need to continue checking
                }    
            }
            if (count > 0) {
                System.out.println(num);
            }
        }
    }
}
