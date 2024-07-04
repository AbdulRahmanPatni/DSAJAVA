package DoubleLL;

public class DoublyLlinkedList {
	
	
	private Node first;
	private Node last;
	
	
	public DoublyLlinkedList() {
		this.first=null;
		this.last=null;
		
	}
	
	public void insertFirst(int data) {
		Node newnode=new Node(data);
		if(first==null) {
			last=newnode;
		}else {
			first.previous=newnode;
		}
		newnode.next=first;
		this.first=newnode;
	}
//	assuming the Doubly LL is not Empty!
	public void insertLast(int data) {
		Node  newnode=new Node(data);
		if(first==null) {
			first=newnode;
		}else {
			last.next=newnode;
			newnode.previous=last;
	}
		last=newnode;
		
	}
	
//	assuming the Doubly LL is not Empty!
	public Node deletefirst() {
		Node temp=first;
		if(first.next==null){
			last=null;
			
		}else {
			first.next.previous=null;
		}
	
		first=first.next;
		return temp;
		
	}
//	assuming the Doubly LL is not Empty!
	public Node deletelast() {
		Node temp=last;
		
		if(first.next==null) {
			first=null;
		}else {
			last.previous.next=null;
		
		}
		last=last.previous;
		return temp;
		
	}
	
//	assuming the Doubly LL is not Empty!
	
	public void insertafter(int data,int data2) {
		Node newnode=new Node(data);
		Node node=first;
		while(node!=null) {
			if(node.Data==data) {
				break;
			}
			node=node.next;
		}
		
		newnode.next=node.next;
		node.next.previous=newnode;
		newnode.previous=node;
	}
	
	
	
	
	
	
	

}
