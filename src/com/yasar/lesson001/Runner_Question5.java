package com.yasar.lesson001;

import java.util.Scanner;

public class Runner_Question5 {
	public static void main(String[] args) {
		/**
		 * Dışarıdan bir isim soyisim ve dogum yılı alalım. Ehliyet alıp alamayacağını
		 * yazan program
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adınızı Giriniz : ");
		String nameString = scanner.nextLine();
		System.out.print("Soyisim Giriniz : ");
		String lastNameString = scanner.nextLine();
		System.out.print("Doğum yılını giriniz : ");
		int birthDate = scanner.nextInt();
		int age = 2023 - birthDate;

		// Tenary Kullanımı

		String durumString = age > 18 ? "Ehliyet alabilir" : "Ehliyet alamaz.";

		int durum2 = age > 18 ? 1 : 0;

		System.out.println(nameString + " " + lastNameString + " " + age + " yaşındadır." + durumString);

	}

}
