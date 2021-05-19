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
        System.out.println("Max element from Heap:"+minHeap.findMaxElement(minHeap));
        printKMaxElements(5);
        printKMaxElements(3);
        printKMaxElements(6);
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

    public int findMaxElement(MinHeap<Integer> minHeap) {
        int lastIndex = minHeap.getCount() - 1;
        int lastParentIndex = getParentIndex(lastIndex);
        int firstChildIndexAfterParent = lastParentIndex  + 1;
        int maxElement = minHeap.getElementAtIndex(firstChildIndexAfterParent);
        for(int i = firstChildIndexAfterParent; i<= lastIndex;i++) {
            if(maxElement < minHeap.getElementAtIndex(i)){
                maxElement = minHeap.getElementAtIndex(i);
            }
        }
       return maxElement;
    }

    public static void printKMaxElements(int k ) throws MinHeap.HeapEmptyException,MinHeap.HeapFullException {
        MinHeap<Integer> minHeap = new MinHeap<>(Integer.class,k);
        int[] randomNumberArray = new int[] {2, 5, 6, 21, 67, 88, 4, 1, 3, 9, 99};
        for(int item: randomNumberArray) {
            if(minHeap.isEmpty()) {
                minHeap.insert(item);
            } else if(!minHeap.isFull() || minHeap.getHighestPriority() < item) {
                if(minHeap.isFull()) {
                    minHeap.removeHighestPriority();
                }
                minHeap.insert(item);

            }
        }
        minHeap.printHeapArray();
    }
}
