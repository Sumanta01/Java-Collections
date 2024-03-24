package com.epam.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<>();
        //insert
        treeSet.add(786);
        treeSet.add(54);
        treeSet.add(40);
        treeSet.add(87);
        treeSet.add(54);
        System.out.println(treeSet);

        //update
        treeSet.add(77);
        System.out.println(treeSet);

        //delete

        treeSet.remove(77);
        System.out.println(treeSet);

        //Traverse
        for(int i:treeSet){
            System.out.print(i+" ");
        }



    }
}
