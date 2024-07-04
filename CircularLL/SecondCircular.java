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
	public void insertLast(int data) {
		Node newnode=new Node(data);
		if(last==null) {
			first=newnode;
			last=newnode;
			last.next=last;
			
		}else {
		newnode.next=last.next;
		last.next=newnode;
		last=newnode;
		}	
	}
	
	public int deleteFirst() {
		if(isEmpty()) {
			System.out.println("Nothing to Delete");
			return -1;
		}
		if(first.next==last) {
			first=null;
			last=null;
			return -1;
			
		}
		int temp=first.Data;
		last.next=first.next;
		first=first.next;
		return temp;
		
	}
	
	public int deletelast() {
		if(isEmpty()) {
			System.out.println("Empty List!");
			return -1;
		}
		int temp=last.Data;
	    Node firstnode=last.next;
	    while(firstnode.next!=last) {
	    	firstnode=firstnode.next;
	    }
	    firstnode.next=first;
	    last=firstnode;
	    return temp;
	    
	    
		
		
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
		list2.insertFirst(30);
		list2.insertFirst(20);
		list2.insertFirst(10);
		list2.insertLast(50);
		list2.deleteFirst();
		 list2.deletelast();
//		list2.deleteFirst();
		 
		 System.out.println(first.Data);
		 System.out.println(last.next.Data);
	

		

		list2.print();
	}

}
