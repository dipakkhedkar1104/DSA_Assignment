package dsaAssignment3.main;
import dsaAssignment3.DLinkList1;

public class DLinkList1Main {

	public static void main(String[] args) {
		DLinkList1 d1=new DLinkList1();
		
		d1.insertAtEnd(100);
		d1.insertAtEnd(200);
		d1.insertAtEnd(300);
		
		d1.travarseDLL();
		
		d1.insertAfterGivenElement(300, 400);
		
		d1.travarseDLL();
		d1.travarseInReverse();
		
		d1.deleteNode(400);
		d1.deleteNode(400);
		
		d1.travarseDLL();
		
		d1.deleteNode(200);
		
		d1.travarseDLL();
	}
}