public class Main {



	public static Node<Integer> deleteEven(Node<Integer> header) {
		Node<Integer> current = header;
		Node<Integer> newHeader = new Node<>(null);
		Node<Integer> newCurrent = newHeader;
		while (current.getNext().getNext()!=null) {
			newCurrent.setNext(current.getNext());
			newCurrent = current.getNext();
			current.setNext(current.getNext().getNext());
			current = current.getNext();
		}
		newCurrent.setNext(current.getNext());
		current.setNext(current.getNext().getNext());
		return newHeader.getNext();
	}

	

	public static Node<Integer> deleteDoubles(Node<Integer> header) {
	    Node<Integer> current1 = header;

	    while (current1 != null) {
	        Node<Integer> current2 = current1.getNext();
	        Node<Integer> previous2 = current1;

	        while (current2 != null) {
	            if (current2.getValue()==current1.getValue()) {
	                previous2.setNext(current2.getNext()); 
	            } else {
	                previous2 = current2;  
	            }
	            current2 = current2.getNext();  
	        }
	        current1 = current1.getNext();   
	    }

		return header;
	}



	public static void main(String[] args) {

		Node<Integer> a1 = new Node<>(1);
		Node<Integer> a2 = new Node<>(4);
		Node<Integer> a3 = new Node<>(1);
		Node<Integer> a4 = new Node<>(4);
		Node<Integer> a5 = new Node<>(5);
		Node<Integer> a6 = new Node<>(6);
		Node<Integer> a7 = new Node<>(7);
		Node<Integer> a8 = new Node<>(7);

		a1.setNext(a2);
		a2.setNext(a3);
		a3.setNext(a4);
		a4.setNext(a5);
		a5.setNext(a6);
		a6.setNext(a7);
		a7.setNext(a8);

		System.out.println(deleteDoubles(a1));

	}
