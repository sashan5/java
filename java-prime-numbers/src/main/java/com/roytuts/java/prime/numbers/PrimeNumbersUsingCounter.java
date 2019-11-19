package com.roytuts.java.prime.numbers;

public class PrimeNumbersUsingCounter {

	public static void main(String[] args) {
		printPrimeUpto(1000);
	}

	public static void printPrimeUpto(int num) {
		String sep = "";
		int i = 2;
		while (i <= num) {
			if (isPrime(i)) {
				System.out.print(sep);
				System.out.print(i);
				sep = ", ";
			}
			i++;
		}
	}

	public static boolean isPrime(int num) {
		int counter = 0;

		for (int i = num; i >= 1; i--) {
			if (num % i == 0) {
				counter = counter + 1;
			}
		}

		if (counter == 2) {
			return true;
		}

		return false;
	}

}
