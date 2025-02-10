import java.util.*;

public class HashSetUSingIterator{
    public static void main(String[] args){
        HashSet<String> names = new HashSet<String>();
        names.add("Siddhartha");
        names.add("Ajay");
        names.add("Lokesh");
        System.out.println(names);

        Iterator<String> newnames = names.iterator();
        while(newnames.hasNext()){
        String n = newnames.next();
        System.out.println("Welcome " + n);
        }
    }
}