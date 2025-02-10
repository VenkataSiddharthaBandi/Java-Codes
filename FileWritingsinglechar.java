// Program to demonstrate Writing of data into a File in java

import java.io.*;

public class FileWritingsinglechar{
    public static void main(String[] args)throws Exception{
        FileWriter fw = new FileWriter("Sample.txt");
        fw.write((int)'d');
        fw.close();
    }
}