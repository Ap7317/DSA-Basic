int n=47;
        int m=n;
        n=(n-9)/2;
        n+=9;
        List<Integer> l=new ArrayList<>();
        while(n>0){
            l.add(0,n%10);
            n=n/10;
        }