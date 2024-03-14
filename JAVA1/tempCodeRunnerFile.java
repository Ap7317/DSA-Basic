public class oneDarr{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=in.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    }
}