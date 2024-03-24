package com.epam.collection;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(76,"Apple");
        hashMap.put(88,"Orange");
        hashMap.put(54,"Mango");
        hashMap.put(32,"Pineapple");
        hashMap.put(88,"Grapes");
        hashMap.put(46,"Apple");
        System.out.println(hashMap);
        //read values
        Collection<String> val=hashMap.values();
        System.out.println(val);
        //read keys
        Set<Integer> set=hashMap.keySet();
        System.out.println(set);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // Traverse in hashMap
        System.out.println("Traversing in HashMap");
        //Using KeySet() and get()
        for(int key:hashMap.keySet()){
            String value=hashMap.get(key);
            System.out.println("Key: "+key+" -:- "+"Value: "+value);

        }
        System.out.println("----------------------");
        //Using entrySet()
        for(Map.Entry<Integer,String>entry:hashMap.entrySet()){
            int key=entry.getKey();
            String vl= entry.getValue();
            System.out.println(key+" : "+vl);
        }
        System.out.println("---------------------------");
        //using forEach()
        hashMap.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
        System.out.println("------------------------------");
        //using Iterator()
        Iterator<Integer>it=hashMap.keySet().iterator();
        while (it.hasNext()){
            int key=it.next();
            String v=hashMap.get(key);
            System.out.println(key+" : "+v);

        }

        //Delete
        System.out.println(hashMap.remove(76));

        //reda particular key

        int item=46;
        String res=hashMap.get(item);
        System.out.println(res);

















    }
}
