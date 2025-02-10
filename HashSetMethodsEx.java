// Program to demonstrate HashSet in java

import java.util.*;

public class HashSetMethodsEx {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<String>();
        System.out.println("names.isEmpty(): " + names.isEmpty());
        names.add("Siddhartha");
        names.add("Gamer");

        if(names.isEmpty()){
            System.out.println("The names HashSet is still empty");
        }
            else{
                System.out.println("names.size(): " + names.size());
            }

        if(names.contains("Gamer")){
            System.out.println(names.remove("Gamer"));
        }

        System.out.println("After deletion the size of names HashSet is: " + names.size());
        names.clear();
        System.out.println("After using clear method the size of names HashSet is: " + names.size());
        System.out.println("After deleting all the HashSet has became empty- " + names.isEmpty());
        
    }
}