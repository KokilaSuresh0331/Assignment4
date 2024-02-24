package assignment4;

import java.util.Scanner;

public class PrintPrimeNumber {
	public static void main(String[] args) {
	        int n = 30;
	        System.out.println("Prime numbers less than or equal to " + n + " are:");
	        	
	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                System.out.print(i+" ");
	            }
	        }
	    }

	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num == 2 || num == 3) {
	            return true;
	        }
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}