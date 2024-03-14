import java.util.*;

// Fibbonacci Using Dynamic Programming


public class dynamic {
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(n+"th fibbonacci value is "+fibbo(n,dp));
    }
    static int fibbo(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibbo(n-1,dp)+fibbo(n-2,dp);
    }
}



// Climbing Stairs(A person want to climb to n stairs so he can climb one or two steps at a time)



public class dynamic{
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Total Different ways to climb stairs= "+climb(n,dp));
    }
    static int climb(int n,int[] dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=climb(n-1,dp)+climb(n-2,dp);
    }
}






// Frog Jump with one or two moves(Minimum Energy to reach the frog at the end of array)


public class dynamic{
    public static void main(String[] args) {
        int[] arr={30,10,60,50,10,60};
        int[] dp=new int[arr.length+1];
        int idx=arr.length-1;
        Arrays.fill(dp,-1);
        System.out.println("The minimum energy required to reach the last index= "+frog(arr,idx,dp));
    }
    static int frog(int[] arr,int idx,int[] dp){
        if(idx==0){
            dp[0]=0;
            return dp[0];
        }
        if(dp[idx]!=-1) return dp[idx];
        int left=frog(arr,idx-1,dp)+Math.abs(arr[idx]-arr[idx-1]);
        int right=Integer.MAX_VALUE;
        if(idx>1) right=frog(arr,idx-2,dp)+Math.abs(arr[idx]-arr[idx-2]);
        return dp[idx]=Math.min(left,right);
    } 
}




// Frog Jump with maximum k distance(You can jump 1 to k step)


public class dynamic{
    public static void main(String[] args) {
        int[] arr={30,10,60,50,30,40};
        int k=3;
        int[] dp=new int[arr.length+1];
        int idx=arr.length-1;
        Arrays.fill(dp,-1);
        System.out.println("The minimum energy required to take= "+frogwith_k(arr,idx,k,dp));
    }
    static int frogwith_k(int[] arr,int idx,int k,int[] dp){
        if(idx==0){
            dp[0]=0;
            return dp[0];
        }
        if(dp[idx]!=-1) return dp[idx];
        int left=frogwith_k(arr, idx-1, k, dp)+Math.abs(arr[idx]-arr[idx-1]);
        for(int i=2;i<=k;i++){
            if(idx>i){
                left=Math.min(left,(frogwith_k(arr, idx-i, k, dp)+Math.abs(arr[idx]-arr[idx-i])));
            }
        }
        return dp[idx]=left;
    }
}



// House Robber(Maximum sum of adjacent element)


public class dynamic{
    public static void main(String[] args) {
        int[] arr={2,1,4,9};
        int n=arr.length-1;
        int[] dp=new int[n+2];
        Arrays.fill(dp,-1);
        System.out.println(maximum(arr,n,dp));
    }
    static int maximum(int[] arr,int idx,int[] dp){
        if(idx==0) return arr[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick=arr[idx]+maximum(arr,idx-2,dp);
        int notpickup=maximum(arr,idx-1,dp);
        return dp[idx]=Math.max(pick,notpickup);
    }
}



// House Robber-2(If houses are in circle)


public class dynamic{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        if(arr.length==1) System.out.println(arr[0]);
        if(arr.length==2) System.out.println(Math.max(arr[0],arr[1]));
        int n=arr.length;
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        System.out.println(Math.max(maximum1(arr,n-1,dp1),maximum2(arr,0,dp2)));
    }
    static int maximum1(int[] arr,int idx,int[] dp){
        if(idx==1) return arr[idx];
        if(idx<=0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick=arr[idx]+maximum1(arr,idx-2,dp);
        int notpickup=maximum1(arr,idx-1,dp);
        return dp[idx]=Math.max(pick,notpickup);
    }
    static int maximum2(int[] arr,int idx,int[] dp){
        if(idx==arr.length-2) return arr[idx];
        if(idx>=arr.length-1) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick=arr[idx]+maximum2(arr,idx+2,dp);
        int notpickup=maximum2(arr,idx+1,dp);
        return dp[idx]=Math.max(pick,notpickup);
    }
}



