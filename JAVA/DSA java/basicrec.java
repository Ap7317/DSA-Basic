import java.util.Scanner;

// Print number in Decresing order By a Given Number

// public class basicrec {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         pd(n);
//     }
//     public static void pd(int n){
//         System.out.println(n);
//         if(n==0){
//             return;
//         }
//         pd(n-1);
//     }
// }




// Print number in increasing order till n

// public class basicrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         int k=0;
//         pi(n,k);
//     }
//     public static void pi(int n,int k){
//         System.out.println(k);
//         if(k==n){
//             return;
//         }
//         pi(n,k+1);
//     }
// }



// Print Decresing number and increasing for a given number n

// public class basicrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         pdi(n);
//     }
//     public static void pdi(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         pdi(n-1);
//         System.out.println(n);
//     }
// }



// FACTOTRIAL OF A NUMBER

// public class basicrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         int ans=factorial(n);
//         System.out.println(ans);
//     }
//     public static int factorial(int n){
//         if(n==1){
//             return 1;
//         }
//         return n*factorial(n-1);
//     }
// }




// linear power

// public class basicrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the Base Value=");
//         int x=in.nextInt();
//         System.out.print("Enter the number of power=");
//         int n=in.nextInt();
//         int ans=power(x,n);
//         System.out.println(ans);
//     }
//     public static int power(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         return x*power(x,n-1);
//     }
// }




//  Power using logarithimic(Divide and Conquer)

// public class basicrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the base value Number=");
//         int x=in.nextInt();
//         System.out.print("Enter the power value number=");
//         int n=in.nextInt();
//         int ans=power(x,n);
//         System.out.println(ans);
//     }
//     public static int power(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         if(n%2!=0){
//             return x*power(x,n/2)*power(x,n/2);
//         }
//         return power(x,n/2)*power(x,n/2);
//     }
// }



