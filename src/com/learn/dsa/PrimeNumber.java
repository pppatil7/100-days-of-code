package com.learn.dsa;

public class PrimeNumber {

	public static void main(String[] args) {

		int i, m = 0;
		int flag = 0;

		int n = 5;
		m = n / 2;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		}

		else {
			for (i = 2; i <= m; i++) {
				if (n % 2 == 0) {
					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime number");
			}
		}

	}

}
