package com.amit.problemsolving;

import java.util.*;

class Point implements Comparable<Point> {
    int x,y;
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p ) {
     //   Point p = (Point) o;
        if(this.x < p.x)
            return  -1;
        else if(p.x < this.x)
            return 1;
        else {
            if(this.y < p.y)
                return -1;
            if(p.y < this.y)
                return 1;
            else return 0;
        }
    }
}
public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("E");
        hs.add("O");
        hs.add("D");
        hs.forEach(System.out::println);
        List<Integer> ll = new LinkedList<>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);

        System.out.println(list);
        ll.add(10);
        ll.add(8);
        ll.add(7);
        ll.add(9);
        ll.add(19);
        //System.out.println("after sort");
       // Collections.sort(list);
       // System.out.println(list);
        System.out.println(ll);
        Set<Point> treeSet = new TreeSet<>();
        treeSet.add(new Point(2,2));
        treeSet.add(new Point(2,3));
        treeSet.add(new Point(3,3));
        treeSet.add(new Point(4,3));
        treeSet.add(new Point(3,4));
        treeSet.add(new Point(1,1));
        treeSet.forEach((p) -> System.out.println( "(" + p.x + "," +  p.y + ")" ));

    }
}
