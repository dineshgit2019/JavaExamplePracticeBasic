package org.example;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

import  static java.util.stream.Collectors.toConcurrentMap;
import  static java.util.stream.Collectors.toList;
import  static java.util.stream.Collectors.toMap;


public class CollectorsExample {

    public static void main(String[] args) {
        List<Integer> l1 = (List<Integer>) Arrays.asList(1,2,3,4);
        System.out.println(l1);
        List <Integer>l2= l1.stream().collect(toList());
        System.out.println(l2);

        Set<Integer> collectSet = l1.stream().collect(toSet());
        System.out.println(collectSet);
        System.out.println("toSet Example");
        for (Integer i : collectSet
             ) {
            System.out.println(i);
        }
        System.out.println("Map Example");
        LinkedList<String> ll=new LinkedList<>();
        ll.add("dinesh");
        ll.add("din");
        Map<String, Integer> result = (Map<String, Integer>) ll.stream()
                .collect(toMap(Function.identity(), String::length, (item, identicalItem) -> item));
        System.out.println(result);

    }
}
