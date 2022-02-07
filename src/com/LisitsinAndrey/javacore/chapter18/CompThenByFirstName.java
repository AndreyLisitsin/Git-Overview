package com.LisitsinAndrey.javacore.chapter18;
import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
