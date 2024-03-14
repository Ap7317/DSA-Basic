import java.util.*;


// PRINT Z USING PRINT STATEMENT*


// public class BASIC {
//     public static void main(String[] args) {
//         System.out.println("* * * * * *");
//         System.out.println("        * ");
//         System.out.println("      *");
//         System.out.println("    *");
//         System.out.println("  * ");
//         System.out.println("* * * * * *");
//         System.out.println("* * * * * *\n"+"        * \n"+"      *\n"+"    *\n"+"  *\n"+"* * * * * *");
//     }
// }

// POWER USING TAIL RECURSION

// public class BASIC{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter base=");
//         int b=in.nextInt();
//         int a=1;
//         System.out.print("Enter power=");
//         int n=in.nextInt();
//         int ans=pow(b,n,a);
//         System.out.println(ans);
//     }
//     public static int pow(int b,int n,int a){
//         if(n==0){
//             return a;
//         }
//         return pow(b,n-1,b*a);
//     }
// }