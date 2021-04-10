package com.example.demo;


import java.util.*;

public class HashMapSortByValue {
    public static void main(String arg[]){
        HashMap map=new HashMap();
        map.put(1,"guna");
        map.put(3,"AA");
        map.put(0,"bbb");
        Set<Map.Entry> entrySet=map.entrySet();
     //   List ll=   Collections.singletonList(entrySet);
     //   Collections.sort(ll,new EntrySetComp());

        List ll = new ArrayList<Map.Entry> (map.entrySet());
        Collections.sort(ll,new EntrySetComp());
        System.out.println("ll="+ll);
    }

}
class EntrySetComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Map.Entry s1=(Map.Entry)o1;
        Map.Entry s2=(Map.Entry)o2;
       String v1= (String)s1.getValue();
        String v2= (String)s2.getValue();
        return v1.compareTo(v2);
    }
}
