package org.example;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println(sum(10, 10));
	}

	public static int sum(int a, int b){
		return a + b;
	}

	public static int differenz(int a, int b){
		return a - b;
	}

	public static boolean isEvenNumber(int n) {
		return n % 2 == 0;
	}
}