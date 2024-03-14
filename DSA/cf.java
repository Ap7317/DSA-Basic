import java.util.*;
public class cf {
    static Scanner in=null;
    public static void main(String[] args) {
        in=new Scanner(System.in);
        System.out.println("----------------Tree Creation-----------------");
        Node root=create();
        HashMap<Integer,List<Integer>> ans=new HashMap<>();
        get_value(root,0,ans);
        System.out.println(ans);
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
    static void get_value(Node root,int x,HashMap<Integer,List<Integer>> ans){
        if(root.data==-1) return;
        if(ans.containsKey(x)){
            List<Integer> l=ans.get(x);
            l.add(root.data);
            ans.put(x,l);
        }
        else{
            List<Integer> l=new ArrayList<>();
            l.add(root.data);
            ans.put(x,l);
        }
        get_value(root.left,x-1,ans);
        get_value(root.right,x+1,ans);
    }
}