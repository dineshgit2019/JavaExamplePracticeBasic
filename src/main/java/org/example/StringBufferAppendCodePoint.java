package org.example;

public class StringBufferAppendCodePoint
{
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("my name is xyz");
        str.append(1);
        System.out.println(str);
        str.appendCodePoint(65);
        System.out.println(str);
        str.appendCodePoint(1);
        System.out.println(str);
        str.appendCodePoint(97);
        System.out.println(str);

    }
}
