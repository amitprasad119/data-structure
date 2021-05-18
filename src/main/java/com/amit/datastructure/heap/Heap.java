package com.amit.datastructure.heap;

import java.lang.reflect.Array;

public abstract class Heap<T extends Comparable<T>> {
    private static int MAX_SIZE = 40;
    private int count = 0;
    private T[] array;

    public Heap(Class<T> clazz) {
        this(clazz, MAX_SIZE);
    }

    public Heap(Class<T> clazz, int maxSize) {
        array = (T[]) Array.newInstance(clazz, maxSize);
    }

    public void printHeapArray() {
        for (int i = 0; i < count ; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("");
        try {
            System.out.println("High Priority heap:"+getHighestPriority());
        } catch (Exception e ){

        }
    }

    public int getParentIndex(int index) {
        if (index > count || index < 0) {
            return -1;
        }
        return (index - 1) / 2;
    }

    public int getLeftChildIndex(int index) {
        int leftChild = (2 * index) + 1;
        if (index >= count) {
            return -1;
        }
        return leftChild;
    }

    public int getRightChildIndex(int index) {
        int rightChildIndex = (2 * index) + 2;
        if (rightChildIndex >= count) {
            return -1;
        }
        return rightChildIndex;
    }

    public T getHighestPriority() throws HeapEmptyException {
        if (array.length == 0) {
            throw new HeapEmptyException();
        }
        return array[0];
    }

    public int getCount() {
        return count;
    }

    public T getElementAtIndex(int index) throws IndexOutOfBoundsException {
        if (index > count) {
            throw new IndexOutOfBoundsException("oops index is wrong");
        }
        return array[index];
    }

    protected void swap(int parentIndex, int childIndex) {
        T temp = array[parentIndex];
        array[parentIndex] = array[childIndex];
        array[childIndex] = temp;
    }

    public void insert(T data) throws HeapFullException {
       if(count >=  array.length) {
           throw  new HeapFullException();
       }
       array[count] = data;
       shiftUp(count);
       count++;
    }

    public T removeHighestPriority() throws HeapEmptyException {
        if (count == 0) {
            throw  new HeapEmptyException();
        }
        T removedElement = getHighestPriority();
        array[0] = array[count - 1];
        System.out.println("Element is removed:" + removedElement);
        count--;
        shiftDown(0);
        return removedElement;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public boolean isFull() {
        return count == array.length;
    }

    protected  abstract  void shiftUp(int index);
    protected  abstract  void shiftDown(int index);




    public static class HeapFullException extends Exception {

    }

    public static class HeapEmptyException extends Exception {
    }

}
