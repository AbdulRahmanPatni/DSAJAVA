package CircularLL;



public class Circular {
	
	private static  Node first;
	
	private static Node last;
	
	public Circular() {
		first=null;
		last=null;
	}
	
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
	}
	
	public void insertLast(int data) {
		Node newnode=new Node(data);
		if(isEmpty()) {
			first=newnode;
		}else {
		last.next=newnode;
		last=newnode;
		}
	}
	
	public int deleteFirst() {
		if(isEmpty()) {
			System.out.println("Nothing to Delete");
			return -1;
		}
		int temp=first.Data;
		if(first.next==null) {
			last=null;
		}
		first=first.next;
		return temp;	
		
	}
	
	public void deleteLast() {
        int temp=last.Data;
        Node firstnode=first;
        while(firstnode.next.next!=null) {
        	firstnode=firstnode.next;
        }
        last=firstnode;
        firstnode.next=null;
        
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		Node temp=first;
		while(temp!=null) {
			temp.display();
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		Circular list=new Circular();
		list.insertFirst(40);
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);
		list.insertLast(50);
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteLast();
		list.deleteFirst();
		list.deleteFirst();
		
		

		list.print();
		
	}
	
	

}
