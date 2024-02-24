package assignment4;

import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
	    int sum = 0;
	    System.out.println("Enter array value:");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	    }

        for (int num : a) {
            if (num % 2 != 0) {
                continue;
            }
            sum += num;
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}


