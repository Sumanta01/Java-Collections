package com.epam.collection;

import com.sun.source.tree.LiteralTree;

import java.net.Inet4Address;
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> ve=new Vector<>();
        //insert
        ve.add(87);
        ve.add(775);
        ve.add(675);
        ve.add(76);
        ve.add(43);
        System.out.println(ve);

        //Update

        ve.set(3,null);
        System.out.println(ve);

        //Delete
        Iterator<Integer>it=ve.iterator();
        while(it.hasNext()){
            if(it.next()==null){
                it.remove();
            }
        }
        System.out.println(ve);

        // Traverse using Enumeration
        Enumeration<Integer>en= ((Vector<Integer>) ve).elements();
        while (en.hasMoreElements()){
            System.out.print(en.nextElement()+" ");
        }






    }
}
