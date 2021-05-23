package com.amit.problemsolving;

import java.util.Arrays;

public class TrainPlatform {

    public static void main(String[] args) {
        int arrival[] = {900,940,950,1100,1500,1800};
        int depature[] = {910, 1200,1120,1130,1900,2000};
        System.out.println( findNumberPlatform(arrival,depature));
    }
    public static  int findNumberPlatform(int[] arrivals, int [] departures) {
        int maxPlatform = 1;
        int i = 1, j = 0;
        int needPlat= 1;
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        for (int arr : arrivals)
            System.out.print(arr +",");
        System.out.println();
        for(int dept: departures)
            System.out.print(dept+",");
        System.out.println();

         while(i < arrivals.length && j < departures.length) {
             System.out.printf("arr:%d dep: %d, plat_to:%d ",arrivals[i],departures[j],maxPlatform);
             System.out.println();
             if(arrivals[i] < departures[j]) {
                 i++;
                 maxPlatform++;
             } else {
                 j++;
                maxPlatform--;
             }
             needPlat = Math.max(needPlat,maxPlatform);
         }
         return needPlat;
    }
}
