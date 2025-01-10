
package patterns;

import java.util.Scanner;

public class StringNumberPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) { 
            for (int j = 1; j <= numRows * 2; j++) {
                if (j > i && i+j<numRows*2) { 
                    System.out.print("* "); 
                } else if (j == i || i+j == numRows * 2 ) { 
                    System.out.print(i + " "); 
                } else { 
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
}