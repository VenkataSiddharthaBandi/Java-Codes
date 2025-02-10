// Program to demonstrate Files in java

import java.io.*;

public class FilesMethods{
    public static void main(String[] args){
        File obj = new File("sid.txt");
        System.out.println(obj.exists());
        if(obj.exists() == true){
            System.out.println("This file exists");
            System.out.println(obj.canRead());
        }
            obj.delete();
    }
}