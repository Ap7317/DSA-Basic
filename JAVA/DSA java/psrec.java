import java.util.*;
import java.util.function.DoubleSupplier;


// Q1. Check a number is pallindrome or not. 

// public class psrec {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         int ans=0;
//         int rev=pallin(n,ans);
//         System.out.println(rev);
//         if(n==rev){
//             System.out.println("The given number is a Pallindrome.");
//         }
//         else{
//             System.out.println("The given number is not a Pallindrome.");
//         }
//     }
//     public static int pallin(int n,int ans){
//         if(n==0){
//             return  ans;
//         }
//         ans=(ans*10)+n%10;
//         return pallin(n/10,ans); 
//     }
// }



// Q2. MEAN AND MEADIAN USING RECURSION

// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the size of number:");
//         int n=in.nextInt();
//         System.out.println("Enter the numbers:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         double ans1=mean(arr,n);
//         System.out.println("Mean="+ans1);
//         double ans2=median(arr,n);
//         System.out.println("Median="+ans2);
//     }
//     public static double mean(int arr[] ,int n){
//         float sum=0;
//           for(int i=0;i<n;i++){
//             sum+=arr[i];
//           }
//           return (double)sum/(double)n;   
//     }
//     public static double median(int arr[] ,int n){
//         Arrays.sort(arr);
//         if(n%2==0){
//             return (double)arr[n/2];
//         }
//         return (double)(arr[(n-1)/2]+arr[n/2])/2;
//     }
// }


// Q3. FACTORIAL USING TAIL RECURSION

// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         int r=1;
//         int ans=fact(n,r);
//         System.out.println(ans);
//     }
//     public static int fact(int n,int r){
//         if(n==1){
//             return r;
//         }
//         return fact(n-1,r*n);
//     }
// }


// Q  CALCULATE POWER USING DIVIDE AND CONQUER


// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the base value=");
//         int x=in.nextInt();
//         System.out.print("Enter the power value=");
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






// All perfect number 

// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter initial range=");
//         int m=in.nextInt();
//         System.out.print("Enter last range=");
//         int n=in.nextInt();
//         perfect(n,m);
//     }
//     public static void perfect(int n,int m){
//         int k=0;
//         for(int i=m;i<=n;i++){
//             int sum=0;
//             for(int j=1;j<=i/2;j++){
//                 if(i%j==0){
//                     sum+=j;
//                 }
//             }
//             if(sum==i){
//                 System.out.println(i);
//                 k++;
//             }
//         }
//         if(k==0){
//             System.out.println("There is no perfect number in given range");
//         }
//     }
// }



// HCF and LCM OF Two Number

// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the Number:");
//         int a=in.nextInt();
//         int b=in.nextInt();
//         int ans1=gcd(a,b);
//         int ans2=lcm(a,b);
//         System.out.println("GCD of "+a+" and "+b+" are "+ans1);
//         System.out.println("LCM of "+a+" and "+b+" are "+ans2);
//     }
//     public static int gcd(int a,int b){
//         int c=0;
//         for(int i=a;i>=1;i--){
//             if(a%i==0 && b%i==0){
//                 c+=i;
//                 break;
//             }
//         }
//         return c;
//     }
//     public static int lcm(int a,int b){
//         int d=1;
//         for(int i=a;i>=1;i--){
//             if(a%i==0 && b%i==0){
//                d*=(a*b)/i;
//                break;
//             }
//         }
//         return d;
//     }
// }




// Nth FIBONACCI NUMBER

// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int ans=fib(n);
//         System.out.println(ans);
//     }
//     public static int fib(int n){
//         if(n==1){
//             return 0;
//         }
//         if(n==2){
//             return 1;
//         }
//         return fib(n-1)+fib(n-2);
//     }
// }




// PRIME NUMBER IN GIVEN RANGE


// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter initial range=");
//         int m=in.nextInt();
//         System.out.print("Enter last range=");
//         int n=in.nextInt();
//         prime(m,n);
//     }
//     public static void prime(int m,int n){
//         int k=0;
//         for(int i=m;i<=n;i++){
//             int c=0;
//             for(int j=1;j<=i;j++){
//                 if(i%j==0){
//                     c++;
//                 }
//             }
//             if(c==2){
//                 k++;
//                 System.out.println(i);
//             }
//         }
//         if(k==0){
//             System.out.println("No number is found between given range");
//         }
//    }
// }





// ARMSTRONG NUMBER IN GIVEN RANGE



// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter initial range=");
//         int m=in.nextInt();
//         System.out.print("Enter last range=");
//         int n=in.nextInt();
//         arm(n,m);
//     }
//     public static void arm(int n,int m){
//         int k=0;
//         for(int i=m;i<=n;i++){
//             int sum=0;
//             int b=i;
//             while(b>0){
//                 sum+=((b%10)*(b%10)*(b%10));
//                 b=b/10;
//             }
//             if(sum==i){
//                 k++;
//                 System.out.println(i);
//             }
//         }
//         if(k==0){
//             System.out.println("No Armstrong Number present in given range");
//         }
//     }
// }




// STRONG NUMBER LESS THAN N


// public class psrec{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the value of n=");
//         int n=in.nextInt();
//         Strong(n);
//     }
//     public static void Strong(int n){
//         int k=0;
//         for(int i=1;i<n;i++){
//             int b=i;
//             int sum=0;
//             while(b>0){
//                 sum+=fact(b%10);
//                 b=b/10;
//             }
//             if(i==sum){
//                 k++;
//                 System.out.println(i);
//             }
//         }
//         if(k==0){
//             System.out.println("No Strong Number present in given range");
//         }
//     }
//     public static int fact(int i){
//         if(i==0){
//             return 1;
//         }
//         return i*fact(i-1);
//     }
// }