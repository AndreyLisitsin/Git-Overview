package com.LisitsinAndrey.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.add("Z");
        linkedList.addFirst("A");
        linkedList.add(1,"A2");

        System.out.println("Исходное содержимое списка: " + linkedList);

        linkedList.remove("F");
        linkedList.remove(2);

        System.out.println(
                "Содержимое связанного списка linkedList после удаления" +
                        "первого и последнего элементов: " + linkedList);

        String val = linkedList.get(2);
        linkedList.set(2, val + " изменено");
        System.out.println("Содержимое списка после изменения: " + linkedList);

    }
}
