package com.learning.corejava.Jan_2023;

//22 Jan 2023

/*
 * String is sequence of unicode char.
 * Unicode : Universal code(2 Bytes). Not ASCII(1byte)
 * In java String is a class. String is not a data type.
 *
 */
public class StringBasics {

    public static void main(String[] args) {
        System.out.println("Java\u2122");
        System.out.println("Python\u2122");
        
       
        String s ="Hello";
        String s1 = new String("Hello1");
        System.out.println(s1);
       
        System.out.println("Length :"+s.length());
        System.out.println("char at 0:"+s.charAt(0));
       
        System.out.println("Concat or join two string :"+ (s+s1));
        System.out.println("SubString :"+s.substring(2, 4));
        System.out.println("SubString :"+s.substring(2, 3));

        // Strings are immutable : which does not change.
        // s1 contain hello1 that we can't change it to hello2.
        String s2=s1.substring(0,s1.length()-1)+"2";
        System.out.println("New string s2:"+s2);
        
        String s3=s1.substring(0,s1.length()-2)+"2";
        System.out.println("New string s3:"+s3);
       
        // Traval the string
        for(int i=0;i<s.length();i++) {
            System.out.println(s.charAt(i));
        }
        // for with string require conversion to char array.
        for(char i:s.toCharArray()) {
            System.out.println(i);
        }                
    }

}