import java.util.*;

// public class string {
//     public static void main(String[] args) {
//         Scanner in =new Scanner(System.in);
//         String s=in.nextLine();
//         System.out.println(s);
//         System.out.println(s.length());
//         System.out.println(s.charAt(5));
//         System.out.println(s.substring(3,10));
//     }
// }



// All Possible Substring of a String

// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s=in.nextLine();
//         int c=0;
//         for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<=s.length();j++){
//             System.out.println(s.substring(i,j));
//             c++;
//            }    
//         }
//         System.out.println(c);
//     }
// }



// Add Two String

// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter both the String:");
//         String s1=in.nextLine();
//         String s2=in.nextLine();
//         String s3=new String();
//         s3=s1+" "+s2;
//         System.out.print("Concatenation of two String=");
//         System.out.println(s3);
//         System.out.println(s1.concat(s2));
//     }
// }



// Split a String After Space

// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the string");
//         String s=in.nextLine();
//         String[] parts=s.split(" ");
//         for(int i=0;i<parts.length;i++){
//             System.out.println(parts[i]);
//         }
//     }
// }




// PRINT ALL SUBSTRING WHICH ARE PALLINDROME


// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the String=");
//         String s=in.nextLine();
//         ans(s);
//     }
//     public static void ans(String s){
//         System.out.println("Substring whcih are pallindrome:");
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++){
//                 String ss=s.substring(i,j);
//                 if(Pallindrome(ss)==true){
//                     System.out.println(s.substring(i,j));
//                 }
//             }
//         }
//     }
//     public static boolean Pallindrome(String ss){
//         int i=0;
//         int j=ss.length()-1;
//         while(i<=j){
//             char s1=ss.charAt(i);
//             char s2=ss.charAt(j);
//             if(s1!=s2){
//                 return false;
//             }
//             else{
//                 i++;
//                 j--;
//             }
//         }
//         return true;
//     }
// }


// COMPARIOSION OF TWO STRING

// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s1=in.nextLine();
//         String s2=in.nextLine();
//         if(s1.equals(s2)){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }
//     }
// }

// STRING BUILDER CLASS

// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s=in.nextLine();
//         StringBuilder s1=new StringBuilder(s);
//         System.out.println(s1);
//         System.out.println(s1.charAt(5));      
//         System.out.println(s1.insert(3,'p'));
//         s1.setCharAt(2,'A');
//         System.out.println(s1);
//         System.out.println(s1.deleteCharAt(0));
//         System.out.println(s1.append('m'));
//     }
// }



// COMPRESSED A STRING (LEETCODE)


public class string{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=s.charAt(0);
        for(int i=0;i<s.length();i++){
            
        }

    }
}

