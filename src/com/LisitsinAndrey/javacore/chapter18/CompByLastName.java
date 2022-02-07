package com.LisitsinAndrey.javacore.chapter18;

import java.util.Comparator;

public class CompByLastName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i = o1.lastIndexOf(' ');
        int j = o2.lastIndexOf(' ');
        return o1.substring(i).compareTo(o2.substring(j));
    }

}
