import java.util.Scanner;
import java.util.*;



// Q1.ROOTS OF QUADRATICE QUATION

// public class D8{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter value of A, B and C:");
//         int A=in.nextInt();
//         int B=in.nextInt();
//         int C=in.nextInt();
//         int D=B*B-4*A*C;
//         int x1,x2;
//         if(D==0){
//             x1=x2=B/2;
//             System.out.println("Roots are real and equal.");
//             System.out.println("Roots are="+x1+","+x2);
//         }
//         else if(D>0){
//             int a=(int)Math.sqrt(D);
//             x1=(-B+a)/(2*A);
//             x2=(-B-a)/((2*A));
//             System.out.println("Roots are real and distinct.");
//             System.out.println("Roots are="+x1+","+x2);
//         }
//         else{
//             double a=(double)Math.sqrt(-D);
//             int c=(-B)/(2*A);
//             double b=a/(2*A);
//             System.out.println("Roots are Imaginary.");
//             System.out.println("Roots are="+c+"-"+b+"i"+","+c+"+"+b+"i");
//         }
//     }
// }



// Q2. FIND KTH DIGIT FOR A RAISED TO POWER B


// public class D8 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int a=in.nextInt();
//         int b=in.nextInt();
//         int k=in.nextInt();
//         int c=(int)Math.pow(a,b);
//         for(int i=1;i<=k;i++){
//             if(i==k){
//                 System.out.println(c%10);
//             }
//             c=c/10;
//         }
//     }
// }



// Q3.


// public class D8{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int sum=0;
//         while(n>9){
//             while(n>0){
//                 sum+=(n%10);
//                 n=n/10;
//             }
//             n=sum;
//             sum=0;
//         }
//         System.out.println(n);
//     }
// }



// Q4. BALANCED DIGIT


// public class D8{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int c=0;
//         int m=n;
//         while(m>0){
//             c++;
//             m=m/10;
//         }
//         if(c%2==0){
//             System.out.println("Given number is not balanced beacause it hava even digit.");
//         }
//         else{
//             int sum1=0,sum2=0;
//             for(int i=1;i<=c/2;i++){
//                 sum1+=n%10;
//                 n=n/10;
//             }
//             n=n/10;
//             for(int i=1;i<=c/2;i++){
//                 sum2+=n%10;
//                 n=n/10;
//             }
//             if(sum1==sum2){
//                 System.out.println("Given number is balanced");
//             }
//             else{
//                 System.out.println("Given Number is not balanced.");
//             }
//         }
//     }
// }



//5. lEAST PRIME FACTOR FOR ALL NUMBER FROM 1TO N


public class D8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=in.nextInt();
        for(int j=2;j<=n;j++){
            int c=0;
            for(int i=2;i<=j;i++){
                if(j%i==0){
                    c++;
                }
            }
            if(c==1){
              for(int i=2;i<=j;i++){
                if(j%i==0){
                    System.out.print(i);
                    break;
                }
              }  
            }
        }
    }
}


// Q6.LARGEST POSSIBLE AREA OF RECTANGLE INSIDE A CIRCLE(SQUARE IS LARGEST POSSIBLE AREA FOR RECTANGLE IN CIRCLE)


// public class D8{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter radius of circle=");
//         int r=in.nextInt();
//         double s=r*Math.sqrt(2);
//         System.out.println("Largest Possible area for rectangle="+s*s);
//     }
// }

// Q7. ALL PRIME FACTORS


// public class D8{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the Number=");
//         int n=in.nextInt();
//         for(int i=1;i<=n;i++){
//             int c=0;
//             if(n%i==0){
//                 for(int j=1;j<=n;j++){
//                     if(i%j==0){
//                         c++;
//                     }
//                 }
//             }
//             if(c==2){
//                 System.out.println(i);
//             }
//         }
//     }
// }


