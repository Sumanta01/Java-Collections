package com.epam.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        //create
        linkedHashSet.add(89);
        linkedHashSet.add(64);
        linkedHashSet.add(66);
        linkedHashSet.add(77);
        linkedHashSet.add(64);

        //update
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        //delete

        Iterator<Integer>it= linkedHashSet.iterator();
        while(it.hasNext()){
            if(it.next()==null){
                it.remove();
            }
        }
        System.out.println(linkedHashSet);
    }
}
