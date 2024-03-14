import java.util.Scanner;

// public class Day7 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         String s1=in.nextLine();
//         String s2=in.nextLine();
//         String s=s1+" "+s2;
//         System.out.println(s);
//     }
// }




public class Day7{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a=n/m;
        System.out.println((int)a);
    }
}