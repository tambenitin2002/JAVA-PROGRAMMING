package numbers;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int numCopy = num;
        int rem = 0;

        int strong = 0;

        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            int fact = 1;  
            for (int i = rem; i >= 1; i--) {
                fact = fact * i;
            }
            strong = strong + fact;
        }

        System.out.println("Strong: " + strong);
        System.out.println("num: " + numCopy);
        if (strong == numCopy) {
            System.out.println("The number " + numCopy + " is Strong!!");
        } else {
            System.out.println("The number " + numCopy + " is not strong!!");
        }

        
    }
}
