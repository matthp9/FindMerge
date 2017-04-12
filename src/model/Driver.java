package model;

public class Driver {

	public static void main(String... args) {
		MergeFinder m = new MergeFinder();
		LLNode l = m.solve();
		if (l != null) {
			System.out.println(l.data);
		} else {
			System.out.println("Received null");
		}
	}
	
}
