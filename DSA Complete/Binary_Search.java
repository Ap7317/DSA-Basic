import java.util.*;

// Binary Search Iterative method

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of element in array=");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the targest element=");
        int t=in.nextInt();
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>t){
                j=mid-1;
            }
            else if(arr[mid]<t){
                i=mid+1;
            }
            else{
                System.out.println(t+" is found at "+mid+" index");
                return;
            }
        }
    }
}



// Binary Search(Recursive Method)


public class Binary_Search{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of element in array=");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the targest element=");
        int t=in.nextInt();
        int ans=binary(arr,0,arr.length-1,t);
        if(ans==-1){
            System.out.println("Element is not present in given array");
        }
        System.out.println(t+" is found at "+ans+" index");
    }
    static int binary(int[] arr,int st,int end,int t){
        if(st>end){
            return -1;
        }
        int mid=(st+end)/2;
        if(arr[mid]>t){
            return binary(arr,st,mid-1,t);
        }
        if(arr[mid]<t){
            return binary(arr,mid+1,end,t);
        }
        return mid;
    }
}



// Find the first occurence of element in array(Using Binary Search)


public class Binary_Search{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of element in array=");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the targest element=");
        int t=in.nextInt();
        int i=0,j=arr.length-1,ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>t){
                j=mid-1;
            }
            else if(arr[mid]<t){
                i=mid+1;
            }
            else{
                j=mid-1;
                ans=mid;
            }
        }
        if(ans==-1){
            System.out.println("Element is not found in given array.");
            return;
        }
        System.out.println(t+" is found at "+ans+" index");
    }
}


// Find the last occurence of element in array(Binary Search)


public class Binary_Search{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of element in array=");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the targest element=");
        int t=in.nextInt();
        int i=0,j=arr.length-1,ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>t){
                j=mid-1;
            }
            else if(arr[mid]<t){
                i=mid+1;
            }
            else{
                ans=mid;
                i=mid+1;
            }
        }
        if(ans==-1){
            System.out.println("Element is not found in array");
            return;
        }
        System.out.println(t+" is found at "+ans+" index");
    }
}



// Square root of a non negative number


public class Binary_Search{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=in.nextInt();
        int st=0,end=n,ans=0;
        while(st<=end){
            int mid=(st+end)/2;
            if(mid*mid<=n){
                st=mid+1;
                ans=mid;
            }
            else if(mid*mid>=n){
                end=mid-1;
            }
            else{
                ans=mid;
                break;
            }
        }
        System.out.println("Square root of "+n+" is "+ans);
    }
}


// Find Minimum in Rotated Sorted Array


public class Binary_Search{
    public static void main(String[] args) {
        int[] nums={5,6,7,8,9,10,1,2,3,4};
        int i=0,j=nums.length-1,n=nums.length-1,ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[n]){
                i=mid+1;
            }
            else if(nums[mid]<=nums[n]){
                ans=nums[mid];
                j=mid-1;
            }
        }
        System.out.println("Minimum element is "+ans);
    }
}



// Search in rotated Sorted matrix(row and coloumn sorted while whole matrix is sorted)

public class Binary_Search{
    public static void main(String[] args) {
        int[][] mat={{1,3,5,7},
                    {10,11,16,20},
                    {23,30,34,60}};
        int t=16;
        int r=mat.length,c=mat[0].length;
        int[] ans=new int[2];
        int i=0,j=r*c-1; 
        while(i<=j){
            // mid=(rm+c)
            //  r=(rm+c)/m and c=(rm+c)%m
            int mid=i+(j-i)/2;
            int a=mid/c;
            int b=mid%c;
            if(mat[a][b]>t){
                j=mid-1;
            }
            else if(mat[a][b]<t){
                i=mid+1;
            }
            else{ 
                ans[0]=a;
                ans[1]=b;    
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
 


// Search a 2D-matrix-II leetcode(Only row and coloumn are sorted)
// Time Complexity is O(m+n)


public class Binary_Search{
    public static void main(String[] args) {
        int[][] mat={{2,4,6,8},
                    {5,6,7,20},
                    {7,11,13,25},
                    {12,14,17,30}};
        int t=14;
        int[] ans=new int[2];
        int r=mat.length,c=mat[0].length;
        int i=0,j=c-1;
        while(i<r && j>=0){
            if(mat[i][j]<t){
                i++;
            }
            else if(mat[i][j]>t){
                j--;
            }
            else{
                ans[0]=i;
                ans[1]=j;
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}




// Peak Index in mountain array Leetcode


public class Binary_Search{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,2,3,4};
        int i=0,j=arr.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                ans=mid;
                break;
            }
            if(arr[mid]<arr[mid+1]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        } 
        System.out.println();
    }
}


// Distribute the candies in 'N' children


public class Binary_Search{
    public static void main(String[] args) {
        int[] can={12,34,67,90};
        int n=2;
        int ans=distribute_choclates(can, n);
        System.out.println("We can distribute choclates in="+ans);
    }
    static boolean isDivision(int[] can,int m,int maxChoc){
        int num=1,choc=0;
        for(int i=0;i<can.length;i++){
            if(can[i]>maxChoc){
                return false;
            }
            else if(choc+can[i]<=maxChoc){
                choc+=can[i];
            }
            else{
                num++;
                choc=can[i];
            }
        }
        return num<=m;
    }
    static int distribute_choclates(int[] can,int m){
        if(can.length<m)
           return -1;
        int ans=0,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivision(can,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
}




// Given a Integer find out that it is sum of two prefect squares(c=a^2+b^2,c is given)



public class Binary_Search{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=in.nextInt();
        int st=0,end=n;
        while(st<=end){
            int mid=(st+end)/2;
            if(mid>0 && mid<n){
                if(mid*mid+(mid-1)*(mid-1)==n){
                    System.out.println(true);
                    return;
                }
                else if(mid*mid+(mid-1)*(mid-1)<n){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        System.out.println(false);
    }
}



// Find k Closest elements

public class Binary_Search{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int k=3;
        int x=3;
        List<Integer> l=new ArrayList<>();
        int ans=Math.abs(x-nums[0]);
        int a=0;
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-x)<ans){
                a=i;
                ans=Math.abs(nums[i]-x);
            }
        }
        System.out.println(a+" "+ans);
        l.add(nums[a]);
        int i=a-1,j=a+1,c=1;
        while(c<k){
            if(c<k && i>=0 && j<nums.length){
                if(Math.abs(x-nums[i])>Math.abs(x-nums[j])){
                    l.add(nums[j++]);
                    c++;
                }
                else{
                    l.add(0,nums[i--]);
                    c++;
                }
            }
            else if(c<k && i>=0){
                l.add(0,nums[i--]);
                c++;
            }
            else if(c<k && j<nums.length){
               l.add(nums[j++]);
               c++;
            }
        }
        System.out.println(l);
    }
}
 


