// Program to demonstrate Hashtable in java
// Note: Hashtable follows Synchronization

import java.util.*;

public class HashTableEx {
    public static void main(String[] args){
        Hashtable<String,String> lang = new Hashtable<String,String>();
        lang.put("Fl","Telugu");
        lang.put("Sl"," Hindi");
        lang.put("Tl","English");
        if(lang.isEmpty()){
            System.out.println("The list is still empty");
        }
        else{
            System.out.println("The size of Hash Map is : " + lang.size());
        }
        System.out.println("The keys present in this Hashtable are : " + lang.keySet());
        System.out.println("The values present in this Hashtable are : " + lang.values());
        System.out.println("The value of Fl is : " + lang.get("Fl"));
        System.out.println("The key value pairs present in this Hashtable are : " + lang.entrySet());
        System.out.println("Is Sl key available in the given Hashtable? : " + lang.containsKey("Sl"));
        System.out.println("Is English value available in the given Hashtable? : " + lang.containsValue("English"));
    }
}
