import java.util.*;

// public class Hash {
//     public static void main(String[] args) {
//         HashSet<Integer> setname=new HashSet<>();

// //  1.      Insertion in HashSet by setname.add(value)
        

//         setname.add(10);
//         setname.add(20);
//         setname.add(21);
//         setname.add(45);
//         System.out.println(setname);


//         // Search a value in Hashet using Setname.conatins(value)

//         System.out.println(setname.contains(20));


//         // Delete a value from HashSet using Setname.remove(value)


//         setname.remove(21);
//         System.out.println(setname);


//         // Size of a HashSet is Setname.size();


//         System.out.println("The size of Hashset ="+ setname.size());

// //     To clear all value of a set we use-> Setname.clear()

//        setname.clear();
//        System.out.println(setname);
        
//     }
// }


// Q1. Count Distinct element of an array

// public class Hash{
//     public static void main(String[] args) {
//        HashSet<Integer> s=new HashSet<>();
//        int[] arr={2,3,4,2,5,2,5,2,5,6,2,323,4};
//        for(int i=0;i<arr.length;i++){
//         s.add(arr[i]);
//        }
//        System.out.println("The number of distinct element in array="+" "+s.size());
//     }
// }



// Q2. Union of two set


// public class Hash{
//     public static void main(String[] args) {
//         int[] arr1={1,2,3,5,6,4};
//         int[] arr2={4,5,6,9,8,10};
//         HashSet<Integer> s=new HashSet<>();
//         for(int i=0;i<arr1.length;i++){
//             s.add(arr1[i]);
//         }
//         for(int i=0;i<arr2.length;i++){
//             s.add(arr2[i]);
//         }
//         System.out.println("Union of two set:");
//         System.out.println(s);
//     }
// }



// Q3. Intersection of two set


// public class Hash{
//     public static void main(String[] args) {
//         int[] arr1={1,2,4,3,6,7,8,98};
//         int[] arr2={3,5,6,2,13};
//         HashSet<Integer> s=new HashSet<>();
//         HashSet<Integer> ans=new HashSet<>();
//         for(int i=0;i<arr1.length;i++){
//             s.add(arr1[i]);
//         }
//         for(int i=0;i<arr2.length;i++){
//             if(s.contains(arr2[i])){
//                 ans.add(arr2[i]);
//             }
//         }
//         System.out.println("Intersection of two set:");
//         System.out.println(ans);
//     }
// }

// HAHSMAP 

// Q4.Find the subarray with given sum(HashMap)


// public class Hash{
//     public static void main(String[] args) {
//         int[] arr={1,-1,0};
//         int sum=0;
//         int currsum=0,start=0,end=-1;
//         HashMap<Integer,Integer> m=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             currsum+=arr[i];
//             if(currsum-sum==0){
//                 start=0;
//                 end=i;
//                 break;
//             }
//             else if(m.containsKey(currsum-sum)){
//                 start=m.get(currsum-sum)+1;
//                 end=i;
//                 break;
//             }
//             m.put(currsum,i);
//         }
//         List<Integer> ans=new ArrayList<>();
//         for(int i=start;i<=end;i++){
//             ans.add(arr[i]);
//         }
//         System.out.print("The array with given sum " +sum+" =");
//         System.out.println(ans);
//     }
// }



// Q5. Count the distinct element in every window of size K


// public class Hash{
//     public static void main(String[] args) {
//         int[] arr={1,2,2,1,3,1,1,3};
//         int k=4;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         List<Integer> ans=new ArrayList<>();
//         for(int i=0;i<k;i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
//         ans.add(map.size());
//         for(int i=k;i<arr.length;i++){
//             if(map.get(arr[i-k])==1){
//                 map.remove(arr[i-k]);
//             }
//             else{
//                 map.put(arr[i-k],map.get(arr[i-k])-1);
//                 map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//             }
//             ans.add(map.size());
//         }
//         System.out.println("Distinct elements in every window of size "+k+":");
//         System.out.println(ans);
//     }
// }








// public class Hash{
//     public static void main(String[] args) {
//         int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
//         List<Integer> ans=new ArrayList<>();
//         int r=mat.length;
//         int c=mat[0].length;
//         int tr=0,tc=0,i=0,j=0;
//         while(ans.size()<r*c){
//             while(j>0){
//                 ans.add(mat[i][j]);
//                 i--;
//                 j++;
//             }
//             ans.add(mat[i][j]);
//             i++;
//             while(i>0){
//                 ans.add(mat[i][j]);
//                 i++;
//                 j--;
//             }
//             ans.add(mat[i][j]);
//             j++;
//         }
//         System.out.println(ans);
//     }
// }




public class Hash{
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(i==j || j==n-i-1){
                    boolean ans=prime(nums[i][j]);
                    if(ans==true){
                        l.add(nums[i][j]);
                    }
                }
            }
        }
        l.sort();
        return l.get(l.size()-1);
    }
    static boolean prime(int n){
        int c=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return (c==0);
    }
}
