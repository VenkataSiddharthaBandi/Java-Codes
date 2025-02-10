// Program to demonstrate Writing of Files using byte Streams

import java.io.*;

public class FileWritingbytestreams{
    public static void main(String[] args)throws Exception{
        FileOutputStream fout = new FileOutputStream("Siddhartha.txt");
        fout.write((int)'b');
        byte b[] = {56,42,53,64,75};
        fout.write(b);
        fout.close();
    }
}