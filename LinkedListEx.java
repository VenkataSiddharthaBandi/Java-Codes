// Program to demonstrate linked list in java

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Siddhartha");
        list.add("Ajay");
        System.out.println("The size of linked list is: " + list.size());
        list.addFirst("Lokesh");
        list.add(2,"Likith");
        System.out.println("The resultant linked list is: " + list);
        list.remove(2);
        System.out.println("The element at index 1 is: " + list.get(1));
        System.out.println("The last element in the LinkedList is: " + list.getLast());

        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            String s = i.next();
            System.out.println("Hello " + s);
        }
        
    }
}
