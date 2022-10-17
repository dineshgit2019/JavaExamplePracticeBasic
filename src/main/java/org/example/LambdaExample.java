package org.example;

import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {
       // sol1
        ArrayList l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.forEach(n-> System.out.println(n));

        //sol2
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
   l2.forEach(n-> System.out.println(n));
   //sol3
        for (Integer n: l2) {
            System.out.println(n.intValue());
        }


        System.out.println("example end");
    }
}
