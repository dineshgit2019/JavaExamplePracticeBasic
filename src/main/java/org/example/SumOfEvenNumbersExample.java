package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfEvenNumbersExample {
    public static void main(String[] args) {
        ArrayList<Integer> slist = new ArrayList<Integer>();
        int min =1;
        int max = 1000;

        for (int i=min;i<=max;i++)
        {
            slist.add(i);
        }
        //collection solution for this problem
        ArrayList<Integer> evenList= new ArrayList<Integer>();
        for (Integer i: slist
             ) {
            if(i%2==0){
                evenList.add((int) Math.sqrt(i));
            }
        }
        //stream solution
        Stream<Integer> stream = slist.stream();
       // List<Double> result = stream.filter(i -> i % 2 == 0).map(i -> Math.sqrt(i)).collect(Collectors.toList());
        List<Integer> result1 =  stream.filter(integer -> integer%2==0).collect(Collectors.toList());

        System.out.println(result1);

    }
}
