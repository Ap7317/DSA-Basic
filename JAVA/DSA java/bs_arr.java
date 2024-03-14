import java.util.Scanner;

// public class bs_arr {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of row=");
//         int n=in.nextInt();
//         System.out.print("Enter the size of coloumn=");
//         int m=in.nextInt();
//         int[][] arr=new int[n][m];
//         System.out.println("Enter the Matrix:");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("Matrix 90 rotation in Clockwise:");
//         for(int i=0;i<m;i++){
//             for(int j=n-1;j>=0;j--){
//                 System.out.print(arr[j][i]+"\t");
//             }
//             System.out.println();
//         }
//     }
// }





// public class bs_arr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of matrix row=");
//         int n=in.nextInt();
//         System.out.print("Enter the size of matrix coloumn=");
//         int m=in.nextInt();
//         int[][] arr=new int[n][m];
//         System.out.println("Enter the matrix:");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("Matrix 90 rotation in Anti_Clockwise:");
//         for(int i=m-1;i>=0;i--){
//             for(int j=0;j<n;j++){
//                  System.out.print(arr[j][i]+"\t");
//             }
//             System.out.println();
//         }
//     }
// }




// public class bs_arr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.print("Enter the size of Matrix row=");
//         int n=in.nextInt();
//         System.out.print("Enter the size of Matrix coloumn=");
//         int m=in.nextInt();
//         int[][] arr=new int[n][m];
//         System.out.println("Enter the Matrix:");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("Matrix after 180 rotation:");
//         for(int i=n-1;i>=0;i--){
//             for(int j=m-1;j>=0;j--){
//                 System.out.print(arr[i][j]+"\t");
//             }
//             System.out.println();
//         }
//     }
// }



// public class bs_arr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             int c=0;
//             for(int j=i;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     c++;
//                 }
//             }
//             if(c==2){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     }
// }



public class bs_arr{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=in.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];
        System.out.println("Enter the elements of Array 1:");
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        System.out.println("Enter the elements of Array 2:");
        for(int i=0;i<n;i++){
            B[i]=in.nextInt();
        }
        System.out.println("The elements which are present in both:");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(A[i]==B[j]){
                    System.out.print(A[i]+"\t");
                }
            }
        }
        System.out.println();
        System.out.println("The elements which are not present in B but it is present in A is:");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(A[i]!=B[j]){
                    System.out.print(A[i]+"\t");
                }
            }
        }
        System.out.println();
        System.out.println("The elements which are not present in A but it is present in B is:");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(B[i]!=A[j]){
                    System.out.print(B[i]+"\t");
                }
            }
        }
    }
}







// public class bs_arr{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=in.nextInt();
//         }
//         int c=0;
//         for(int i=0;i<n;i++){
//             c^=arr[i];
//         }
//         System.out.println(c);
//     }
// }
