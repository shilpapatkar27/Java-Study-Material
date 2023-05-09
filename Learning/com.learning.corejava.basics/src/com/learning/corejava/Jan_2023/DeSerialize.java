//29 Jan 2023

package com.learning.corejava.Jan_2023;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize
{
    public static void main(String[] args)  {
        Studentinfo si=null ;
        try   {
            FileInputStream fis = new FileInputStream("student1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (Studentinfo)ois.readObject();
        }
        catch (Exception e)         {
            e.printStackTrace(); }
            System.out.println(si.name);
            System.out. println(si.rollNo);
            System.out.println(si.contact);
        }
}