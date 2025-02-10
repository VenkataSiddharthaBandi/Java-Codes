// Program to demonstrate Printing all HashSet elements and using for each loop

import java.util.*;

public class HashSetUsingForEachLoop {
    public static void main(String[] args){
         // Printing all elements or objects present in the HashSet
        HashSet<String> names = new HashSet<String>();
        names.add("Siddhartha");
        names.add("Ajay");
        names.add("Lokesh");
        System.out.println(names);

        // Using For Each loop
        for(String n : names){
            System.out.println("Welcome " + n);
        }
    }
}
