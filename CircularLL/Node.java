package CircularLL;

public class Node {

    public int Data;

    Node next;


    Node(int data){
        this.Data=data;
        this.next=null;
    }


    public void display(){
        System.out.print(+Data+"->");
    }
}
