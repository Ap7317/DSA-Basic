package recursion;

import java.util.*;

// Print all natural number from 1 to n(Print Increasing)

// public class basic {
//     public static void main(String[] args) {
//         PI(5);
//     }
//     static void PI(int n){
//         if(n==0){
//             return;
//         }
//         PI(n-1);
//         System.out.print(n+" ");
//     }
// }



// Print all natural number from n to 1


// public class basic{
//     public static void main(String[] args) {
//         PD(7);
//     }
//     static void PD(int n){
//         if(n==0){
//             return;
//         }
//         System.out.print(n+" ");
//         PD(n-1);
//     }
// }




// Combination Sum

// public class basic{
//     public static void main(String[] args) {
//         int[] arr={4,2,1};
//         int t=19;
//         List<List<Integer>> ans=new ArrayList<>();
//         List<Integer> l=new ArrayList<>();
//         combi(arr,ans,l,t,0);
//         System.out.println(ans.size());
//     }
//     static void combi(int[] arr,List<List<Integer>> ans,List<Integer> l,int t,int n){
//         if(n==arr.length){
//             if(t==0){
//                 ans.add(new ArrayList<>(l));
//             }
//             return;
//         } 
//         if(arr[n]<=t){
//             l.add(arr[n]);
//             combi(arr,ans,l,t-arr[n],n);
//             l.remove(l.size()-1);
//         }
//         combi(arr,ans,l,t,n+1);
//     } 
// }




// public class basic{
//     public static void main(String[] args) {
//         int n=4,k=2;
//         List<List<Integer>> ans=new ArrayList<>();
//         combi(n,k,ans,new ArrayList<>(),1);
//         System.out.println(ans);
//     }
//     static void combi(int n,int k,List<List<Integer>> ans,List<Integer> l,int idx){
//         if(idx>n){
//             if(l.size()==k){
//                 ans.add(new ArrayList<>(l));
//             }
//             return;
//         }
//         if(l.size()<k){
//             l.add(idx);
//             combi(n,k,ans,l,idx+1);
//             l.remove(l.size()-1);
//         }
//         combi(n,k,ans,l,idx+1);
//     }
// }





// Combination Sum-III

// public class basic{
//     public static void main(String[] args) {
//         int n=7,k=3;
//         List<List<Integer>> ans=new ArrayList<>();
//         combi(n,k,ans,new ArrayList<>(),1);
//         System.out.println(ans);
//     }
//     static void combi(int n,int k,List<List<Integer>> ans,List<Integer> l,int idx){
//         if(idx==10){
//             if(n==0 && k==l.size()){
//                 ans.add(new ArrayList<>(l));
//             }
//             return;
//         }
//         if(idx<=n){
//             l.add(idx);
//             combi(n-idx,k,ans,l,idx+1);
//             l.remove(l.size()-1);
//         }
//         combi(n,k,ans,l,idx+1);
//     }
// }



// public class basic{
//     public static void main(String[] args) {
//         int[] arr={4,2,1};
//         int n=19;
//         int[] dp=new int[n+1];
//         Arrays.fill(dp,-1);
//         System.out.println(combi(arr,n,dp));
//     }
//     static int combi(int[] arr,int n,int[] dp){
//         if(n==0){
//             return 1;
//         }
//         if(n<0) return 0;
//         if(dp[n]!=-1) return dp[n];
//         int ans=0;
//         for(int i=0;i<arr.length;i++){
//             ans+=combi(arr,n-arr[i],dp);
//         }
//         dp[n]=ans;
//         return dp[n];
//     }
// }


public class basic{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            String ans="";
            in.nextLine();
            String s=in.nextLine();
            int i=0;
            while(i<n){
                ans+=s.charAt(i);
                i++;
                if(ans.equals(s)) System.out.println(true);
                System.out.println(ans);
                int a=ans.length();
                ans+=ans;
                i+=a;
            }
            System.out.println(ans);
            if(ans.equals(s)) System.out.println(true);
            else System.out.println(false);
        }
    }
    
}