package com.LisitsinAndrey.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double> ();
        // вве сти элементы в хеш-отображение
        hm.put ( " Джoн Доу " , new Double(3434.34));
        hm.put ( "Toм Смит ", new Double( 123.22));
        hm.put ( "Джейн Бейкер ", new Double(1378.00));
        hm.put ( " Toд Холл", new Double(99.22));
        hm.put ( " Paль ф Смит", new Double(-19.08));
        // получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet() ;
        // вывести множество записей
        for (Map.Entry<String, Double> me : set ) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
            System.out.println() ;
            // внести сумму 1000 на счет Джона Доу
            double balance = hm.get("Джoн Доу" );
            hm.put("Джoн Доу", balance + 1000) ;
            System.out.println(" Hoвый остаток на счете Джона Доу : " +
                    hm.get( "Джoн Доу" ) );
        }
}
