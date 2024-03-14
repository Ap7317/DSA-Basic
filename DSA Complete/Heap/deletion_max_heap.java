package Heap;
import java.util.*;


// Steps

// 1. Swap Idx of given value and last value of heap
// 2. Delete Last value of heap
// 3. Shift First Element of heap until the condition of heap not satisfied


public class deletion_max_heap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> max_heap=new ArrayList<>();
        max_heap.add(50);
        max_heap.add(30);
        max_heap.add(40);
        max_heap.add(20);
        max_heap.add(10);
        delete_max_heap(max_heap,0);
        System.out.println("New Heap:"+max_heap);
    }
    static void delete_max_heap(List<Integer> heap,int idx){
        swap(heap,idx,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down(heap,0);
    }
    static void swap(List<Integer> heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    static void push_down(List<Integer> heap,int idx){
        int n=heap.size()-1;
        if(idx==n) return;
        int l=2*idx+1;
        int r=2*idx+2;
        int small=idx;
        if(l<=n && heap.get(l)>heap.get(small)) small=l;
        if(r<=n && heap.get(r)>heap.get(small)) small=r;
        if(small==idx) return;
        swap(heap,idx,small);
        push_down(heap, small);
    }
}
