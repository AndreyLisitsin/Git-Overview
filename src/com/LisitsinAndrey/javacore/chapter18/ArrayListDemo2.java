package com.LisitsinAndrey.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<Integer> ();
        // ввести элементы в списочный массив
        ali.add(1) ;
        ali.add(2) ;
        ali.add(3) ;
        ali.add (4) ;
        System . out . println ( " Coдepжимoe списочного массива al : "+ ali ) ;
// получить обычный массив
        Integer[] ia = new Integer[ali.size()];
        ia = ali.toArray (ia) ;
        int sum =0;
        // суммировать элементы массива
        for ( int i : ia) sum += i;
        System.out.println ( "Сумма : " + sum) ;
    }
}
