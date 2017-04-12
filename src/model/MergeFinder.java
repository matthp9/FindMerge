package model;

public class MergeFinder {
	
	private LLNode header1;
	private LLNode header2;
	
	public MergeFinder() {
		
		LLNode intersection = new LLNode(6, null);
		
		LLNode l1 = new LLNode(1,
				new LLNode(2,
				new LLNode(3,
				new LLNode(4,
				new LLNode(5,
				intersection)))));
		
		LLNode l2 = new LLNode(19,
				new LLNode(2,
				new LLNode(31,
				intersection)));
		
		intersection.next = new LLNode(84, new LLNode(53, null));
		
		header1 = l1;
		header2 = l2;
	}
	
	public LLNode solve() {
		int length1 = getLength(header1);
		int length2 = getLength(header2);
		int diff    = Math.abs(length1 - length2);
		
		LLNode longer = (length1 < length2) ? header2 : header1;
		LLNode shorter = (length1 < length2) ? header1 : header2;
		
		for (int i = 0; i < diff; i++) {
			longer = longer.next;
		}
		
		while (longer != null && shorter != null) {
			System.out.println(longer.data);

			System.out.println(longer);
			System.out.println(shorter.data);

			System.out.println(shorter);
			if (longer == shorter) {
				return longer;
			}
			longer = longer.next;
			shorter = shorter.next;
		}
		
		return null;
	}
	
	private int getLength(LLNode node) {
		int count = 0;
		while (node != null) {
			node = node.next;
			count++;
		}
		return count;
	}
}
