package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);

        Iterator<Integer> iterator = l1.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());

        }


    }
}
