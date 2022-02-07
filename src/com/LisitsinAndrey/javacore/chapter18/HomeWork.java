package com.LisitsinAndrey.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {

    public static int[] SumOfTowElements(int[]array, int number){
        int[] finalarray = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< array.length; i++){
            map.put(array[i], i);
            if(map.containsKey(number - array[i])){
                finalarray[0]=map.get(number - array[i]);
                finalarray[1]=map.get(array[i]);
                break;
            }
        }
        for(int i = 0; i< finalarray.length; i++)
            System.out.println(finalarray[i]);
        return finalarray;
    }

    public void someduplicate(int[]a){
        Map<Integer, Integer> integerMap = new HashMap<>();

        for(int i =0; i< a.length; i++) {
            if(integerMap.containsKey(a[i]))
                integerMap.replace(a[i], integerMap.get(a[i])+1);
            else
            integerMap.put(a[i], 1);
        }

        for(Map.Entry<Integer, Integer> entry: integerMap.entrySet()) {
            if (entry.getValue() > 1)
               System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
