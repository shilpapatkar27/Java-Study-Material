//29 Jan 2023

package com.learning.corejava.Jan_2023;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentinfoDemo
{
    public static void main(String[] args) {
        try   {
            Studentinfo si = new Studentinfo("Kunal",100 , "87978697866");
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }
        catch (Exception e)  {
            System.out.println(e);
        }
    }
}