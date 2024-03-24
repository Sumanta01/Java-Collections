package com.epam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        //insert
        set.add(876);
        set.add(64);
        set.add(687);
        set.add(64);
        set.add(32);

        // update
        set.add(null);
        System.out.println(set);

        //delete
        Iterator<Integer>it2= set.iterator();
        while (it2.hasNext()){
            if(it2.next()==null){
                it2.remove();
            }
        }
        System.out.println(set);


        //Traverse using Iterator

        Iterator<Integer>it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }



    }

}
