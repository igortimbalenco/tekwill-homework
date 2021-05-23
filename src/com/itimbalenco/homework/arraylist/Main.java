package com.itimbalenco.homework.arraylist;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Red");
        arrayList.add("Yellow");

        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("White");
        arrayList2.add("Black");
        arrayList2.add("Pink");
        arrayList2.add("Orange");
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("White");
        arrayList3.add("Black");
        arrayList3.add("Pink");
        arrayList3.add("Orange");


        arrayList.addAll(arrayList2);

        System.out.println(arrayList);


        System.out.println(arrayEquals(arrayList2, arrayList3));
        arrayList3.add("unknowncolour");
        System.out.println(arrayEquals(arrayList2, arrayList3));

        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("Trees");
        arrayList4.add("Apple");
        arrayList4.add("Bananas");

        capitalizaPlurals(arrayList4);
        System.out.println(arrayList4);


    }

    public static ArrayList<Boolean> arrayEquals(ArrayList<String> arra1, ArrayList<String> arra2){
        ArrayList<Boolean> bool = new ArrayList<>();

            if (arra1.size() >= arra2.size()){
                for (int i = 0; i < arra1.size(); i++) {
                    try{
                        bool.add(arra1.get(i).equals(arra2.get(i)));
                    } catch (IndexOutOfBoundsException e){
                        bool.add(false);
                    }

                }
            }
            else {
                for (int i = 0; i < arra2.size(); i++) {
                    try{
                        bool.add(arra1.get(i).equals(arra2.get(i)));
                    } catch (IndexOutOfBoundsException e){
                        bool.add(false);
                    }

                }
            }

        return bool;
    }

    public static void capitalizaPlurals(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).endsWith("s"))
                list.set(i, list.get(i).toUpperCase());
        }
    }
}
