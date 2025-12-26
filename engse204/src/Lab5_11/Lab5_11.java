package Lab5_11;

import java.util.Scanner;

public class Lab5_11 {

	public static void main(String[] args) {
		Scanner er = new Scanner(System.in);
		
		String titleT1 = er.nextLine();
		int wordC1 = er.nextInt();
		er.nextLine();
		
		String titleD1 = er.nextLine();
		int pageC1 = er.nextInt();
		er.nextLine();
		
		String titleT2 = er.nextLine();
		int wordC2 = er.nextInt();
		er.nextLine();
		
		String titleD2 = er.nextLine();
		int pageC2 = er.nextInt();
		
		TextDocument text1 = new TextDocument(titleT1, wordC1);
		PDFDocument pdf1 = new PDFDocument(titleD1, pageC1);
		
		TextDocument text2 = new TextDocument(titleT2, wordC2);
		PDFDocument pdf2 = new PDFDocument(titleD2, pageC2);
		
		Document[] doc = { text1, pdf1, text2, pdf2};
		
		int totalPages = 0;
		for(Document d : doc) {
			if(d instanceof PDFDocument) {
				totalPages += ((PDFDocument) d).pageCount;
			}
		}
		
		for(Document d: doc) {
			d.displayDetails();
		}
		
		System.out.println("Total Pages:" + totalPages );
		
		er.close();
	}

}

class Document {
	protected String title;
	
	public Document(String title) {
		this.title = title;
	}
	
	public void displayDetails() {
		System.out.println("Document:" + title );
	}
}

class TextDocument extends Document {
	protected int wordCount;
	
	public TextDocument(String title, int wordCount) {
		super(title);
		this.wordCount = wordCount;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Text:" + title + ", Words:" + wordCount );
	}
}

class PDFDocument extends Document {
	protected int pageCount;
	
	public PDFDocument(String title, int pageCount) {
		super(title);
		this.pageCount = pageCount;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("PDF:" + title + ", Pages:" + pageCount );
	}
}

