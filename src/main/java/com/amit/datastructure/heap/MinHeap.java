package com.amit.datastructure.heap;

public class MinHeap<T extends Comparable<T>> extends Heap<T>  {

    public static void main(String[] args) throws HeapFullException,HeapEmptyException {
     MinHeap<Integer> minHeap = new MinHeap<>(Integer.class);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.printHeapArray();
        System.out.println("Removing high priority heap");
        minHeap.removeHighestPriority();
        minHeap.printHeapArray();
        System.out.println("Inserting small element");
        minHeap.insert(2);
        minHeap.printHeapArray();
    }
    public MinHeap(Class<T> clazz) {
        super(clazz);
    }

    public MinHeap(Class<T> clazz, int maxSize) {
        super(clazz, maxSize);
    }

    @Override
    protected void shiftUp(int index) {
      int parentIndex = getParentIndex(index);
      if(parentIndex == -1) {
          return;
      }
      if(getElementAtIndex(parentIndex).compareTo(getElementAtIndex(index)) > 0){
          swap(parentIndex,index);
          shiftUp(parentIndex);
      }
    }

    @Override
    protected void shiftDown(int index) {
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);
        int smallerChildIndex = -1;
        if(leftChildIndex != -1 && rightChildIndex != -1) {
            smallerChildIndex = getElementAtIndex(leftChildIndex).compareTo(getElementAtIndex(rightChildIndex)) < 0 ? leftChildIndex : rightChildIndex;
        }
        else if(leftChildIndex != -1) {
            smallerChildIndex = leftChildIndex;
        }
        else if(rightChildIndex != -1) {
            smallerChildIndex = leftChildIndex;
        }

        if(getElementAtIndex(index).compareTo(getElementAtIndex(smallerChildIndex)) > 0 ) {
            swap(index,smallerChildIndex);
            shiftUp(index);
        }

    }
}
