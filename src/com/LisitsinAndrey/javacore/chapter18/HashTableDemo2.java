package com.LisitsinAndrey.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo2 {

    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("Джон Доу", 3434.4d);
        balance.put("Том Смит", 123.4d);
        balance.put("Джейн Бейкер", 514.4d);
        balance.put("Тод Халл", 99.4d);
        balance.put("Ральф Смит", -19.4d);

        Set<String> set = balance.keySet();

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("Джон Доу");
        balance.put("Джон Доу", bal + 1000);
        System.out.println(
                "Новый остаток на счете Джона Доу" + balance.get("Джон Доу"));
    }
}
