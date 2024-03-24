package com.epam.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        //insert
        list.add(75);
        list.add(43);
        list.add(411);
        list.add(23);
        list.add(43);
        System.out.println(list);

        //update
        list.set(2,54);
        list.set(3,null);
        System.out.println(list);

        //delete
        Iterator<Integer>it2=list.iterator();
        while(it2.hasNext()){
            if(it2.next()==null){
                it2.remove();
            }
        }
        System.out.println(list);

        //Traverse using Iterator
        Iterator<Integer>it=list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }




    }
}
