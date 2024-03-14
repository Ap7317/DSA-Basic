import java.util.*;
import java.util.Scanner;
// Q 1. SPAN  OF ARRAY(Difference of Maximum and Minimum in an Array)

// public class oneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Enter array elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int max=arr[0];
//         int min=arr[n-1];
//         for(int i=0;i<n;i++){
//             if(max<arr[i])
//             {
//                 max=arr[i];
//             }
//             if(min>arr[i]){
//                 min=arr[i];
//             }
//         }
//         System.out.println("Maximum value in given array="+max);
//         System.out.println("Minimum value in given array="+min);
//         System.out.println("Difference of maximum and minimum value="+(max-min));
//     }
// }




// Q2. FIND AN ELEMENT IN AN ARRAY

// public class oneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         System.out.println("Array elements are:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.print("Enter the elements which you want to search=");
//         int key=in.nextInt();
//         int f=0;
//         for(int i=0;i<n;i++){
//             if(key==arr[i]){
//                 System.out.println("The position of element in given array="+(i+1));
//                 f++;
//                 break;
//             }
//         }
//         if(f==0){
//             System.out.println("The given element is not found");
//         }
//     }
// }



// Q 3. BAR CHART(PRINT * ACCORDING TO EACH ARRAY ELEMENTS)


// public class oneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of array=");
//         int n=in.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter array elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(max<arr[i]){
//                 max=arr[i];
//             }
//         }
//         for(int i=max;i>=1;i--){
//             for(int j=0;j<n;j++){
//                 if(arr[j]>=i){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print("\t");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// Q 2. SUM TWO ARRAY ELEMENTS


// public class oneDarr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter size of array1=");
//         int m=in.nextInt();
//         System.out.print("Enter size of array2=");
//         int n=in.nextInt();
//         int[] arr1=new int[m];
//         int[] arr2=new int[n];
//         System.out.println("Enter array1 elements:");
//         for(int i=0;i<m;i++){
//             arr1[i]=in.nextInt();
//         }
//         System.out.println("Enter array2 elements:");
//         for(int i=0;i<n;i++){
//             arr2[i]=in.nextInt();
//         }
//         int max;
//         if(m>n){
//             max=m;
//         }
//         else{
//             max=n;
//         }
//         int arr[]=new int[max+1];
//         int j=m-1;
//         int k=n-1;
//         int c=0;
//         for(int i=max;i>=1;i--){
//             int sum=c;
//             if(j>=0){
//                 sum+=arr1[j];
//             }
//             if(k>=0){
//                 sum+=arr2[k];
//             }
//             arr[i]=sum%10;
//             c=sum/10;
//             j--;
//             k--;
//         }
//         if(c!=0){
//             arr[0]=c;
//             for(int i=0;i<=max;i++){
//                 System.out.println(arr[i]);
//             }
//         }
//         else{
//             for(int i=1;i<=max;i++){
//                 System.out.println(arr[i]);
//             }
//         }
        
//     }
// }




// DIFFERNCE OF TWO ARRAY ELEMENTS



