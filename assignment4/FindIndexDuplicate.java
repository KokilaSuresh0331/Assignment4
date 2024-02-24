package assignment4;

import java.util.Scanner;

public class FindIndexDuplicate {
	static int[] a= {1, 2, 3, 2, 6, 7};
	 int secondOccurrenceIndex(int[] arr, int num) 
	 {
	        int firstIndex = -1;
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (a[i] == num) {
	                if (firstIndex == -1) { firstIndex = i;} else {return i;}
	               }}
	         return -1;
	    }

	    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Find duplicate value index:");
	    System.out.println("Enter a array value:");
	    int num=sc.nextInt();
	        FindIndexDuplicate finder = new FindIndexDuplicate();     
	        int secondIndex = finder.secondOccurrenceIndex(a, num);

	        if (secondIndex != -1) {
	            System.out.println("Second occurrence of " + num + " found at index: " + secondIndex);
	        } else {
	            System.out.println("Second occurrence of " + num + " not found.");
	        }
	    }
	}
