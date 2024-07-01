package CircularLL;

public class SecondCircular {
	
	private static Node first;
	
	private static Node last;
	
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void insertFirst(int data) {
      Node newnode=new Node(data);
      if(isEmpty()) {
    	  last=newnode;
      }
      newnode.next=first;
      first=newnode;
      last.next=first; 
		
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Empty List!");
			return;
		}
		Node temp=first;
		do {
			temp.display();
			temp=temp.next;
		}while(temp!=last.next);
	}
	
	
	
	
	
	public static void main(String[] args) {
		SecondCircular list2=new SecondCircular();
		list2.insertFirst(40);
		list2.insertFirst(30);
		list2.insertFirst(20);
		list2.insertFirst(10);
	
		list2.print();
	}

}
