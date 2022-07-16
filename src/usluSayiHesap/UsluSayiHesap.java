package usluSayiHesap;

import java.util.Scanner;

public class UsluSayiHesap {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		int a, b;
		
		System.out.print("Taban sayiyi giriniz: ");
		a = input.nextInt();
		System.out.print("Ussunu giriniz: ");
		b = input.nextInt();
		int toplam = 1;
		
		for (int i = 1; i <= b; i++) {
			toplam *= a;
		}
		System.out.println("Sonuc: " + toplam);
		
	}
}
