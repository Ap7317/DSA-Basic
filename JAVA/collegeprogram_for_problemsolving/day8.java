package collegeprogram_for_problemsolving;

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n=in.nextInt();
        int a=0;
        while(a>9){
            n=n%10;
            n=n/10;
        }
        System.out.println(n);=;

    }
}
