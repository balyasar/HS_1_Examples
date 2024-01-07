package com.yasar.lesson001;

import java.util.Scanner;

public class Runner_Question3 {
	public static void main(String[] args) {
		/**
		 * Bir ürün fiyatında %20 KDV, %15 kar payı olduğunu biliyoruz. Bu ürünün son
		 * fiyatı elimizde olsun. Daha sonra bu son fiyattan ürünün ham fiyatı ve
		 * KDV'siz fiyatını bulalım.
		 */
		Scanner scanner = new Scanner(System.in);
		int total;
		double feeVat, baseFee;
		System.out.print("Tutarı giriniz.... : ");
		total = scanner.nextInt();
		feeVat = total / 1.2;
		baseFee = feeVat / 1.15;

		System.out.println("KDV'siz Fiyat.... : " + feeVat + " TL" + "\n" + "Karsız Fiyat..... : " + baseFee + " TL");

	}

}
