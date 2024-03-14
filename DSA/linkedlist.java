import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

// public class linkedlist {
//     class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//             this.prev=null;
//         }
//     }
//     Node head=null;
//     public static void main(String[] args) {
//         linkedlist sll=new linkedlist();
//         Scanner in=new Scanner(System.in);
//         System.out.println("SINGLY LINKED LIST OPERATIONS:");
//         System.out.println("<------------------------------------------------------------------>");
//         System.out.println("ENTER 1 FOR CREATION");
//         System.out.println("ENTER 2 FOR INSERT AT BEGIN");
//         System.out.println("ENTER 3 FOR INSERT AT END");
//         System.out.println("ENTER 4 FOR INSERT AT ANY POSITION");
//         System.out.println("ENTER 5 FOR DELETE AT BEGIN");
//         System.out.println("ENTER 6 FOR DELETE AT END");
//         System.out.println("ENTER 7 FOR DELETE AT ANY POSITION");
//         System.out.println("ENTER 8 FOR TRAVERSE");
//         System.out.println("ENTER 9 FOR REVERSE A LINKED LIST");
//         System.out.println("<------------------------------------------------------------------>");
//         int n=1;
//         while(n==1){
//             System.out.print("Enter the choice=");
//             int ch=in.nextInt();
//             switch(ch){
//                 case 1:
//                     sll.create();
//                     break;
//                 case 2:
//                     sll.insert_beg();
//                     break;
//                 case 3:
//                     sll.insert_end();
//                     break;
//                 case 4:
//                     sll.insert_pos();
//                     break;
//                 case 5:
//                     sll.delete_beg();
//                     break;
//                 case 6:
//                     sll.delete_end();
//                     break;
//                 case 7:
//                     sll.delete_pos();
//                     break;
//                 case 8:
//                     sll.traverse();
//                     break;
//                 case 9:
//                     Node temp=sll.reverse();
//                     while(temp!=null){
//                         System.out.print(temp.data+"->");
//                         temp=temp.next;
//                     }
//                     System.out.println();
//                     break;
//                 case 10:
//                     System.out.println(sll.count()+" no. of Node");
//                     break;
//                 default:
//                     System.out.println("WRONG CHOICE");
//             }
//             System.out.print("Enter 1 to continue=");
//             ch=in.nextInt();
//         }
//     }
//     public Node create(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of node want to create=");
//         int n=in.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             Node temp=new Node(data);
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 temp.next=head;
//                 head=temp;
//             }
//         }
//         return head;
//     }
//     public void insert_beg(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         Node temp=new Node(data);
//         if(head==null){
//             head=temp;
//         }
//         else{
//             temp.next=head;
//             head=temp;
//         }
//     }
//     public void insert_end(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         Node temp=new Node(data);
//         if(head==null){
//             head=temp;
//         }
//         else{
//             Node ptr=head;
//             while(ptr.next!=null){
//                 ptr=ptr.next;
//             }
//             ptr.next=temp;
//             temp.next=null;
//         }
//     }
//     public void insert_pos(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the position=");
//         int pos=in.nextInt();
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         Node temp=new Node(data);
//         if(pos==0){
//             head=temp;
//         }
//         else{
//             Node ptr=head;
//             for(int i=0;i<pos-1;i++){
//                 ptr=ptr.next;
//             }
//             temp.next=ptr.next;
//             ptr.next=temp;
//         }
//     }
//     public void delete_beg(){
//         if(head==null){
//             System.out.print("No node to delete");
//         }
//         else{
//             System.out.println(head.data+" is deleted from begining.");
//             head=head.next;
//         }
//     }
//     public void delete_end(){
//         if(head==null){
//             System.out.print("No node to delete");
//         }
//         else{
//             Node temp=head;
//             while(temp.next.next!=null){
//                 temp=temp.next;
//             }
//             System.out.println(temp.data+" is deleted from end.");
//             temp.next=null;
//         }
//     }
//     public void delete_pos(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the position=");
//         int pos=in.nextInt();
//         Node temp=head;
//         Node ptr=head;
//         for(int i=0;i<pos;i++){
//             temp=ptr;
//             ptr=ptr.next;
//         }
//         System.out.println(ptr.data+" is deleted from "+pos);
//         temp.next=ptr.next;
//     }
//     public Node reverse(){
//         Node ptr=head;
//         Node prev=null;
//         while(ptr!=null){
//             Node temp=ptr.next;
//             ptr.next=prev;
//             prev=ptr;
//             ptr=temp;
//         }
//         return prev;
//     }
//     public int count(){
//         int c=0;
//         Node ptr=head;
//         while(ptr!=null){
//             c++;
//             ptr=ptr.next;
//         }
//         return c;
//     }
//     public void traverse(){
//         Node temp=head;
//         if(temp==null){
//             System.out.print("No data to display");
//         }
//         else{
//             System.out.println("Traversing of linked list:");
//             while(temp!=null){
//                 System.out.print(temp.data+"->");
//                 temp=temp.next;
//             }
//             System.out.println();
//         }
//     }
// }






