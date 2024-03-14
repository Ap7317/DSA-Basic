package LINKEDLIST;

import java.util.Scanner;

public class basic {
    class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public static void main(String[] args) {
        basic sll=new basic();
        Node head1=sll.create();
        Node head2=sll.create();
        Node head=sll.merge_sort(head1, head2);
        
    }
    public Node create(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of node want to create=");
        int n=in.nextInt();
        
    }
    public static Node merge_sort(Node head1,Node head2){
        Node t1=head1;
        Node t2=head2;
        Node ptr=new Node(10);
        while(t1!=null && t2!=null){
            if(t1.data>t2.data){
                ptr.next=t2;
                ptr=t2;
                t2=t2.next;
            }
            else{
                ptr.next=t1;
                ptr=t1;
                t1=t1.next;
            }
        }
        if(t1==null){
            ptr.next=t2;
        }
        else{
            ptr.next=t2;
        }
        return ptr.next;
    }
}
