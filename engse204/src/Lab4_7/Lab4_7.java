package Lab4_7;

import java.util.Scanner;

public class Lab4_7 {

	public static void main(String[] args) {
		Scanner gf = new Scanner(System.in);
		
		String id1 = gf.nextLine();
		String id2 = gf.nextLine();
		String id3 = gf.nextLine();
		
		Resource r1 = new Resource(id1);
		Resource r2 = new Resource(id2);
		Resource r3 = new Resource(id3);
		
		r1 = null;
		r2 = null;
		
		System.gc();
		
		r3 = null;
		
		System.gc();
		
		gf.close();
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