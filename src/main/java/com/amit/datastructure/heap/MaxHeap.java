package com.amit.datastructure.heap;

 class MaxHeap<T extends Comparable<T>>  extends Heap<T>{

     public static void main(String[] args) throws HeapEmptyException,HeapFullException {
         MaxHeap<Integer> maxHeap = new MaxHeap<>(Integer.class);
          maxHeap.insert(10);
          maxHeap.insert(20);
          maxHeap.insert(30);
          maxHeap.insert(40);
          maxHeap.insert(50);
         System.out.println("Max from heap"+maxHeap.getHighestPriority());
         maxHeap.printHeapArray();
         maxHeap.removeHighestPriority();
         System.out.println("After removing max heap");
         maxHeap.printHeapArray();
         System.out.println(maxHeap.getCount());
         maxHeap.insert(100);
         System.out.println("After inserting 100");
         maxHeap.printHeapArray();
     }

     public MaxHeap(Class<T> clazz) {
         super(clazz);
     }

     public MaxHeap(Class<T> clazz, int maxSize) {
         super(clazz, maxSize);
     }

     @Override
     protected void shiftUp(int index) {
       int parentIndex = getParentIndex(index);
       if(parentIndex == -1) {
           return;
       }
       if(getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) > 0){
           swap(parentIndex,index);
           shiftUp(parentIndex);
       }
     }

     @Override
     protected void shiftDown(int index) {
         int leftChildIndex = getLeftChildIndex(index);
         int rightChildIndex = getRightChildIndex(index);
         int childLargerIndex = -1 ;
         if(leftChildIndex != -1 && rightChildIndex != -1) {
             childLargerIndex = getElementAtIndex(leftChildIndex).compareTo(getElementAtIndex(rightChildIndex)) > 0 ? leftChildIndex : rightChildIndex;
         }
         if(leftChildIndex == -1) {
             childLargerIndex = rightChildIndex;
         }
        else if(rightChildIndex == -1) {
             childLargerIndex = leftChildIndex;
         }

         if(childLargerIndex == -1) {
             return;
         }
         if(getElementAtIndex(childLargerIndex).compareTo(getElementAtIndex(index)) > 0) {
             swap(childLargerIndex,index);
             shiftDown(childLargerIndex);
         }
     }
 }
