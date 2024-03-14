public class day1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=k.nextInt();
        int b=k.nextInt();
        int c=k.nextInt();
        int big=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Biggest between these is "+big);
    }
}
