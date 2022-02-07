package com.LisitsinAndrey.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(-8);
        list.add(20);
        list.add(-20);
        list.add(8);

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(list, r);

        System.out.println("Список отсортирован в обратном порядке: ");
        for(int i: list)
            System.out.print(i+" ");
        System.out.println();

        Collections.shuffle(list);

        System.out.println("Список перетасован: ");

        for(int i: list)
            System.out.print(i+" ");
        System.out.println();

        System.out.println("Минимум: " + Collections.min(list));
        System.out.println("Максимум: "+ Collections.max(list));
    }
}
