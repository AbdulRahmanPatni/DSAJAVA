public class CircularLL {

    private  static Node first;

    private  static Node last;


    CircularLL(){
        this.first=null;
        this.last=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int data){
        Node newnode=new Node(data);
        if(first==null){
            last=newnode;
        }
        newnode.next=first;
        first=newnode;
        last.next=newnode;
    }



    public void print(){
        Node temp=first;

        do{
            temp.display();
            temp=temp.next;

        }while (temp!=last.next);

    }

    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        System.out.println(first.Data);
        System.out.println(last.Data);
        list.print();
    }
}
