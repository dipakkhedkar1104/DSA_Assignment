package dsaAssignment2.main;
import dsaAssignment2.studentLinkList;

public class studentLinkListMain {

	public static void main(String[] args) {
		studentLinkList m1=new studentLinkList();
		
		
		
		m1.insert(70);
		m1.insert(60);
		m1.insert(80);
		m1.insert(90);
		m1.insert(75);
		
		System.out.println("\nMarks inserted in ascending order:  ");
		
		m1.travarsalLL();
		
		m1.deleteByElement(60);
		m1.deleteByElement(90);
		m1.deleteByElement(90);
		
		m1.travarsalLL();
		

	}

}

//A. Insert student with mark = 70
//B. Insert student with mark = 60
//C. Insert student with mark = 80
//D. Insert student with mark = 90
//E. Insert student with mark = 75
//F. Display all marks
//G. Delete student with mark = 60
//H. Delete student with mark = 90
//I. Delete student with mark = 90
//J. Display all marks*/
