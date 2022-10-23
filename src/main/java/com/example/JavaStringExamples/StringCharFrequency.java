package com.example.JavaStringExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCharFrequency {

    public static void main(String[] args) {

        String str="my name is string, count char inside me";
        char []chstr = str.toCharArray();
        HashMap<Character, Integer> hashMap= new HashMap<>();

        for (char ch: chstr
             ) {
            hashMap.put(ch ,(hashMap.getOrDefault(ch,0)+1));

        }
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (Map.Entry entry:entries
             ) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }



}
