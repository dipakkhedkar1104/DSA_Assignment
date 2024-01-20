/*Qn1 . Write a Java program to create a double linked list and Following
Functionalities must by implement in the program.

 Insert a New node 100 at the end of the list
 Insert a new node 200 at the end of the list
 Insert a new node 300 at the end of the list
 Display the list
 Insert a new node 400 after the last node
 Display the list
 Delete 400 from the list
 Delete 400 from the list
 Display the list
 Delete 200 from the list
 Display the current elements present in the list*/

package dsaAssignment3;

public class DLinkList1 {
	
	private Node head;
	
	private class Node{
		private int data;
		private Node next,prev;
		
		public Node(int data) {
			this.data=data;
		}
		
	}
	
	//to check is list empty
	public boolean isEmpty() {
		if(head==null) { //is list empty
			
			return true;			
		}
		else
			return false;
	}
	
	//to check is there only one element present
	public boolean isOnlyElement() {
		if(head.next==null) {
			return true;
		}
		return false;
	}
	
	public void insertAtEnd(int element) {
		Node n=new Node(element);
		if(isEmpty()) {
			head=n;
			System.out.println("\nFirst node was added! i.e  : "+element);
			return;
			
		}
		if(isOnlyElement()) { //  if only element is present
			
			head.next=n;     // (head)1-->next=n
			n.prev=head;     //   (head)1  <--prev-- element;
			System.out.println("\nNode was added at Last ! i.e: "+element);
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=n;   
		n.prev=temp;
		System.out.println("\nNode was added at Last ! i.e: "+element);
		return;
		
	}
	public void insertAfterGivenElement(int existing_el, int new_element) {
		if(isEmpty()) {
			System.out.println("List is empty, cannt insert "+new_element);
			return;
		}
		Node n=new Node(new_element);  		//if there is only element present and matching to given
		if(head.data==existing_el && head.next==null) {
			head.next=n;
			n.prev=head;
			System.out.println("\nNode "+new_element+" added after "+existing_el);
			return;
			
		}
		Node temp=head;
		while(temp!=null && temp.data!=existing_el  ) {
			temp=temp.next;
			
		}
		//if existing element is last element
		if(temp!=null && temp.next==null) {
			insertAtEnd(new_element);  //adding element at last so i call insertAtLast;
			return;
			
		}
		if(temp!=null) {
		    n.next = temp.next;
		    if(temp.next != null) {
		        temp.next.prev = n;  // Also added a null check to avoid potential NullPointerException
		    }
		    n.prev = temp;
		    temp.next = n;  // Added this line to update 'next' pointer of 'temp'
		    System.out.println("\nNode "+new_element+" added after "+existing_el);
		    return;
		

			
		}
		System.out.println("\nNode "+existing_el+" Not Found!");
		
	}
	
	public void deleteNode(int existing_el) {
		if(isEmpty()) {
			
			System.out.println("List is empty");
			return;
		}
		
		//if existing el is at head and head is only present
		if(head.data==existing_el && head.next==null) {
			head=null;
			
			System.out.println("\nNode deleted: "+existing_el);
			return;
			
		}

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
			System.out.println("\nlast node "+existing_el+" deleted");
			return;
		}
		if(temp!=null) { //mens -->ex element found
			
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			
			System.out.println("\nNode deleted: "+existing_el);
			return;
			
		}
		System.out.println("\nNo such node "+existing_el+" was found");
		
	}	
	
	public void travarseDLL() {
		System.out.print("\n--> Current List  : ");

		if(isEmpty()) { //is list empty
			System.out.println("\nList is empty!, cannt travarse\n");
			 return;
		}
		if(isOnlyElement()) { //if only one element is in the list
			System.out.print(head.data+", ");
			return;
		}
		
		Node temp=head;
		while(temp!=null) {  //1 2 3
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println();		
		
	}
	
	public void travarseInReverse() {
		System.out.print("\n--> List in reverse: ");
		
		if(isEmpty()) {
			System.out.println("List is empty, cant traverse in revere");
			return;		
		}
		
		if(isOnlyElement()) {
			System.out.println("can't traverse in revere only one element present: ");
			System.out.println(head.data+", ");
			return;
		}
		
		Node temp=head;
		
		while(temp.next!=null) {    // null-1, 2 , 3-->> null
			temp=temp.next;
		}
		while(temp!=null) {        // null <---1,2,3-null
			System.out.print(temp.data+", ");
			temp=temp.prev;
		}
		
		System.out.println();
			
	}
}
