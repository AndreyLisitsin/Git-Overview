package com.LisitsinAndrey.javacore.chapter18;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList <Address> ml = new LinkedList <Address >() ;
        // ввести элеме нты в связный список
        ml.add ( new Address ( " J.W.West ", "11Oak Ave",
                "Urbana " , " IL " , "б1801 " ) );
        ml.add ( new Address ( " Ralph Baker" , "1142 Maple Lane",
                "Mahome t ", "IL", "61853 " ) );
        ml.add ( new Address ( " Tom Carlton " , "867 Elm St",
                "Champaign " , " IL " , " 61820 " ) );
        // вывести список почтовых адресов
        for(Address element : ml )
        System.out.println(element + " \n " ) ;
        System.out.println();

        // Применение компаратора
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String element: ts)
            System.out.print(element +" ");
        System.out.println();

        // компаратор с лямбдой
        TreeMap<String, Double> tm = new TreeMap<>((str1, str2) -> {
            int k = str1.substring(str1.lastIndexOf(' '))
                    .compareToIgnoreCase(str2.substring(str2.lastIndexOf(' ')));
            if(k==0)
                return str1.compareTo(str2);
            else return k;
        });

        tm.put("Джон Доу", 3434.4d);
        tm.put("Том Смит", 123.4d);
        tm.put("Джейн Бейкер", 514.4d);
        tm.put("Тод Халл", 99.4d);
        tm.put("Ральф Смит", -19.4d);

        for(Map.Entry<String, Double> entry: tm.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }


    }

}
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String с, String st, String cd) {
        name = n;
        street = s;
        city = с;
        state = st;
        code = cd;
    }

        public String toString() {
            return name + " \n" + street +"\n" + city + " " + state + " " + code;

        }
    }

