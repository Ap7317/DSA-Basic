import java.util.Scanner;

// public class function{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the Value of n=");
//         int n=in.nextInt();
//         System.out.print("Enter the Value of r=");
//         int r=in.nextInt();
//         int ans1=npr(n,r);
//         System.out.println("Permutation of "+ n +" and " + r+" = "+ans1);
//         int ans2=ncr(n,r);
//         System.out.println("Combination of "+ n +" and "+ r+" = "+ans2);
//     }
//     public static int npr(int n,int r){
//            return fact(n)/fact(n-r);
//     }
//     public static int ncr(int n,int r){
//         return fact(n)/(fact(r)*fact(n-r));
     
//     }
//     public static int fact(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f*=i;
//         }
//         return f;
//     }
// }




// FREQUQNCY OF A DIGIT


// public class function{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         System.out.print("Enter the number for which you want to count the frequency=");
//         int x=in.nextInt();
//         int ans=freq(n,x);
//         System.out.println("Frequency of "+x+" in given number "+n+" is "+ans);
//     }
//     public static int freq(int n,int x){
//          int c=0;
//          while(n>0){
//             int a=n%10;
//             n=n/10;
//             if(a==x){
//                 c++;
//             }
//          }
//          return c;
//     }
// }




// INTRODUCTION TO NUMBER SYSTEM



// DECIMAL TO ANY BASE CONVERSION


// public class function{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         System.out.print("Enter the number in which base you want to change=");
//         int b=in.nextInt();
//         int ans=DTAB(n,b);
//         System.out.println(ans);
//     }
//     public  static int DTAB(int n,int b){
//         int c=0;
//         int i=0;
//         while(n>0){
//             c=c+((n%b)*(int)Math.pow(10,i));
//             n=n/b;
//             i++;
//         }
//         return c;
//     }
// }




// DECIMAL TO ANY BASE



// public class function{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the number=");
//         int n=in.nextInt();
//         System.out.print("Enter the current base of number=");
//         int b=in.nextInt();
//         int ans=DTAB(n,b);
//         System.out.println(ans);
//     }
//     public static int DTAB(int n,int b){
//         int c=0,i=0;
//         while(n>0){
//             c+=(n%10)*(int)Math.pow(b,i);
//             n=n/10;
//             i++;
//         }
//         return c;
//     }
// }


// ANY BASE TO ANY BASE


// public class function{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
        
//     }
// }