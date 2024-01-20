package dsaAssignment1;

public class DLinkListDemo {
	private Node head;
	
private class Node{
		private Node prev,next;
		//private Node next;
		private int data;
		
		public Node(int data) {
			this.data=data;
		}
				
	}
	
	public void travarseList() {
		if(head==null) {
			System.out.println("\nList is empty");
			return;
			
		}
		if(head.next==null) {
			System.out.println(head.data);
			return;
		}
		Node temp=head;
		while(temp!=null) { //1,2,3
			System.out.print(temp.data+" ");
			
			temp=temp.next;
		}
	}
	
	public void traverseListInReverse() {
		System.out.println("\nReverse list:\n");
		if(head==null) {
			System.out.println("List is empty");
			return;
			
		}
		if(head.next==null) {
			System.out.print(head.data+", ");
			return;
		}
		Node temp=head;
		while(temp.next!=null) {  //false at last elemetnt
			temp=temp.next;
		}
		while(temp!=null) {  //reverse traverse false at first element
			System.out.print(temp.data+", ");
			temp=temp.prev;
		}
		System.out.println();
		
	}
	
	public void insertAtEnd(int element) {
		Node n=new Node(element);
		if(head==null) {
			head=n;
			System.out.println("\nfirst node added");
			return;
		}
		if(head.next==null) { //add if there only one element
			head.next=n;
			n.prev=head;
			
			System.out.println("\nnew node added at end i.e: "+element);
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}  						//temp is on last node
		temp.next=n;   //temp next is new now
		n.prev=temp;   //new node prev will temp now
		System.out.println("new Node added at end i.e: "+element);
		return;
		
	}
	public void inserAfterGivenNode(int existing_el, int new_element) {
		if(head==null) {
			
			System.out.println("List is empty");
			return;
		}
		Node n=new Node(new_element); //if only element there
		if(head.data==existing_el && head.next==null) {
			head.next=n;
			n.prev=head;
			System.out.println("\nNode "+new_element+" added after "+existing_el);
			return;
			
		}
		
		Node temp=head;  //element must present inside so check
		while(temp!=null && temp.data!=existing_el) {
			temp=temp.next;
		}
		//for last node
		if(temp!=null  && temp.next==null) {
//			temp.next=n;
//		
//			n.prev=temp;
//			System.out.println("aded after last");
			insertAtEnd(new_element);
			return;
		}
		if(temp!=null) { //mens -->ex element found
			n.next=temp.next;
			temp.next.prev=n;
			temp.next=n;
			n.prev=temp;
			System.out.println("\nNode "+new_element+" added after given node "+existing_el);
			return;
			
		}
		System.out.println("\nnode "+existing_el+" was Not found");
		
		
		
	}
	public void deleteNode(int existing_el) {
		if(head==null) {
			
			System.out.println("List is empty");
			return;
		}
		
		//if existing el is at head and head is only present
		if(head.data==existing_el && head.next==null) {
			head=null;
			
			System.out.println("\nNode deleted: "+existing_el);
			return;
			
		}
		//
		if(head.data==existing_el) { //for fi
			head=head.next;
			head.next.prev=null;
			System.out.println("/nNode deleted: "+existing_el);
			return;
		}
		
		Node temp=head;  //element must present inside so check
		while(temp!=null && temp.data!=existing_el) {
			temp=temp.next;
		}
		//for last node
		if(temp!=null  && temp.next==null) {
			temp.prev.next=null;	//for last
			temp.prev=null;      //to free given element to delere
			System.out.println("last node "+existing_el+" deleted");
			return;
		}
		if(temp!=null) { //mens -->ex element found
			
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			
			System.out.println("Node deleted: "+existing_el);
			return;
			
		}
		System.out.println("No such node "+existing_el+" was found");
		
	}

}









