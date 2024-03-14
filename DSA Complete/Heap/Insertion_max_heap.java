package Heap;
import java.util.*;

// Steps

// 1. First add the given value in last of heap
// 2. Now swap the given value with its parent and swap unitl the condition of max heap


public class Insertion_max_heap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> max_heap=new ArrayList<>();
        max_heap.add(50);
        max_heap.add(40);
        max_heap.add(30);
        max_heap.add(20);
        max_heap.add(10);
        System.out.print("Enter the new value:");
        int x=in.nextInt();
        insert_max_heap(max_heap,x);
        System.out.println("New Heap:"+max_heap);
    }
    static void insert_max_heap(List<Integer> heap,int x){
        // Last me add
        heap.add(x);
        int idx=heap.size()-1;
        push_up_in_max_heap(heap,idx);
    }
    static void push_up_in_max_heap(List<Integer> heap,int idx){
        int parent=(int)Math.ceil((idx-1)/2);
        if(idx==0 || heap.get(idx)<heap.get(parent)){
            return;
        }
        swap(heap,idx,parent);
        push_up_in_max_heap(heap, parent);
    }
    static void swap(List<Integer> heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
}
