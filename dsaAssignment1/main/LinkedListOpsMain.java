package dsaAssignment1.main;
import dsaAssignment1.LInkedListOpsDemo;

public class LinkedListOpsMain {

	public static void main(String[] args) {
		LInkedListOpsDemo d1=new LInkedListOpsDemo();
		d1.insert(20,90);
		d1.insert(10);
		d1.traversalList();
		d1.insert(20);
		d1.insert(30);
		d1.insert(40);
		
		d1.traversalList();
		
		d1.insert(30,50);
		d1.traversalList();
		
		d1.deleteByElement(40);
		d1.traversalList();

	}

}
