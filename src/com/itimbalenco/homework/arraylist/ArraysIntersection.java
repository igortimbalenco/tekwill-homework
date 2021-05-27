package com.itimbalenco.homework.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysIntersection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(5);
        list1.add(11);
        list1.add(12);
        list1.add(15);
        list1.add(18);

        list2.add(5);
        list2.add(6);
        list2.add(12);
        list2.add(14);
        list2.add(16);
        list2.add(17);
        list2.add(18);

        System.out.println(arrayIntersection(list1, list2));

        ArrayList<Integer> lambdaList = (ArrayList<Integer>) list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(lambdaList);

    }

    public static ArrayList<Integer> arrayIntersection(ArrayList<Integer> array1, ArrayList<Integer> array2){
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i)))
                list3.add(array1.get(i));
        }        return list3;
    }
}
