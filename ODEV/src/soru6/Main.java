package soru6;

public class Main {

	public static void main(String[] args) {
		WordDocument word = new WordDocument("selam");
		PDFDocument pdf = new PDFDocument("kodluyoruz");
		
		// static olarak belirterek yeni bir obje oluşturmadan Printer classın içerisindeki
		// methodlara erişmemizi sağladı.
		
		Printer.printWordDocument(word);
		Printer.printPDFDocument(pdf);
	}

} 
