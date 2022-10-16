package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      String Str="my name is dinesh";
        String []vals= Str.split("[^a-zA-Z0-9']+");
        for (String val : vals)
        {
         System.out.println(val);
        }

    }
}
