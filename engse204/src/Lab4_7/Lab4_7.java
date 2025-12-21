package Lab4_7;

import java.util.Scanner;

public class Lab4_7 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		String id1 = Scanner.nextLine();
		String id2 = Scanner.nextLine();
		String id3 = Scanner.nextLine();
		
		Resource r1 = new Resource(id1);
		Resource r2 = new Resource(id2);
		Resource r3 = new Resource(id3);
		
		r1 = null;
		r2 = null;
		
		System.gc();
		
		r3 = null;
		
		System.gc();
		
		Scanner.close();
	}

}

class Resource {
	private String id;
	
	public Resource(String id) {
		this.id = id;
		System.out.println("Resource " + id + " create.");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Resource " + id + " finalized (destroyed).");
	}
}