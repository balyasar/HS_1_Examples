package com.yasar.lesson001;

import java.util.Scanner;

public class Runner_Question4 {
	public static void main(String[] args) {
		/**
		 * Dışarıdan iki sayı alıp toplayalım. Toplamın çift olup olmadığı ekrana
		 * yazdıralım.
		 */
		Scanner scanner = new Scanner(System.in);
		int sayi1, sayi2, toplam;
		boolean isEven;
		System.out.print("1. sayıyı girin : ");
		sayi1 = scanner.nextInt();
		System.out.print("2. sayıyı girin : ");
		sayi2 = scanner.nextInt();
		toplam = sayi1 + sayi2;
		isEven = toplam % 2 == 0;
		System.out.println("Toplam................ : " + toplam);
		System.out.println("Toplam çift mi?....... : " + isEven);
	}

}
