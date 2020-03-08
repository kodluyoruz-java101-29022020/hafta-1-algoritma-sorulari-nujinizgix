package paket;

import java.util.Scanner;
public class iki {

	public static void main(String[] args) {
		
		int sayi1,sayi2,islemler;
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("***************");
		System.out.println("1 - Toplama");
		System.out.println("2 - Cikarma");
		System.out.println("3 - Carpma");
		System.out.println("4 - Bölme");
		System.out.println("***************");
		
		System.out.print("Birinci sayiyi giriniz : ");
		sayi1 = scanf.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz : ");
		sayi2 = scanf.nextInt();
		
		System.out.print("Bir islem seciniz : ");
		islemler = scanf.nextInt();
		
		if(islemler == 1) {
			System.out.println("Toplama isleminin sonucu = " + (sayi1+sayi2));
		} 
		else if(islemler == 2) {
			System.out.println("Cikarma isleminin sonucu = " + (sayi1-sayi2));
		}
		else if(islemler == 3) {
			System.out.println("Carpma isleminin sonucu = " + (sayi1*sayi2));
		}
		else if (islemler == 4) {
			System.out.println("Bolme isleminin sonucu = " + (sayi1/sayi2));
		}
		else {
			System.out.println("Tanimlanmamis islem");
		}
	}
}