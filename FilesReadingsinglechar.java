// Program to demonstrate Files and their Functions and Methods in java

import java.io.*;

public class FilesReadingsinglechar{
    public static void main(String[] args)throws Exception{

        // In this program we are using "FileReader" which prints only single character at a time
        FileReader fr = new FileReader("siddhartha1.txt");
        int a;
        while((a=fr.read())!=-1){
            System.out.print((char)a);
            fr.close();
        }
    }
}