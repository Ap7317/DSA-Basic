import java.util.*;

// Implementation of Binary Tree(Left=2*i and Right=2*i+1) with Tree Traversal

public class tree{
    static Scanner in=null;
    public static void main(String[] args) {
        in=new Scanner(System.in);
        System.out.println("----------------Tree Creation-----------------");
        Node root=create();
        System.out.println("---------------------------------------");
        System.out.println("Inorder traversal of a tree:");
        inorder(root);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Preorder traversal of a tree:");
        preorder(root);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Postorder traversal of a tree:");
        postorder(root);
    }
    static Node create(){
        Node root=null;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter data=");
        int data=in.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter left child of "+data);
        root.left=create();
        System.out.println("Enter right child of "+data);
        root.right=create();
        return root;
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"->");
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;

    }
}





// Height,Count node,Max,Min Of a Binary Tree


// public class tree{
//     public static void main(String[] args) {
//         Node root=create();
//         System.out.println("Height of a Binary tree="+height(root));
//         System.out.println("Number of Node in a Binary tree="+countNode(root));
//         System.out.println("Maximum Value in a Binary tree="+maxValue(root));
//         System.out.println("Minimum value in a Binary tree="+minValue(root));
//     }
//     static Node create(){
//         Node root=null;
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         if(data==-1){
//             return null;
//         }
//         root=new Node(data);
//         System.out.println("Enter left child of "+data);
//         root.left=create();
//         System.out.println("Enter right child of "+data);
//         root.right=create();
//         return root;
//     }
//     static int height(Node root){
//         if(root==null){
//             return 0;
//         }
//         return (int)Math.max(height(root.left),height(root.right))+1;
//     }
//     static int countNode(Node root){
//         if(root==null){
//             return 0;
//         }
//         return countNode(root.left)+countNode(root.right)+1;
//     }
//     static int maxValue(Node root){
//         if(root==null){
//             return Integer.MIN_VALUE;
//         }
//         return Math.max(root.data,Math.max(maxValue(root.left),maxValue(root.right)));
//     }
//     static int minValue(Node root){
//         if(root==null){
//             return Integer.MAX_VALUE;
//         }
//         return Math.min(root.data,Math.min(minValue(root.left),minValue(root.right)));
//     }
// }
// class Node{
//     int data;
//     Node left,right;
//     Node(int data){
//         this.data=data;
//     }
// }




// Level Order Traversal


// public class tree{
//     public static void main(String[] args) {
//         Node root=create();
//         int h=height(root);
//         for(int i=1;i<=h;i++){
//             print(root,i);
//         }
//         System.out.println();
//         level(root);
//     }
//     static Node create(){
//         Node root=null;
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the data=");
//         int data=in.nextInt();
//         if(data==-1){
//             return null;
//         }
//         root=new Node(data);
//         System.out.println("Enter left child of "+data);
//         root.left=create();
//         System.out.println("Enter right child of "+data);
//         root.right=create();
//         return root;
//     }
//     static int height(Node root){
//         if(root==null){
//             return 0;
//         }
//         return Math.max(height(root.left),height(root.right))+1;
//     }
//     static void print(Node root,int l){
//         if(root==null){
//             return;
//         }
//         else if(l==1){
//             System.out.print(root.data+"->");
//         }
//         else if(l>1){
//             print(root.left,l-1);
//             print(root.right,l-1);
//         }
//     }
//     static void level(Node root){
//         Queue<Node> q=new ArrayDeque<>();
//         q.add(root);
//         while(!q.isEmpty()){
//             Node curr=q.poll();
//             System.out.print(curr.data+"->");
//             if(curr.left!=null){
//                 q.add(curr.left);
//             }
//             if(curr.right!=null){
//                 q.add(curr.right);
//             }
//         }
//     }
// }
// class Node{
//     int data;
//     Node left,right;
//     Node(int data){
//         this.data=data;
//     }
// }




// Left and Right View of Binary Tree



