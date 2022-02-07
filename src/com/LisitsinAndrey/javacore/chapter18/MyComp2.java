package com.LisitsinAndrey.javacore.chapter18;

import java.util.TreeSet;

public class MyComp2 {

    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>((str1, str2)-> str2.compareTo(str1));
        ts1.add("C");
        ts1.add("A");
        ts1.add("B");
        ts1.add("E");
        ts1.add("F");
        ts1.add("D");
        for(String element: ts1)
            System.out.print(element +" ");
        System.out.println();
    }
}
