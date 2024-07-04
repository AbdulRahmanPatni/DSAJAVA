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
        if(isEmpty()){
            last=newnode;
        }
        newnode.next=first;
        first=newnode;
    }



    public void print(){
        if(isEmpty()){
            System.out.println("Empty List");
            return;
        }
        Node temp=first;

        do{
            temp.display();
            temp=temp.next;

        }while (temp!=last.next);

    }

    public void insertLast(int data) {
        Node newnode = new Node(data);

        if (isEmpty()) {
            first = newnode;
        } else {
            last.next = newnode;
            newnode.next = first;
            last = newnode;
        }
    }

    public int deleteFirst(){
        if(isEmpty()){
            return -1;
        }
        int temp=first.Data;
        if(first.next==null){
            last=null;
        }
        first=first.next;
        return  temp;

        }





    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.insertLast(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.deleteFirst();
        list.print();

    }
    }

