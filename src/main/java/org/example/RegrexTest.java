package org.example;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegrexTest {
    public  static  void main(String []args)
    {
        System.out.println("hello this is example test");
        System.out.println(Pattern.matches("din*akh","din12akh"));

        Pattern pattern = Pattern.compile(":");
        Matcher matcher = pattern.matcher("geeksforgeeks");
        while(matcher.find()) {
            System.out.println("matcher: " + "start: " + matcher.start() + "end:" + matcher.end());
        }
        String []str= pattern.split("A:B:C:D");
        for (String st: str
             ) {
            System.out.println(st);
        }

    }
}
