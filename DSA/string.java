import java.math.BigInteger;
import java.util.*;
// Substring of a String

// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the string=");
//         String s=in.nextLine();
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<s.length()+1;j++){
//                 System.out.print(s.substring(i,j)+" ");
//             }
//         }
//     }
// }




// Valid Anagram


// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter string1=");
//         String s1=in.nextLine();
//         System.out.print("Enter the string2=");
//         String s2=in.nextLine();
//         int[] arr1=count(s1);
//         int[] arr2=count(s2);
//         boolean ans=anagram(arr1,arr2);
//         System.out.println(ans);
//     }
//     public static int[] count(String s){
//         int[] arr=new int[27];
//         for(int i=0;i<s.length();i++){
//             arr[s.charAt(i)-96]+=1;
//         }
//         return arr;
//     }
//     public static boolean anagram(int[] arr1,int[] arr2){
//         for(int i=1;i<27;i++){
//             if(arr1[i]!=arr2[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }



/* 
String Builder

1.CREATION OF STRING BUILDER
StringBuilder str=new StringBuilder();


2.ADD IN LAST OF STRING
str.append(string name)


3.MODIFY THE VALUE OF A STRING
str.setcharAt(index,character)


4.INSERT AT ANY INDEX
str.insert(index,string)


5.DELETE SOME CHARACTER FROM STRING
str.deletecharAt(index)


6.REVERSE A STRING
str.reverese()


7.DELETE A SUBSTRING FROM A STRING
str.delete(start index,end index+1)


8.OTHER FUNCTIONS WHICH ARE USED IN STRING BUILDER ARE:
(i)-str.length()
(ii)-str.substring(start index,end index+1)


9. ASCII VALUE OF A=65


10. ASCII VALUE OF a=97


11.DIFFERENCE BETWEEN A and a ASCII VALUE=32


12. STRING BUILDER INPUT
StringBuilder str=new StringBuilder(in.nextLine());


13. We can not use equals method in StringBuilder beacuse we can not compare string in StringBuilder
**/



// QUESTIONS


// Q1. SWAPCASE OF GIVEN WORD(LOWERCASE ALPHABET TO UPPERCASE AND VICE VERSA)


// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the string=");
//         StringBuilder str=new StringBuilder(in.nextLine());
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
//                 char ch=(char)((int)str.charAt(i)+32);
//                 str.setCharAt(i,ch);
//             }
//             else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
//                 char ch=(char)((int)str.charAt(i)-32);
//                 str.setCharAt(i,ch);
//             }
//             else{
//                 continue;
//             }
//         }
//         System.out.println(str);
//     }
// }




// Q3. FIND NUMBER OF PALLINDROMIC SUBSTRING IN A STRING



// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the string=");
//         StringBuilder str=new StringBuilder(in.nextLine());
//         int ans=0;
//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length()+1;j++){
//                 StringBuilder s=new StringBuilder(str.substring(i, j));
//                 if(pallin(s)==true){
//                     System.out.println(s);
//                     ans++;
//                 }
//             }
//         }
//         System.out.println(ans);
//     }
//     public static boolean pallin(StringBuilder s){
//         int i=0,j=s.length()-1;
//         while(i<=j){
//             if(s.charAt(i)!=s.charAt(j)){
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



// Q4. REVERSE EACH WORD IN A STRING


// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the String=");
//         StringBuilder str=new StringBuilder(in.nextLine());
//         StringBuilder ans=new StringBuilder();
//         str.append(' ');
//         int j=0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==' '){
//                 String s=str.substring(j,i+1);
//                 StringBuilder s1=new StringBuilder(s);
//                 ans.append(s1.reverse());
//                 j=i+1;
//             }
//         }
//         ans.deleteCharAt(0);
//         System.out.println(ans+" "+ans.length());
//     }
//     public static StringBuilder reverse(StringBuilder s){
//         return s.reverse();
//     }
// }



// 5. COMPRESSED THE GIVEN STRING(LE/ETCODE)

// public class string{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the String=");
//         String s=in.nextLine();
//         Stack<Character> st=new Stack<>();
//         st.push(s.charAt(0));
//         for(int i=1;i<s.length();i++){
//             if(st.peek()!=s.charAt(i)){
//                 st.push(s.charAt(i));
//             }
//         }
//         StringBuilder str=new StringBuilder();
//         for(char c:st){
//             str.append(c);
//         }
//         System.out.println(str.toString());
//     }
// }




// public class string{
//     public static void main(String[] args) {
//         int[] arr={1,2,3};
//         permut(arr);
//         System.out.println(Arrays.toString(arr));
//     } 
//     public static int[] permut(int[] arr){
//         for(int i=arr.length-1;i>0;i--){
//             if(arr[i-1]<arr[i]){
//                 Arrays.sort(arr,i,arr.length);
//                 for(int k=i;k<arr.length-1;k++){
//                     if(arr[i-1]<arr[k]){
//                         int a=arr[i-1];
//                         arr[i-1]=arr[k];
//                         arr[k]=a;
//                         break;
//                     }
//                 }
//             }
//             break;
//         }
//         return arr;
//     }
// }




public class string{
    public static void main(String[] args) 
    {
        String s="0100";
        StringBuilder str=new StringBuilder();
        int c=0;
        str.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(str.charAt(i-1)=='1' && s.charAt(i)=='1'){
                str.append('0');
                c++;
            }
            else if(str.charAt(i-1)=='1'){
                str.append('0');
            }
            else if(str.charAt(i-1)=='0' && s.charAt(i)=='0'){
                str.append('1');
                c++;
            }
            else{
                str.append('1');
            }
        }
        System.out.println(c);
    }   
}