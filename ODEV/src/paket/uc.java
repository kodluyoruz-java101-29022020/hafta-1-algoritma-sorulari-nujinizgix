package paket;

	import java.util.Random;

public class uc {

	public static void main(String[] args) {
		int[] sayilar = new int[100];
		
		for(int i=0;i<100;i++) {
			Random rand = new Random();
			int sayi = rand.nextInt(1000);
			sayilar[i] = sayi;
		}
		
		double ort = ortalama(sayilar);
		System.out.println("ortalama : " + ort);
	}
	
	public static double ortalama(int[] dizi) {
		double toplam = 0;
		for(int i = 0; i<100; i++) {
			toplam+=dizi[i];
		}
		
		return toplam/100; 
	}
}

