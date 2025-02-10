// Program to demonstrate file reading with only bites

import java.io.*;

public class FileReadingbytestreams{
    public static void main(String[] args)throws Exception{
        FileInputStream finp = new FileInputStream("Siddhartha.txt");
        System.out.println((char)finp.read());
        finp.close();
    }
}