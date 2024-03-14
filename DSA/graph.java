import java.util.*;



// 1.Input Output of a graph Using Adjacency List


public class graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int sc,int dn){
        adj.get(sc).add(dn);
        adj.get(dn).add(sc);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+":");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+"->");
            }
            System.out.println();
        }
    }
    static void BFS(ArrayList<ArrayList<Integer>> adj,int s){
        boolean[] vis=new boolean[adj.size()];
        Queue<Integer> q=new ArrayDeque<>();
        q.add(s);
        vis[s]=true;
        int c=q.size();
        while(c!=0){
           s=q.poll();
           System.out.print(s+"->"); 
           for(Integer neigh:adj.get(s)){
             if(!vis[neigh]){
                 vis[neigh]=true;
                 q.add(neigh);
             }
           }
           c=q.size();
        }
    }
    static ArrayList<Integer> DFS(int V, ArrayList<ArrayList<Integer>> adj) {        
        ArrayList<Integer> ans=new ArrayList<>(); 
        boolean vis[]= new boolean[V];
        dfsvisit(0,adj,vis,ans);
        return ans; 
    }
    static void dfsvisit(int node, ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> ans){
        vis[node]=true; 
        ans.add(node); 
        for(Integer neighbour:adj.get(node)){
            if(vis[neighbour]==false){
                dfsvisit(neighbour,adj,vis,ans);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of vertices=");
        int v=in.nextInt();
        System.out.print("Enter the number of edges=");
        int e=in.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        System.out.println("Enter the edges:");
        for(int i=0;i<e;i++){
            System.out.print("Enter the source vertex=");
            int sc=in.nextInt();
            System.out.print("Enter the destination vertex=");
            int dn=in.nextInt();
            addEdge(adj,sc,dn);
        }
        System.out.println("Adjaceney List:");
        printGraph(adj);
        System.out.println("BFS traversal of a graph:");
        BFS(adj,2);
        System.out.println();
        System.out.println("DFS traversal of a graph:");
        List<Integer> l=new ArrayList<>();
        l=DFS(v,adj);
        System.out.println(l);
   }
}




// 2. Graph Implementation of weighted graph using Adjacency List


// public class graph{
//     static void addEdge(List<List<Integer>> adj,int sc,int dn){
//         adj.get(dn).add(sc);
//         adj.get(sc).add(dn);
//     }
//     public void Edge(int dn,int w){
//         this.dn=dn;
//         this.w=w;
//     }
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of vertex=");
//         int v=in.nextInt();
//         System.out.print("Enter the number of edges=");
//         int e=in.nextInt();
//         List<List<Integer>> adj=new ArrayList<>(v);
//         for(int i=0;i<v;i++){
//             adj.add(new ArrayList<Integer>());
//         }
//         for(int i=0;i<e;i++){
//             System.out.print("Enter the source vertex:");
//             int sc=in.nextInt();
//             System.out.print("Enter the destination vertex=");
//             int dn=in.nextInt();
//             System.out.print("Enter the edge weight=");
//             int w=in.nextInt();
//             Edge edge=new Edge(dn,w);
//             addEdge(adj,sc,dn);
//         }
//     }
// }


// Graph Implementation using Adjacency Matrix


// public class graph{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of vertex=");
//         int v=in.nextInt();
//         System.out.println("Enter the number of edges=");
//         int e=in.nextInt();
//         int[][] arr=new int[v][v];
//         for(int i=0;i<e;i++){
//             System.out.print("Enter the source=");
//             int sc=in.nextInt();
//             System.out.print("Enter the destination=");
//             int dn=in.nextInt();
//             arr[sc][dn]=1;
//             arr[dn][sc]=1;
//         }
//         int i=0;
//         System.out.print(" ");
//         for(int j=0;j<v;j++){
//             System.out.print("  "+j);
//         }
//         System.out.println();
//         for(int[] r:arr){
//             System.out.println(i+" "+Arrays.toString(r));
//             i++;
//         }
//     }
// }




public class graph{
    public static void main(String[] args) {
        int n=12;
        List<Integer> l=new ArrayList<>();
        l=arr(n);
        int i=0,j=1;
        int max=l.get(j);
        int k=j,count=0;
        for(int z=0;z<l.size()-1;z++){
            if(l.get(z)>l.get(z+1)){
                count++;
            }
        }
        System.out.println(count);
        if(count==l.size()-2 && count>0){
            System.out.println(n);
        }
        while(i<l.size()-1 && j<l.size()){
            if(l.get(i)>=l.get(j)){
                i++;
                j++;
                if(j<=l.size()-1){
                    max=l.get(j);
                }
            }
            else{
                if(max<l.get(j)){
                    max=l.get(j);
                    k=j;
                }
                j++;
            }
        }
        System.out.println(i+" "+k);
        int a=l.get(i);
        l.set(i,l.get(k));
        l.set(k,a);
        System.out.println(l);
        StringBuilder str=new StringBuilder();
        for(i=0;i<l.size();i++){
            str.append(l.get(i));
        }
        String s=str.toString();
        int ans=Integer.parseInt(s);
        System.out.println(ans);
    }   
    static List<Integer> arr(int n){
        List<Integer> l=new ArrayList<>();
        l.add(n%10);
        n=n/10;
        while(n>0){
            l.add(0,n%10);
            n=n/10;
        }
        return l;
    }         
}