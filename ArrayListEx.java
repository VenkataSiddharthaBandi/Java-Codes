// Program to demonstrate Array List in java

import java.util.*;

public class ArrayListEx{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("The array list is Empty: " + list.isEmpty());
        list.add("Siddhartha");
        list.add("Ajay");
        System.out.println("The size of array list is: " + list.size());
        list.add(2,"Likith");
        System.out.println("The resultant array list is: " + list);
        list.remove(2);
        System.out.println("The element at index 1 is: " + list.get(1));
        list.add("Lokesh");

        ListIterator<String> li = list.listIterator();
        while(li.hasNext()){
        String s = li.next();
        System.out.println("Welcome " + s);
        }
    }
}