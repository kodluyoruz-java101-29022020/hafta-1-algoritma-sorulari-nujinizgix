package paket;

import java.util.Scanner;

public class bir {

	public static void main(String[] args) {
		
		String pass = "12345";
		System.out.print("Bir sifre giriniz:"); 
		Scanner scanf = new Scanner(System.in);
		String userpass = scanf.nextLine();
		
		if(userpass.equals(pass)) {
			System.out.println("Giriş Başarılı!");
		}
		else {
			System.out.println("Giriş Başarısız!");
		}
	}
}


