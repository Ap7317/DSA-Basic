package STACK;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// public class Stack_ques {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of element in array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.println(Arrays.toString(prev_smaller(arr)));
//     }
//     public static int[] prev_smaller(int[] arr){
//         Stack<Integer> st=new Stack<>();
//         int [] arr1=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             while(st.size()!=0 && st.peek()>=arr[i]){
//                 st.pop();
//             }
//             if(st.size()==0){
//                 arr1[i]=-1;
//             }
//             else{
//                 arr1[i]=st.peek();
//             }
//             st.push(arr[i]);
//         }
//         return arr1;
//     }
// }

// Largest area Histogram

// public class Stack_ques{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number of element=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int max=0;
//         for(int i=0;i<n;i++){
//             int left=i,right=i;
//             while(left>=0 &&arr[left]>=arr[i]){
//                 left--;
//             }
//             while(right<=n-1 && arr[right]>=arr[i]){
//                 right++;
//             }
//             int ans=(right-left-1)*arr[i];
//             if(max<ans){
//                 max=ans;
//             }
//         }
//         System.out.println(max);
//     }
// } 



public class Stack_ques{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of element=");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            int left=i,right=n-1;
            while(arr[right]<arr[i]){
                right--;
            }
            int area=(right-left-1)*arr[i];
            if(max<area){
                max=area;
            }
        }
        System.out.println(max);
    }
}