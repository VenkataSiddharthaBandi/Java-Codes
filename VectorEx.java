// Program to demonstrate Vectors in java

import java.util.*;

public class VectorEx {
    public static void main(String[] args){
        Vector<String> v = new Vector<String>(4,2);
        System.out.println("The vector capacity at starting is: " + v.capacity());
        v.add("a");
        v.add("b");
        v.add("d");
        v.add("e");
        System.out.println("After adding upto 4 elements the vector capacity will be: " + v.capacity());
        v.add("f");
        System.out.println("After adding more than 4 elements the vector capacity will becomes: " + v.capacity());
        System.out.println("The first element of vector is: " + v.firstElement());
        System.out.println("The last element of vector is: " + v.lastElement());
        System.out.println("The element at index 3 is: " + v.indexOf("f"));

        Enumeration<String> e = v.elements();
        while(e.hasMoreElements()){
            String s = e.nextElement();
            System.out.println("This is " + s);
        }
    }
}
