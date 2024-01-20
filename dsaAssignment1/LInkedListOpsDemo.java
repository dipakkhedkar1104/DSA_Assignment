package dsaAssignment1;

public class LInkedListOpsDemo {
	private Node head;
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
		}
				
	}
	public void traversalList() {
		if(head==null) {
			System.out.println("List is empty, cannt transverse");
			return;
		}
		if(head.next==null) {
			System.out.println(head.data);
			return;
		}
		Node temp=head; //not want loose head element reference
		while(temp!=null) {
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		
		
	}
	public void insert(int element) {
		//check any element present or not if not make added elemt head
		Node n=new Node(element);
		if(head==null) {
			head=n;		
			System.out.println("Node added to list....");
			return;
		}
		Node temp=head;
		
		while(temp.next!=null) { //
			temp=temp.next;
			
		}
		//we reach the last node now we add new element
		temp.next=n;
		System.out.println("new node added");		
		
	}
	//to add next elements to node
	public void insert(int existing_element, int new_element) {
		if(head==null) {
			System.out.println("list is empty, cannot insert");
			return;
		}
		
		Node n=new Node(new_element);
		Node temp=head;
		while(temp !=null && temp.data!=existing_element) {
			temp=temp.next;
		}
		if(temp!=null) {
			n.next=temp.next; //to add in between
			temp.next=n;
			System.out.println("\nNode added in between two existing node after giving new node: "+new_element+" after "+existing_element);
		}
		if(temp==null) { //search in whole list but not found
			System.out.println("no such node found, node not added");
		}
		
	}
	
	public void deleteByElement(int element) {
		if(head==null) {
			System.out.println("List is empty, cannt delete");
			return;
		}
		
		//to find out the element which matching the value
		//need to reference previous and temp to delete ops
		
		//---> 3 cases possible
		//1.value found at head
		//2.value found middle and last
		//3.value not found
		
		if(head.data==element) {  //first element
			head=head.next;
			System.out.println("\nnode to be deleted, i.e. first node:"+element);
			return;
		}
		Node temp, prev;
		temp=prev=head;
		
		while(temp!=null && temp.data !=element) { //last temp.data value will==element
			prev=temp;   //previous pointer
			temp=temp.next;  //new pointer    1 2 3 4 5
			
			
			
			
		}
		if(temp!=null) {
			
			prev.next=temp.next;
			temp=null;
			System.out.println("\nDeleated the element: "+element);
			return;
		}
		if(temp==null) {
			System.out.println("\nElemnet not found");
		}
		
		
		
	}
	//
	public void deleteByPosition(){
		
		
	}

}











