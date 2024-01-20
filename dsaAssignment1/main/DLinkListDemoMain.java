package dsaAssignment1.main;
import dsaAssignment1.DLinkListDemo;

public class DLinkListDemoMain {

	public static void main(String[] args) {
		DLinkListDemo d1=new DLinkListDemo();
		d1.insertAtEnd(34);
		d1.insertAtEnd(66);
		
		d1.travarseList();
	
	
		
		
		d1.traverseListInReverse();
		
		d1.inserAfterGivenNode(34, 90);
		d1.travarseList();
		
		d1.inserAfterGivenNode(90, 110);
		d1.travarseList();
		
		d1.inserAfterGivenNode(3454, 54);
		d1.travarseList();
		
		d1.traverseListInReverse();
		d1.deleteNode(100);
		d1.deleteNode(90);
		
		d1.travarseList();
	}

}
