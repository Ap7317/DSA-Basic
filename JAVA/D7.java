import java.util.Scanner;
import java.util.*;


// Q1. LENGTH OF STRING WITHOUT USER DEFINED FUNCTION

// public class D7 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s=in.nextLine();
//         int i=0,c=0;
//         String s1=s+'\0';
//         while(s1.charAt(i)!='\0'){
//             c++;
//             i++;
//         }
//         System.out.println(c);
//     }
// }




// Q2.  REVERSING STRING WITHOUT USER DEFINED FUNCTION

// public class D7{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s=in.nextLine();
//         int i=0,c=0;
//         String s1=s+'\0';
//         while(s1.charAt(i)!='\0'){
//             c++;
//             i++;
//         }
//         for(int j=c-1;j>=0;j--){
//             System.out.print(s.charAt(j));
//         }
//     }
// }



// Q3.CHECK THAT A STRING IS PALLINDROME OR NOT


// public class D7{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s=in.nextLine();
//         if(isPallin(s)==true){
//             System.out.println("Given String is a Pallindrome.");
//         }
//         else{
//             System.out.println("Given String is not a Pallindrome.");
//         }
//     }
//     public static boolean isPallin(String s){
//         int i=0;
//         int j=s.length()-1;
//         while(i<=j){
//             char c1=s.charAt(i);
//             char c2=s.charAt(j);
//             if(c1!=c2){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }



// Q4.WORD COUNTER IN A PROGRAM

// public class D7{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String p=in.nextLine();
//         int n=p.length();
//         int c=0;
//         for(int i=0;i<n;i++){
//             if(p.charAt(i)==' '){
//                 c++;
//             }
//         }
//         System.out.println(c+1);
//     }
// }




// Q5. PROGRAM TO COVERT ALL LOWERCASE TO UPPER CASE AND VICE-VERSA


