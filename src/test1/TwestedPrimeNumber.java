//To check the number is twested prime or not

package test1;

import java.util.Scanner;

public class TwestedPrimeNumber {
public static void main(String[] args) {
	/*
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number: ");
     int num = sc.nextInt();
     int numCopy = num;
     int count = 0;
     int count1 = 0;
     int rem = 0;
     int rev = 0;

     // Check if the number is prime
     for (int i = 2; i < num; i++) {
         if (num % i == 0) {
             count++;
         }
     }

     // Reverse the number
     if(count==0) {
     while (numCopy != 0) {
         rem = numCopy % 10;
         rev = rev * 10 + rem;
         numCopy = numCopy / 10;
     }
     System.out.println("Reversed number: " + rev);

     // Check if the reversed number is prime
     for (int j = 2; j < rev; j++) {
         if (rev % j == 0) {
             count1++;
         }
         
     }
     }
     // Determine if the number is a twisted prime
     if (count == 0 && count1 == 0) {
         System.out.println("Twisted Number");
     } else {
         System.out.println("Not a Twisted Number");
     }
     
     */
	
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number: ");
     int num = sc.nextInt();
     int numCopy = num;
     int count = 0;
     
     int rem = 0;
   

     // Check if the number is prime
     for (int i = 2; i < num; i++) {
         if (num % i == 0) {
             count++;
         }
     }

     // Reverse the number
     if(count==0) {
    	  int rev = 0;
     while (numCopy != 0) {
         rem = numCopy % 10;
         rev = rev * 10 + rem;
         numCopy = numCopy / 10;
     }
     System.out.println("Reversed number: " + rev);

     // Check if the reversed number is prime
     int count1 = 0;
     for (int j = 2; j < rev; j++) {
         if (rev % j == 0) {
             count1++;
         }
        
         
     }
     if (count == 0 && count1 == 0) {
         System.out.println("Twisted Number");
     } else {
         System.out.println("Not a Twisted Number");
     }
     }else {
    	 System.out.println("The Number is Not twested");
     }
     // Determine if the number is a twisted prime
     
	
}
}
