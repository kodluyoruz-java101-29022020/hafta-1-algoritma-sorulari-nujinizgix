package paket;

import java.util.Random;

public class bes {

	public static void main(String[] args ) {
 
		int[] sayilar = new int[100];
	
		for(int i=0;i<100;i++) {
			Random rand = new Random();
			int sayi = rand.nextInt(1000);
			sayilar[i] = sayi;
		}
		
	
		for(int i=0; i<100; i++) {
			
			if ( sayilar[i]%2==0) {
				System.out.print(sayilar[i] + " - Çift\n");
			}
			
			else {
					System.out.print(sayilar[i] + " - Tek\n");
		}
		



	}
	}}
