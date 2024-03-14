
import java.util.Scanner;
import java.util.*;
// BIGGEST OF THREE
// public class day1 {
//     public static void main(String[] args) {
//         Scanner k=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a=k.nextInt();
//         int b=k.nextInt();
//         int c=k.nextInt();
//         int big=(a>b)?(a>c?a:c):(b>c?b:c);
//         System.out.println("Biggest between these is "+big);
//     }
// }



//LEAP OR NOT
// public class day1{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the year");
//         int year=in.nextInt();
//         if(year%4==0 && year%400==0 || year%100!=0){
//             System.out.println("Leap year");
//         }
//         else{
//             System.out.println(" Not a Leap year");
//         }
//     }
// }




// MESSAGE ACCORDING TO TEMPERATURE

// public class day1{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the temperature in centigrade");
//         int temp=in.nextInt();
//         if(temp<0){
//             System.out.println("Freezing weather");
//         }
//         else if(temp>0 && temp<=10){
//             System.out.println("Very cold weather");
//         }
//         else if(temp>10 && temp<=20){
//             System.out.println("Cold weather");
//         }
//         else if(temp>20 && temp<=30){
//             System.out.println("Normal in temperature");
//         }
//         else if(temp>30 && temp<=40){
//             System.out.println("Its Hot");
//         }
//         else{
//             System.out.println("Its Very Hot");
//         }
        
//     }
// }




// TOTAL SALARY

// public class day1{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the basic salary ");
//         int basic=in.nextInt();
//         double hra=.2*basic;
//         double da=.5*basic;
//         double pf=.11*basic;
//         int allow;
//         String grade=in.nextLine();
//         if(grade=="A"){
//             allow=1700;
//         }
//         else if(grade=="B"){
//             allow=1500;
//         }
//         else{
//             allow=1300;
//         }
//         double total_salary=basic+hra+da+allow-pf;
//         int ts=(int) total_salary;     //--TO CONVERT DOUBLE INTO INT
//         System.out.println("Total salary is "+ts);
//     }
// }




// FIND QUADRANT BY COORDINATES POINT


// public class day1{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the coordinate point");
//         int x=in.nextInt();
//         int y=in.nextInt();
//         if(x>0 && y>0){
//             System.out.println("First quadrant");
//         }
//         else if(x<0 && y>0){
//             System.out.println("Second quadrant");
//         }
//         else if(x<0 && y<0){
//             System.out.println("Third quadrant");
//         }
//         else if(x>0 && y<0){
//             System.out.println("Fourth quadrant");
//         }
//         else{
//             System.out.println("Origin");
//         }
//     }
// }





// TYPE OF TRIANGLE

// public class day1{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the side length of triangle");
//         int a=in.nextInt();
//         int b=in.nextInt();
//         int c=in.nextInt();
//         if(a==b && b==c){
//             System.out.println("Equilateral Triangle");
//         }
//         else if(a==b || b==c){
//             System.out.println("Isoceles Triangle");
//         }
//         else{
//             System.out.println("Scalene Triangle");
//         }
//     }
// }


// VOWEL OR CONSONANT

// public class day1{
//      public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         char s=in.next().charAt(0);
//         if(s=='a' || s=='e' || s=='i' || s=='o' ||  s=='u'){
//          System.out.println("Vowel");
//         }
//         else if (s>='a' && s<='z' && (s!='a' || s!='e' || s!='i' || s!='o' || s!='u')){
//          System.out.println("Consonant");
//         }
//         else{
//          System.out.println("It is not a alphabet");
//         }
//      }
// }



//  BY A GIVEN DATE FIND THE DAY
// Zeller's Rule formula ,F=K+[(13*M-1)/5]+D+(D/4)+(C/4)-2C

// public class day1{
//    public static void main(String[] args) {
//       Scanner in=new Scanner(System.in);
//       int K=in.nextInt();
//       int  M=in.nextInt();
//       int N=in.nextInt();
//       int D,C;
//       D=N%100;
//       C=N/100;
//       int F=K+(13*M-1)/5+D+D/4+C/4-2*C;
//       int A=F%7;
//       if(A==1){
//          System.out.println("Wednesday");
//       }
//       else if(A==2){
//          System.out.println("Thursday");
//       }
//       else if(A==3){
//          System.out.println("Friday");
//       }
//       else if(A==4){
//          System.out.println("Saturday");
//       }
//       else if(A==5){
//          System.out.println("Sunday");
//       }
//       else if(A==6){
//          System.out.println("Monday");
//       }
//       else{
//          System.out.println("Tuesday");
//       }
//    }
// }




public class day1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        int i=0;
        long ans=0;
        while(rev>0){
            ans=ans+((rev%10)*(int)Math.pow(2,i));
            rev=rev/10;
            i++;
        }
        System.out.println(ans);
    }
}