// PALINDROME LINKED LIST


// public class linkedlist{
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head=null;
//     public static void main(String[] args) {
//         linkedlist sll=new linkedlist();
//         sll.create();
//         boolean ans=sll.palindrome();
//         if(ans==true){
//             System.out.println("Given Linked List is palindrome.");
//         }
//         else{
//             System.out.println("Given Linked List is not a palindrome.");
//         }
//     }
//     public Node middle(){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
//     public Node reverse(Node mid){
//         Node ptr=mid;
//         Node prev=null;
//         while(ptr!=null){
//             Node temp=ptr.next;
//             ptr.next=prev;
//             prev=ptr;
//             ptr=temp;
//         }
//         return prev;
//     }
//     public boolean palindrome(){
//         if(head==null){
//             return false;
//         }
//         Node mid=middle();
//         Node last=reverse(mid.next);
//         Node curr=head;
//         while(last!=null){
//             if(last.data!=curr.data){
//                 return false;
//             }
//             else{
//                 last=last.next;
//                 curr=curr.next;
//             }
//         }
//         return true;
//     }
//     public Node create(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of node want to create=");
//         int n=in.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             Node temp=new Node(data);
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 temp.next=head;
//                 head=temp;
//             }
//         }
//         return head;
//     }
// }





// Clone a Linked List


// public class linkedlist{
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head1=null;
//     Node head2=null;
//     public static void main(String[] args) {
//         linkedlist sll=new linkedlist();
//         Node head1=sll.create1();
//         Node head2=sll.create1();
//         Node ptr=sll.concat(head1, head2);
//         sll.traverse(ptr);
//     }
//     public Node create1(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of node want to create=");
//         int n=in.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             Node temp=new Node(data);
//             if(head1==null){
//                 head1=temp;
//             }
//             else{
//                 temp.next=head1;
//                 head1=temp;
//             }
//         }
//         return head1;
//     }
//     public Node create2(){
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of node want to create=");
//         int n=in.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print("Enter the data=");
//             int data=in.nextInt();
//             Node temp=new Node(data);
//             if(head2==null){
//                 head2=temp;
//             }
//             else{
//                 temp.next=head2;
//                 head2=temp;
//             }
//         }
//         return head2;
//     }
//     public Node concat(Node head1,Node head2){
//         Node temp=head1;
//         Node ptr=temp;
//         while(ptr.next!=null){
//             ptr=ptr.next;
//         }
//         ptr.next=head2;
//         return temp;
//     }
//     public void traverse(Node ptr){
//         Node temp=ptr;
//         if(temp==null)
//         {
//             System.out.println("No node to display");
//             return;
//         }
//         else{
//             while(temp!=null){
//                 System.out.print(temp.data+"->");
//                 temp=temp.next;
//             }
//             System.out.println();
//         }
//     }
// }



