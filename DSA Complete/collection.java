import java.util.*;

// List Interface

public class collection {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("ArrayList Example:");
        ArrayList_Example();
        System.out.println("-------------------------------");
        System.out.println("LinkedList Example:");
        LinkedList_Examples();
        System.out.println("-------------------------------");
        System.out.println("Stack Examples:");
        Stack_Example();
        System.out.println("-------------------------------");
    }
    static void ArrayList_Example(){
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("ArrayList:"+l);
        System.out.println(l.contains(4));
        System.out.println(l.remove(3));
        System.out.println("ArrayList:"+l);
        l.set(2, 9);
        l.add(3,10);
        System.out.println("ArrayList:"+l);
        System.out.println("Size of ArrayList:"+l.size());
    }
    static void LinkedList_Examples(){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("LinkedList:"+l);
        System.out.println(l.contains(4));
        System.out.println(l.remove(3));
        System.out.println("LinkedList:"+l);
        l.set(2, 9);
        l.add(3,10);
        System.out.println("LinkedList:"+l);
        System.out.println("Size of linkedlist:"+l.size());
    }
    static void Stack_Example(){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack:"+st);
        System.out.println("Top value of  Stack:"+st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.contains(4));
        System.out.println("The size of stack:"+st.size());
        System.out.println("Search a value:"+st.search(3));
    }
}




// Queue Interface


public class collection{
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("Queue Implementation using LinkedList:");
        LinkedList_Queue_Implementation();
        System.out.println("---------------------------------------------");
        System.out.println("Queue Implementation using ArrayDeque:");
        ArrayDeque_Queue_Implementation();
        System.out.println("---------------------------------------------");
        System.out.println("ArrayDeque Implementation from Start:");
        ArrayDeque_First();
        System.out.println("---------------------------------------------");
        System.out.println("ArrayDeque Implementation from Last:");
        ArrayDeque_Last();
        System.out.println("---------------------------------------------");
        System.out.println("Priority Queue Implementation: Default(Minimum Priority)");
        Priority_MIN_Queue_Example();
        System.out.println("---------------------------------------------");
        System.out.println("Priority Queue Implementation: MAXIMUM Priority to Elements");
        Priority_MAX_Queue_Example();
        System.out.println("---------------------------------------------");
    }
    static void LinkedList_Queue_Implementation(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offerFirst(6);
        System.out.println("Queue:"+q);
        System.out.println("Top Element of a Queue:"+q.peek());
        System.out.println(q.poll());
        System.out.println("Queue:"+q);
        System.out.println("Size of Queue is:"+q);
        System.out.println(q.contains(3));
    }
    static void ArrayDeque_Queue_Implementation(){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println("Queue:"+q);
        System.out.println("Top Element of a Queue:"+q.peek());
        System.out.println(q.poll());
        System.out.println("Queue:"+q);
        System.out.println("Size of Queue is:"+q);
        System.out.println(q.contains(3));
    }
    static void ArrayDeque_First(){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.offerFirst(1);
        q.offerFirst(2);
        q.offerFirst(3);
        q.offerFirst(4);
        System.out.println("Queue:"+q);
        System.out.println("Top Element from Begining"+q.peekFirst());
        System.out.println(q.pollFirst());
        System.out.println("Queue:"+q);
        System.out.println("Size of queue:"+q.size());
        System.out.println(q.removeFirst());
        System.out.println("Queue:"+q);
    }
    static void ArrayDeque_Last(){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.offerLast(1);
        q.offerLast(2);
        q.offerLast(3);
        q.offerLast(4);
        System.out.println("Queue:"+q);
        System.out.println("Top Element from Begining"+q.peekLast());
        System.out.println(q.pollLast());
        System.out.println("Queue:"+q);
        System.out.println("Size of queue:"+q.size());
        System.out.println(q.removeLast());
        System.out.println("Queue:"+q);
    }
    static void Priority_MIN_Queue_Example(){
        // PRIORITY QUEUE DEFAULT IS MIN PRIORITY QUEUE
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(28);
        pq.add(2);
        pq.add(45);
        System.out.println("Priority Queue:"+pq);
        System.out.println("Size of Priority Queue:"+pq.size());
        System.out.println("MIN Element on top of Priority Queue:"+pq.peek());
        System.out.println(pq.poll());
        System.out.println("Priority Queue:"+pq);
        System.out.println(pq.contains(28));
    }
    static void Priority_MAX_Queue_Example(){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(28);
        pq.add(2);
        pq.add(45);
        System.out.println("Priority Queue:"+pq);
        System.out.println("Size of Priority Queue:"+pq.size());
        System.out.println("MIN Element on top of Priority Queue:"+pq.peek());
        System.out.println(pq.poll());
        System.out.println("Priority Queue:"+pq);
        System.out.println(pq.contains(28));
    }
}



// Set InterFace


