package com.amit.problemsolving;

import java.util.*;

public class CollectionExercise {

    void listOperations() {
        //List is an interface which are implemented under the hood of [ArrayList,Vector,LinkedList,Stack]
        List<String> l = new ArrayList<>();
        l.add("Amit");
        l.add("Sumit");
        l.add("Suman");
        l.add("gannu");
        l.add("pankaj");
        l.add(0,"Prasad");
        System.out.println(l);
        System.out.println("List with maintained order");
        List<String> ll = new LinkedList<>();
        ll.add("Amit");
        ll.add("Sumit");
        ll.add("suman");
        ll.add("pankaj");
        System.out.println("LinkedList From collection:"+ll);
        System.out.println("Print through the iterator interface");
        Iterator<String> iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

  void setOperation() {
        // Set is an interface whose implementation are done through [HashSet,LinkedHashSet]
       Set<String> names = new HashSet<>();
       names.add("Amit");
       names.add("Sumit");
       names.add("Pankaj");
       names.add("George");
       names.add("Amit");
      // Output will be unique elements and there won't be a insertion order maintained
      System.out.println("Print the set from hashSet: "+names);
      //Now let's see the example of LinkedHashSet to see wether it maintains the insertion order or not
      Set<String> newName = new LinkedHashSet<>();
      newName.add("Amit");
      newName.add("Gannu");
      newName.add("Sumit");
      newName.add("Prakash");
      newName.add("Amit");
      Iterator<String> iterator = newName.iterator();
      while (iterator.hasNext())
      {
          System.out.println(iterator.next());
      }
             /*
              Amit
              Gannu
              Sumit
              Prakash
              */
    // If we want the element to be sorted then we must use TreeSet with unique value ofcourse
     Set<String> sortedName = new TreeSet<>();
     sortedName.add("Zak");
     sortedName.add("Amit");
     sortedName.add("Deepak");
     sortedName.add("Chandan");
     sortedName.add("George");
     sortedName.add("Blinken");
     sortedName.add("Amit");
     System.out.println("Sorted set using treeset");
     System.out.println(sortedName);
  }

  void hashOperation() {
        //Map is a Interface which are implemented via HashMap or LinkedHashMap
        // it does not maintains any order also no duplicate key entry , the latest one will be inserted
        Map<String,Integer> phones = new HashMap<>();
        phones.put("Amit",90023293);
        phones.put("Sumit",92498434);
        phones.put("Pankaj",23213213);
        phones.put("George",872378237);
        phones.put("George",872378238);
       System.out.println(phones);

       //LinkedHashMap to maintain the insertion order and duplicate will be ommited no latest will take place
      Map<String,Integer> phoneOrder = new LinkedHashMap<>();
      phoneOrder.put("Amit",909302923);
      phoneOrder.put("Sumt",809302923);
      phoneOrder.put("David",989302923);
      phoneOrder.put("Fraz",976302923);
      phones.put("Sumt",24324324);
      System.out.println("LinkedHashMap::"+phoneOrder);
  }

   int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while ( i < arr.length) {
            if(arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while ( i < arr.length ) {
            if(arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }



   void factorMinus(int[] arr) {
      int min = findMin(arr);
      int max = findMax(arr);
      int firstNum = 0;
      int secondNum = 0;
      int runningMin = max - min;
       for(int i = 2;i< max * min;i++) {
           if (max % i == 0) {
               int next = (max * min) / i;
               if(runningMin > Math.abs(i - next))
              {
                  runningMin = Math.abs(i - next);
                  firstNum = i;
                  secondNum = next;
              }

           }
       }
       System.out.printf("First: %d  and Second:%d Num with answer:%d",firstNum,secondNum,runningMin);
   }


    public static void main(String[] args) {
           CollectionExercise collExer = new CollectionExercise();
           collExer.listOperations();
           collExer.setOperation();
           collExer.hashOperation();
        int[] num = {53,108,18,16,34,5,100,75,49,10,144,9,51,52,86,64,58,17,2,72,4};
        System.out.println("Min:"+collExer.findMin(num));
        System.out.println("Max:"+collExer.findMax(num));
        collExer.factorMinus(num);
    }
}
