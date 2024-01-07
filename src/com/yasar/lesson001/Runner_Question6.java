package com.yasar.lesson001;

import java.util.Scanner;

public class Runner_Question6 {
	public static void main(String[] args) {
		/**
		 * 1'den girdiğiniz sayıya kadar olan sayıları yazdıralım.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int sayi = scanner.nextInt();
		for (int i = 1; i <= sayi; i++) {
			System.out.println(i);
		}
	}

}
