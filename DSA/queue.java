import java.util.Scanner;

public class queue {
    public class Queue{
        int data;
        Queue next;
        Queue(int data){
            this.data=data;
            this.next=null;
        }
    }
    Queue front=null,rear=null;
    public static void main(String[] args) {
        queue q=new queue();
        Scanner in=new Scanner(System.in);
        System.out.println("Queue Operations are:");
        System.out.println("-----------------------------------------");
        System.out.println("1 to Enqueue data");
        System.out.println("2 to Dequeue data");
        System.out.println("3 to Display Data");
        System.out.println("-----------------------------------------");
        int n=1;
        while(n==1){
            System.out.print("Enter the choice=");
            int ch=in.nextInt();
            switch(ch){
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                default:
                    System.out.println("Wrong Choice");
                    return;
            }
            System.out.println("Enter 1 to continue:");
            n=in.nextInt();
        }
    }
    public void enqueue(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the data:");
        int data=in.nextInt();
        Queue newnode=new Queue(data);
        if(rear==null){
            front=rear=newnode;
        }
        else{
            rear=rear.next;
            rear=newnode;
        }
    }
    public void dequeue(){
        if(rear==null){
            System.out.println("No element to delete");
        }
        else{
            System.out.println("Deleted element->"+front.data);
            front=front.next;
        }
    }
    public void display(){
        Queue temp=front;
        if(front==null && rear==null){
            System.out.println("No element to display");
            return;
        }
        else{
            System.out.println("Queue elements are:");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            return;
        }
    }
}
