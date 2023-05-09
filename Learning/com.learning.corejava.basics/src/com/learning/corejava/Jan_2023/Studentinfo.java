//29 Jan 2023

package com.learning.corejava.Jan_2023;

import java.io.*;
class Studentinfo implements Serializable
{
    String name;
    int rollNo;
    static String contact;
    public Studentinfo(String n, int r, String c) {
        this.name = n;
        this.rollNo = r;
        this.contact = c;
    }
}
