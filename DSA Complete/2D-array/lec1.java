import java.util.*;

// Input and Output of a 2D-array

public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(arr[i]));
        } 
    }  
}

// Addition of 2D-array

public class lec1{
    static int[][] input(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) { 
        int[][] arr1=input();
        int[][] arr2=input();
        int[][] arr=new int[arr1.length][arr1[0].length];
        System.out.println("Sum of 2D-array:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}




// Subtraction of two matrix


public class lec1{
    static int[][] input(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) { 
        int[][] arr1=input();
        int[][] arr2=input();
        int[][] arr=new int[arr1.length][arr1[0].length];
        System.out.println("Subtraction of 2D-array:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=arr1[i][j]-arr2[i][j];
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}




// Multiplication of 2D-array


public class lec1{
    static int[][] input(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("First array input:");
        int[][] arr1=input();
        System.out.println("Second array input:");
        int[][] arr2=input();
        int[][] arr=new int[arr1.length][arr2[0].length];
        System.out.println("Multiplication of 2D-array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                    arr[i][j]=arr[i][j]+arr1[i][k]*arr2[k][j];
                }
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}



// Transpose of a Matrix(Inplace Swap is done only in Square Matrix)


public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<i;j++){
                int a=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=a;
            }
        }
        System.out.println("2D-array after Transpose:");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}




// Transpose of Square Matrix


public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int[][] ans=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ans[j][i]=arr[i][j];
            }
        } 
        System.out.println("2D-matrix after transpose:");
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}



// Rotate Image (Rotate Matrix by 90)

public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix after transpose:");
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int a=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=a;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for(int i=0;i<arr.length;i++){
            int j=0,k=arr[i].length-1;
            while(j<=k){
                int a=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=a;
                j++;
                k--;
            }
        }
        System.out.println("Matrix after rotation:");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}




// Pascal's Triangle(Jagged Array)


public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows=");
        int r=in.nextInt();
        int[][] arr=new int[r][];
        System.out.println("Enter the element in Pascal's Triangle:");
        for(int i=0;i<r;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}



// Topelitz Matrix 


public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int i=0;
        for(int j=0;j<c;j++){
            int k=i,m=j;
            while(k<r-1 && m<c-1){
                if(arr[k][m]!=arr[k+1][m+1]){
                    System.out.println(false);
                    return;
                }
                k++;
                m++;
            }
        }
        i=0;
        for(int j=0;j<r;j++){
            int k=i,m=j;
            while(k<c-1 && m<r-1){
                if(arr[m][k]!=arr[m+1][k+1]){
                    System.out.println(false);
                    return;
                }
                k++;
                m++;
            }
        }
        System.out.println(true);
    }
}



// Spiral Matrix

public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
        List<Integer> ans=new ArrayList<>();
        int tr=0,lc=0,rc=c-1,br=r-1;
        while(ans.size()!=r*c){
            // tr-> left col to right col
            for(int j=lc;j<=rc;j++){
                ans.add(arr[tr][j]);
            }
            tr++;
           // rc->topRow to BottomRow
           for(int j=tr;j<=br;j++){
            ans.add(arr[j][rc]);
           }
           rc--;
           // br->rightCol to leftCol
            for(int j=rc;j>=lc;j--){
                ans.add(arr[br][j]);
            }
            br--;
           // lc->bottomRow to TopRow
           for(int j=br;j>=tr;j--){
            ans.add(arr[j][lc]);
           }
           lc++;
        }
        System.out.println(ans);
    }  
}



// Create a Matrix in Spiral Form


public class lec1{
    public static void main(String[] args) {
        int n=3;
        int[][] arr=new int[n][n];
        int tr=0,br=n-1,lc=0,rc=n-1;
        int i=1;
        while(i<=n*n){
            // tr->leftCol to rightCol
            for(int j=lc;j<=rc;j++){
                arr[tr][j]=i;
                i++;
            }
            tr++;
            // rc->topRow to BottomRow
            for(int j=tr;j<=br;j++){
                arr[j][rc]=i;
                i++;
            }
            rc--;
            // br->rightCol to leftCol
            for(int j=rc;j>=lc;j--){
                arr[br][j]=i;
                i++;
            }
            br--;
            // lc->bottomRow to topRow
            for(int j=br;j>=tr;j--){
                arr[j][lc]=i;
                i++;
            }
            lc++;
        }
        for(int j=0;j<n;j++){
            System.out.println(Arrays.toString(arr[j]));
        }
    }
}





// HourGlass of a Matrix


public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=in.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i+2<r && j+2<c){
                    int max=(mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
                    ans=Math.max(ans,max);
                }
            }
        }
        System.out.println(ans);
    }
}




// Rectangle Sum between given Coordinates(Brute Force)


public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int r=in.nextInt();
        System.out.print("Enter number of coloumns=");
        int c=in.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the first coordinates:");
        int l1=in.nextInt();
        int r1=in.nextInt();
        System.out.println("Enter the second coordinates:");
        int l2=in.nextInt();
        int r2=in.nextInt();
    }
}




// Diagonal Traverse Leetcode


public class lec1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the row=");
        int r=in.nextInt();
        System.out.print("Enter the coloumn=");
        int c=in.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+"        ");
            }
            System.out.println();
        }
        int row=0,col=0;
        boolean up=true;
        List<Integer> ans=new ArrayList<>();
        while(row<r && col<c){
            if(up==true){
                while(row>0 && col<c-1){
                    ans.add(mat[row--][col++]);
                }
                ans.add(mat[row][col]);
                if(col==c-1){
                    row++;
                }
                else{
                    col++;
                }
            }
            else{
                while(row<r-1 && col>0){
                    ans.add(mat[row++][col--]);
                }
                ans.add(mat[row][col]);
                if(row==r-1){
                    col++;
                }
                else{
                    row++;
                }
            }
        }
        System.out.println(ans);
    }
}









