/*Q 2. Create a Linked List to store mark of students in ascending order.

A. Insert student with mark = 70
B. Insert student with mark = 60
C. Insert student with mark = 80
D. Insert student with mark = 90
E. Insert student with mark = 75
F. Display all marks
G. Delete student with mark = 60
H. Delete student with mark = 90
I. Delete student with mark = 90
J. Display all marks*/

package dsaAssignment2;

public class studentLinkList {
	private Node head;
	public int tempmarks;
	
	public class Node{
		private int marks;
		public Node next;
		
		public Node(int marks) {
			
			this.marks=marks;
			next=null;
			tempmarks=marks;		
	}
}
		public void travarsalLL() {
			if(head==null) {
				System.out.println("Linst is empty, cannot display");
				return;
			}
			if(head.next==null) { //to print if only one element is present
				System.out.println("-->Current Marks List: "+head.marks);
				return;
			}
			Node temp=head;    //don't want to loose actual head reference
			
			System.out.print("\n-->Current Marks List: ");
			while(temp!=null) {
				
				System.out.print(temp.marks+", ");
				temp=temp.next;
			}
			System.out.println("\n");
		}
		
		public void insert(int element) {
			
			Node n=new Node(element);
			if(head==null || element<head.marks) { //for first element
				n.next=head;
				head=n;
				System.out.println(element+" marks added...");
				return;
			}
			
			Node temp=head;
			while(temp.next!=null && temp.next.marks<element) {
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
			
			System.out.println(element+" marks added...");
			}
		
		public void deleteByElement(int element) {
			if(head==null) {
				System.out.println("List is empty!!");
				return;
			}
		
			
			if(head.marks==element) {  //for first element
				head=head.next;
				System.out.println("Marks is deleted: "+element);
				return;
				
			}
			Node temp, prev;
			temp=prev=head;
			
			while(temp!=null && temp.marks!=element) {   //setting up the prev and temp
				
				prev=temp;    						  //60 70 75 80 90  prev=60,70
				
				temp=temp.next;           			// temp=70,75
				
			}
			
			if(temp!=null) {           //prev=70;
				
				prev.next=temp.next;    //temp=75,--> temp.next==> 80; element after 70 is 80;
				
				temp=null;      	  //  75--->null
				
				System.out.println("Marks is deleted: "+element);
				return;
				
			}
			if(temp==null) {
				System.out.println("\nElement "+element+" not found!!");
			}
			
			
		}
			
}

