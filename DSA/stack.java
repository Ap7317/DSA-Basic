import java.util.*;

// public class stack {
//     public static void main(String[] args) {
//         int[] arr={1,2,1};
//         int[] nums=arr.clone();
//         int[] nge=new int[nums.length];
//         Stack<Integer> st1= new Stack<>();
//         int n=nums.length-1;
//         for(int j=n;j>0;j--){
//             Stack<Integer> st2=new Stack<>();
//             st2=stack(Arrays.copyOfRange(arr, 0, j));
//                 while(st1.size()>0 && st1.peek()<=nums[j]){
//                     st1.pop();
//                 }
//                 if(st1.size()>0){
//                     nge[j]=st1.peek();
//                 }
//                 else{
//                     while(st2.size()>0 && st2.peek()<=nums[j]){
//                         st2.pop();
//                     }
//                     if(st2.size()>0){
//                         nge[j]=st2.peek();
//                     }
//                     else{
//                         nge[j]=-1;
//                     }
//                 }
//             st1.push(nums[j]);
//         }
//         Stack<Integer> st2=stack(arr);
//         while(st2.size()>0 && st2.peek()<=nums[0]){
//             st2.pop();
//         }
//         if(st2.size()>0){
//             nge[0]=st2.peek();
//         }
//         else{
//             nge[0]=-1;
//         }
//         System.out.println(Arrays.toString(nge));
//     }
//     public static Stack<Integer> stack(int[] arr){
//         Stack<Integer> st=new Stack<>();
//         for(int i=arr.length-1;i>=0;i--){
//             st.push(arr[i]);
//         }
//         return st;
//     }
// }




// public class stack{
//     public static void main(String[] args) {
//         int[] arr={3,3};
//         int[] nge=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             int j,k,c=0;
//             for(j=i+1;j<arr.length;j++){
//                 if(arr[i]<arr[j]){
//                     break;
//                 }
//             }
//             for(k=j+1;k<arr.length;k++){
//                 if(arr[i]<arr[k]){
//                     c++;
//                     break;
//                 }
//             }
//             if(c==1){
//                 nge[i]=arr[k];
//             }
//             else{
//                 nge[i]=-1;
//             }
//         }
//         System.out.println(Arrays.toString(nge));
//     }
// }




public class stack{
    public static void main(String[] args) {
        String s="abab";
        String p="ab";
        String k=sort(p);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            String n=s.substring(i,i+p.length());
            if(k.equals(sort(n))){
                l.add(i);
            }
        }
        System.out.println(l);
    }
    public static String sort(String s){
        int i=0;
        char[] c=new char[s.length()];
        for(char ch:s.toCharArray()){
            c[i]=ch;
            i++;
        }
        Arrays.sort(c);
        StringBuilder str=new StringBuilder();
        for(char ch:c){
            str.append(ch);
        }
        return str.toString();
    }
}



