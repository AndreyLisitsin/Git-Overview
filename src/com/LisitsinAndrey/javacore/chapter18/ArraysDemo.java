package com.LisitsinAndrey.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i< 10; i++)
            array[i]=-3*i;
        System.out.println("Исходный массив: ");
        display(array);

        Arrays.sort(array);
        System.out.println("Остортрованный массив: ");
        display(array);

        Arrays.fill(array, 2,6,-1);
        System.out.println("Массив послк вывода метода fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("Maccив после повторной сортировки: ");
        display(array);

        System.out.print("Знaчeниe -9 находи тся на позиции ");
        int index =
                Arrays.binarySearch(array, - 9 ) ;
        System.out.println(index);

    }

    static void display(int array[]){
        for(int i: array)
            System.out.print(i+" ");
        System.out.println();
    }
}