public class collection{
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("HashSet Implementation:");
        HashSet_Example();
        System.out.println("-------------------------------------------");
        System.out.println("LinkedHashSet Implementation:");
        Linked_HashSet_Example();
        System.out.println("-------------------------------------------");
        System.out.println("Sorted Set Implementation:(TreeSet)");
        Sorted_HashSet_Example();
        System.out.println("-------------------------------------------");
    }
    static void HashSet_Example(){
        //Unordered Set
        HashSet<Integer> s=new HashSet<>();
        s.add(39);
        s.add(23);
        s.add(54);
        s.add(90);
        System.out.println("HashSet:"+s);
        s.add(54);
        s.add(39);
        s.add(54);
        System.out.println("Unique Element in HashSet:"+s);
        s.remove(54);
        System.out.println("HashSet:"+s);
        System.out.println(s.contains(34));
    }
    static void Linked_HashSet_Example(){
        //Ordered Set
        LinkedHashSet<Integer> s=new LinkedHashSet<>();
        s.add(39);
        s.add(23);
        s.add(54);
        s.add(90);
        System.out.println("HashSet:"+s);
        s.add(54);
        s.add(39);
        s.add(54);
        System.out.println("Unique Element in HashSet:"+s);
        s.remove(54);
        System.out.println("HashSet:"+s);
        System.out.println(s.contains(34));
    }
    static void Sorted_HashSet_Example(){
        //Sorted Set
        TreeSet<Integer> s=new TreeSet<>();
        s.add(39);
        s.add(23);
        s.add(54);
        s.add(90);
        System.out.println("HashSet:"+s);
        s.add(54);
        s.add(39);
        s.add(54);
        System.out.println("Unique Element in HashSet:"+s);
        s.remove(54);
        System.out.println("HashSet:"+s);
        System.out.println(s.contains(34));
    }
}



// Map Interface(Key-Value Pair)


public class collection{
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("HashMap Implementation:");
        HashMap_Example();
        System.out.println("------------------------------------------");
        System.out.println("Linked List HashMap Implementation:");
        Linked_Map_Example();
        System.out.println("------------------------------------------");
        System.out.println("Sorted Map Implementation:");
        Sorted_Map_Example();
        System.out.println("------------------------------------------");
    }
    static void HashMap_Example(){
        // Unordered Map
        Map<Integer,String> m=new Hashtable<>();
        m.put(1, "Atharava");
        m.put(2, "Akash");
        m.put(3, "Anish");
        m.put(4, "Arpit");
        m.put(5, "Anshul");
        System.out.println("HashMap:"+m);
        m.putIfAbsent(2, "Gaurav");
        System.out.println(m);
        m.put(4, "Gaurav");
        System.out.println("HashMap:"+m);

        // Iteration in HashMap

        System.out.println("Iteration in HashMap:");
        for(var e:m.entrySet()){ // Iterate Over Key-Value Pair
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }

        for(var x:m.keySet()){   // Iterate Over Key Only
            System.out.println(x);
        }

        for(var x:m.values()){ // Iterate Over Value Onle
            System.out.println(x);
        }

        // Contains Function

        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue("Gagan"));
    }
    static void Linked_Map_Example(){
        // Ordered Map
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(1, "Atharava");
        m.put(2, "Akash");
        m.put(3, "Anish");
        m.put(4, "Arpit");
        m.put(5, "Anshul");
        System.out.println("HashMap:"+m);
        m.putIfAbsent(2, "Gaurav");
        System.out.println(m);
        m.put(4, "Gaurav");
        System.out.println("HashMap:"+m);

        // Iteration in HashMap

        System.out.println("Iteration in HashMap:");
        for(var e:m.entrySet()){ // Iterate Over Key-Value Pair
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }

        for(var x:m.keySet()){   // Iterate Over Key Only
            System.out.println(x);
        }

        for(var x:m.values()){ // Iterate Over Value Onle
            System.out.println(x);
        }

        // Contains Function

        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue("Gagan"));
    }
    static void Sorted_Map_Example(){
        // Sorted Map
        Map<Integer,String> m=new TreeMap<>();
        m.put(1, "Atharava");
        m.put(2, "Akash");
        m.put(3, "Anish");
        m.put(4, "Arpit");
        m.put(5, "Anshul");
        System.out.println("HashMap:"+m);
        m.putIfAbsent(2, "Gaurav");
        System.out.println(m);
        m.put(4, "Gaurav");
        System.out.println("HashMap:"+m);

        // Iteration in HashMap

        System.out.println("Iteration in HashMap:");
        for(var e:m.entrySet()){ // Iterate Over Key-Value Pair
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }

        for(var x:m.keySet()){   // Iterate Over Key Only
            System.out.println(x);
        }

        for(var x:m.values()){ // Iterate Over Value Onle
            System.out.println(x);
        }

        // Contains Function

        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue("Gagan"));
    }
}

