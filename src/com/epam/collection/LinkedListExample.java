package com.epam.collection;

import javax.swing.*;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        //insert elements
        linkedList.add(73);
        linkedList.add(65);
        linkedList.add(654);
        linkedList.add(45);
        linkedList.add(87);
        System.out.println(linkedList);

        //update elements
        linkedList.set(3,null);
        System.out.println(linkedList);

        //Delete
        Iterator<Integer>it=linkedList.iterator();
        while(it.hasNext()){
            if(it.next()==null){
                it.remove();
            }
        }
        System.out.println(linkedList);

        //Traverse
        for(int i:linkedList){
            System.out.print(i+" ");
        }



    }

}