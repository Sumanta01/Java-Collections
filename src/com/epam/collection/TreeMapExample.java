package com.epam.collection;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String>tmp=new TreeMap<>();
        tmp.put(76,"Sumanta");
        tmp.put(43,"Rocky");
        tmp.put(65,"John");
        tmp.put(177,"Smith");
        tmp.put(21,"Alexa");
        System.out.println(tmp);

        //Traverse
        tmp.forEach((key,value)->{
            System.out.println(key+" : "+value);
        });

        //delete
        System.out.println( tmp.remove(65));

        //read
        int key=43;
        String value=tmp.get(key);
        System.out.println(value);


    }
}
