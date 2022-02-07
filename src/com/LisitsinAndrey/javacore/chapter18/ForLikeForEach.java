package com.LisitsinAndrey.javacore.chapter18;

import java.util.ArrayList;

public class ForLikeForEach {
    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>();

        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);

        System.out.println("Исходное содержимое спичного массива val: ");
        for (int v: val)
            System.out.print(v + " ");
        System.out.println();

        int sum = 0;
        for(int v: val)
            sum += v;

        System.out.println("Сумма числовых значений: " + sum);

    }
}
