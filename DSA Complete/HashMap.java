import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        System.out.println("HashMap Implementation:");
        HashMap_Methods();
    }
    static void HashMap_Methods(){
        Scanner in=new Scanner(System.in);
        // Syntax
        Map<String,Integer> mp=new Hashtable<>();
        
        // Add Some Value in HashMap

        System.out.println("Enter number of Key-Value Pair:");
        int n=in.nextInt();
        in.nextLine();
        while(n-->0){
            System.out.print("Enter the Key:");
            String key=in.nextLine();
            System.out.print("Enter the value:");
            int value=in.nextInt();
            in.nextLine();
            mp.put(key,value);
        }
        System.out.println("HashMap:"+mp);

        // Access a value in HashMap

        System.out.println(mp.get("Akash")); // Return value if key exist
        System.out.println(mp.get("Anisha")); // Return null if key doesn't exist

        // Updating Or Changing Value

        mp.put("Anish",40000);
        System.out.println(mp);

        // Deleting a Key-Value Pair

        mp.remove("Arpit");  // return the value if key exist
        System.out.println(mp);
        mp.remove("Akshara"); // return null if value doesn't exist

        // Check a value or key present or not

        System.out.println(mp.containsKey("Anish"));
        System.out.println(mp.containsValue(40000));


        // Put value if present in the Map

        mp.put("Akash",50000);
        System.out.println(mp);

        // Get all Value of Map

        System.out.println(mp.values());

        // Get all key of map

        System.out.println(mp.keySet());

        // Get All Entries of Map

        System.out.println(mp.entrySet());

        // Traversing of HashMap Using Different Method

        // Using get method

        System.out.println("Using Get Method:");
        for(var x:mp.keySet()){
            System.out.println(x+"="+mp.get(x)+", ");
        }

        // Using Entry Set

        System.out.println("EntrySet Method:");
        for(var x:mp.entrySet()){
            System.out.print(x+" ");
        }
    }
}



// Most Frequent Element in an Array

public class HashMap{
    public static void main(String[] args) {
        int[] arr={1,2,1,4,1,3,5};
        Map<Integer,Integer> mp=new Hashtable<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp);
        System.out.print("Most Frequent Element=");
        int ans=0,max=0;
        for(var x:mp.keySet()){
            if(mp.get(x)>max){
                max=mp.get(x);
                ans=x;
            }
        }
        System.out.println(ans);
    }
}



