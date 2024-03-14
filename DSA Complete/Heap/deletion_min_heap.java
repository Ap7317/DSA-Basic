package Heap;
import java.util.*;

// Steps

// 1. Swap 1st and Last Value of Heap
// 2. Delete last value of Heap
// 3. Swap First Value with its child until the min heap condition not satisfied


public class deletion_min_heap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> min_heap=new ArrayList<>();
        min_heap.add(10);
        min_heap.add(20);
        min_heap.add(30);
        min_heap.add(40);
        min_heap.add(50);
        delete_min_heap(min_heap,0);
        System.out.println("New Heap:"+min_heap);
    }
    static void delete_min_heap(List<Integer> heap,int idx){
        swap(heap,idx,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down(heap, 0);
    }
    static void push_down(List<Integer> heap,int idx){
        if(idx==heap.size()-1){
            return;
        }
        int l=(2*idx)+1;
        int r=(2*idx)+2;
        int small=idx;
        if(l<=heap.size()-1 && heap.get(l)<heap.get(small)){
            small=l;
        }
        if(r<=heap.size()-1 && heap.get(r)<heap.get(small)){
            small=r;
        }
        if(small==idx){
            return;
        }
        swap(heap,idx,small);
        push_down(heap, small);
    }
    static void swap(List<Integer> heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
}
