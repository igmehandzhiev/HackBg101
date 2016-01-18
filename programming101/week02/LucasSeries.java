package com.hackbulgaria.programming101.week02;

public class LucasSeries {
	public static int nthLucas(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Argument must be positive numnber.");
		}
		if (n <= 1)
			return 1;
		return nthLucas(n - 1) + nthLucas(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(nthLucas(4));
	}

}
