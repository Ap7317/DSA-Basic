package Heap;
import java.util.*;

// Steps

// 1. First add the given value in last of heap
// 2. Now swap the given value with its parent and swap unitl the condition of min heap

public class Insertion_min_heap {
    public static void main(String[] args) {
        List<Integer> min_heap=new ArrayList<>();
        min_heap.add(10);
        min_heap.add(20);
        min_heap.add(30);
        min_heap.add(40);
        min_heap.add(50);
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the new value:");
        int x=in.nextInt();
        insert_min_heap(min_heap, x);
        System.out.println("New Heap:"+min_heap);
    }
    static void insert_min_heap(List<Integer> heap,Integer x){
        // Last me add
        heap.add(x);
        int idx=heap.size()-1;
        push_up_in_min_heap(heap,idx);
    }
    static void push_up_in_min_heap(List<Integer> heap,Integer idx){
        int parent=(int)Math.ceil((idx-1)/2);
        // Compare With parent and swap
        if(idx==0 || heap.get(parent)<heap.get(idx)){
            return;
        }
        swap(heap,idx,parent);
        push_up_in_min_heap(heap, parent);
    }
    static void swap(List<Integer> heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
}
