package DoubleLL;

public class Node {

    public int Data;
    
    public Node next;
    
     public Node previous;


    Node(int data){
        this.Data=data;
        this.next=null;
    }


    public void display(){
        System.out.print(+Data+"->");
    }
}
